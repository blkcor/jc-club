package me.blkcor.subject.application.controller;

import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j2;
import me.blkcor.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log4j2
public class SubjectController {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @GetMapping("/test")
    public String test(){
        log.info("hello log4j2");
        return subjectCategoryService.queryById(1L).getCategoryName();
    }
}
