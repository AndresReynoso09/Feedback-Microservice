package com.fasteducation.feedbackmicroservice.controller;

import com.fasteducation.feedbackmicroservice.entity.ResponseEntity;
import com.fasteducation.feedbackmicroservice.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback/response")

public class ResponseController {

    @Autowired
    private ResponseRepository responseRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ResponseEntity> getAllResponses(){
        return responseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createResponse(@RequestBody ResponseEntity responseEntity){
        responseRepository.save(responseEntity);
    }
}
