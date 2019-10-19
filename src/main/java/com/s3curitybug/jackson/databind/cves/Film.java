package com.s3curitybug.jackson.databind.cves;

import java.util.HashMap;

public class Film {

    private String title;

    private String director;

    private String protagonist;

    private HashMap<String, Object> additionalData;

    public String getTitle() {
        return title;
    }

    public void setTitle(
            String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(
            String director) {
        this.director = director;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(
            String protagonist) {
        this.protagonist = protagonist;
    }

    public HashMap<String, Object> getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(
            HashMap<String, Object> additionalData) {
        this.additionalData = additionalData;
    }

}
