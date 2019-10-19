package com.s3curitybug.jackson.databind.cves;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/films")
public class FilmsApi {

    private static Map<String, Film> films = new HashMap<>();

    @GetMapping("")
    public Map<String, Film> get() {

        return films;

    }

    @GetMapping("/{id}")
    public Map<String, Film> get(
            @PathVariable("id") String id) {

        return Collections.singletonMap(id, films.get(id));

    }

    @PostMapping("")
    public Map<String, Film> post(
            @RequestBody Film film) {

        String id = UUID.randomUUID().toString();
        films.put(id, film);
        return Collections.singletonMap(id, film);

    }

    @PostMapping("/{id}")
    public Map<String, Film> post(
            @PathVariable("id") String id,
            @RequestBody Film film) {

        films.put(id, film);
        return Collections.singletonMap(id, film);

    }

    @DeleteMapping("/{id}")
    public Map<String, Film> delete(
            @PathVariable("id") String id) {

        Film film = films.remove(id);
        return Collections.singletonMap(id, film);

    }

}
