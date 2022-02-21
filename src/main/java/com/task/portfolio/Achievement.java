package com.task.portfolio;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "achievements")
public class Achievement {
    @Id
    private String id;
    private String name;
    private String text;

    public Achievement(String id, String name,String text) {
        this.id = id;
        this.name = name;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Achievement [id=" + id + ", name=" + name + ", text=" + text + "]";
    }
}
