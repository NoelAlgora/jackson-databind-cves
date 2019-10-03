package com.s3curitybug.jackson.databind.cves;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Api {

    @Autowired
    private Database database;

    @RequestMapping(method = RequestMethod.GET, value = "/api/films")
    public List<Film> get() {

        List<Film> films = database.getFilms();

        return films;

    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/films")
    public Film post(
            @RequestBody String body)
            throws JsonProcessingException, IOException {

        ObjectMapper objectMapper = new ObjectMapper().enableDefaultTyping();

        Film film = objectMapper.readValue(body, Film.class);

        database.saveFilm(film);

        return film;

    }

}
