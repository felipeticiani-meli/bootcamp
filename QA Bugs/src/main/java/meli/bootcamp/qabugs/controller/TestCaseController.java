package meli.bootcamp.qabugs.controller;

import meli.bootcamp.qabugs.model.TestCase;
import meli.bootcamp.qabugs.service.ITestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {

    @Autowired
    private ITestCaseService service;

    @PostMapping("/new")
    public ResponseEntity<TestCase> createTest(@RequestBody TestCase newTest) {
        if (newTest.getIdCase() != null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createTest(newTest));
    }

    @GetMapping
    public ResponseEntity<List<TestCase>> getAllTests(@RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        if(date != null) {
            if (date.isAfter(LocalDate.now())) {
                return ResponseEntity.badRequest().build();
            }
            return ResponseEntity.ok(service.getByAfterDate(date));
        }
        return ResponseEntity.ok(service.getAllTests());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestCase> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TestCase> updateTest(@PathVariable Long id, @RequestBody TestCase test) {
        test.setIdCase(id);
        return ResponseEntity.ok(service.updateTest(test));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTest(@PathVariable Long id) {
        service.deleteTest(id);
        return ResponseEntity.noContent().build();
    }

}
