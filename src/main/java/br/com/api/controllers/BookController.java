package br.com.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/books")
public class BookController {
    // @GetMapping("/{id}")
    // public void getBooks(@PathVariable String id) {
    // }
    @GetMapping()
    public void getBooks(@PathVariable String id) {

    }
}
