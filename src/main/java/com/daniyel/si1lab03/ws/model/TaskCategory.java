package com.daniyel.si1lab03.ws.model;

/**
 * Created by Daniyel on 29/01/2017.
 */
public class TaskCategory {

    private long id;
    private String title;

    public TaskCategory() {
    }

    public TaskCategory(long id, String titulo) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
