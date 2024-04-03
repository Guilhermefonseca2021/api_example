package br.com.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/planets")
public class PlanetController {
    // @GetMapping("/{id}")
    // public void getPlanets(@PathVariable String id) {
    // }
    @GetMapping()
    public void getPlanets(@PathVariable String id) {

    }
}
