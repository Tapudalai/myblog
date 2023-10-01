package com.myvlog2.erviceimpl;

import com.myvlog2.entity.Test;
import com.myvlog2.payload.TestDto;
import com.myvlog2.reposiroty.TestRepository;
import com.myvlog2.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    private TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository){
        this.testRepository=testRepository;
    }
    @Override
    public TestDto saveTest(TestDto testDto) {
        Test test=new Test();
       test.setName(testDto.getName());
       test.setCity(testDto.getCity());
        Test saveTest=testRepository.save(test);

        TestDto dto=new TestDto();
        dto.setId(saveTest.getId());
        dto.setName(saveTest.getName());
       dto.setCity(saveTest.getCity());


        return dto;
    }


}
