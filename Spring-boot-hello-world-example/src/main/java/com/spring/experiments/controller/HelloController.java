package com.spring.experiments.controller;

import com.spring.experiments.model.Notebook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

/**
 * Created by shaiverm on 19-Nov-2015
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/notebook/java")
    public Notebook getNotebook () {
        Notebook notebook = new Notebook();
        notebook.setAuthor("Vermaji");
        notebook.setCreatedOn(new Date(new java.util.Date().getTime()));
        notebook.setId(1L);
        notebook.setName("Java8");
        notebook.setDescription("New features from Java8");
        return notebook;
    }

}
