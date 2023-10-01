package com.myvlog2.controller;

import com.myvlog2.payload.TestDto;
import com.myvlog2.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/test")
public class TestController {
    private TestService testService;

    public TestController(TestService testService) {

        this.testService = testService;
    }
    //http://localhost:8080/api/test
    @PostMapping
    public ResponseEntity<TestDto> saveTest(@RequestBody TestDto testDto) {
        TestDto dto = TestService.saveTest(testDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

}


}
