package meli.bootcamp.qabugs.service;

import meli.bootcamp.qabugs.model.TestCase;
import meli.bootcamp.qabugs.repository.ITestCaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TestCaseService implements ITestCaseService {
    @Autowired
    private ITestCaseRepo repo;

    @Override
    public TestCase createTest(TestCase newTest) {
        if (newTest.getIdCase() != null) return null; // TODO: throw exception
        return repo.save(newTest);
    }

    @Override
    public List<TestCase> getAllTests() {
        List<TestCase> tests = new ArrayList<>();
        repo.findAll().forEach(tests::add);
        return tests;
    }

    @Override
    public TestCase getById(Long id) {
        Optional<TestCase> test = repo.findById(id);
        if (test.isEmpty()) return null; // TODO: throw exception
        return test.get();
    }

    @Override
    public TestCase updateTest(TestCase test) {
        TestCase foundTest = this.getById(test.getIdCase());
        return repo.save(test);
    }
}
