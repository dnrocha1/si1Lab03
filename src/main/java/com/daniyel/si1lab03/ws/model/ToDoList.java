package com.daniyel.si1lab03.ws.model;

import java.util.List;

/**
 * Created by Daniyel on 31/01/2017.
 */
public class ToDoList {
    private long id;
    private String title;
    private List<Task> tasks;

    public ToDoList() {
    }

    public ToDoList(long id, String title, List<Task> tasks) {
        this.id = id;
        this.title = title;
        this.tasks = tasks;
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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
