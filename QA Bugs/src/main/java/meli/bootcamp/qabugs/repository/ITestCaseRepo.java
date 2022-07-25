package meli.bootcamp.qabugs.repository;

import meli.bootcamp.qabugs.model.TestCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestCaseRepo extends CrudRepository<TestCase, Long> {
}
