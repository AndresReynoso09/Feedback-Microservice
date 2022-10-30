package com.fasteducation.feedbackmicroservice.controller;

import com.fasteducation.feedbackmicroservice.entity.ForumEntity;
import com.fasteducation.feedbackmicroservice.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback/forum")

public class ForumController {

    @Autowired
    private ForumRepository forumRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ForumEntity> getAllForums(){
        return forumRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createForum(@RequestBody ForumEntity forumEntity){
        forumRepository.save(forumEntity);
    }
}
