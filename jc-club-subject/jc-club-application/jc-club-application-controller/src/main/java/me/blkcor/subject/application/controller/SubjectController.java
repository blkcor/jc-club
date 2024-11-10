package me.blkcor.subject.application.controller;

import jakarta.annotation.Resource;
import me.blkcor.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SubjectController {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @GetMapping("test")
    public String test(){
        return subjectCategoryService.queryById(1L).getCategoryName();
    }
}
