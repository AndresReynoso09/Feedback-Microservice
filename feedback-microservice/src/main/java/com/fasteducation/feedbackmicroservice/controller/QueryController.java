package com.fasteducation.feedbackmicroservice.controller;

import com.fasteducation.feedbackmicroservice.entity.QueryEntity;
import com.fasteducation.feedbackmicroservice.repository.QueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback/query")

public class QueryController {

    @Autowired
    private QueryRepository queryRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<QueryEntity> getAllQueries(){
        return queryRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createQuery(@RequestBody QueryEntity queryEntity){
        queryRepository.save(queryEntity);
    }
}
