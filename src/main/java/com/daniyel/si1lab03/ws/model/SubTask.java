package com.daniyel.si1lab03.ws.model;

/**
 * Created by Daniyel on 29/01/2017.
 */
public class SubTask {

    private long id;

    private String title;
    private boolean isDone;

    public SubTask() {
    }

    public SubTask(long id, String title, boolean isDone) {
        this.id = id;
        this.title = title;
        this.isDone = isDone;
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

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
