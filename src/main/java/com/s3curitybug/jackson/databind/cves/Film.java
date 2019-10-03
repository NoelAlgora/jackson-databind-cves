package com.s3curitybug.jackson.databind.cves;

import java.util.HashMap;

public class Film {

    private String name;

    private HashMap<String, Object> metadata;

    public String getName() {
        return name;
    }

    public void setName(
            String name) {
        this.name = name;
    }

    public HashMap<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(
            HashMap<String, Object> metadata) {
        this.metadata = metadata;
    }

}
