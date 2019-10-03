package com.s3curitybug.jackson.databind.cves;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Database {

    private static List<Film> films = new ArrayList<>();

    public List<Film> getFilms() {
        return films;
    }

    public void saveFilm(
            Film film) {

        for (int i = 0; i < films.size(); i++) {
            if (films.get(i).getName().equals(film.getName())) {
                films.set(i, film);
                return;
            }
        }

        films.add(film);

    }

}
