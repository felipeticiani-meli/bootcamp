package meli.bootcamp.qabugs.service;

import meli.bootcamp.qabugs.model.TestCase;

import java.util.List;

public interface ITestCaseService {
    TestCase createTest(TestCase newTest);
    List<TestCase> getAllTests();
    TestCase getById(Long id);
    TestCase updateTest(TestCase test);
}
