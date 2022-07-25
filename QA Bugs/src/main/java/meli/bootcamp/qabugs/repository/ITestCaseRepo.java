package meli.bootcamp.qabugs.repository;

import meli.bootcamp.qabugs.model.TestCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ITestCaseRepo extends CrudRepository<TestCase, Long> {
    List<TestCase> findByLastUpdateGreaterThanEqual(LocalDate date);
    List<TestCase> findByTestedTrue();
    List<TestCase> findByPassedTrue();
}
