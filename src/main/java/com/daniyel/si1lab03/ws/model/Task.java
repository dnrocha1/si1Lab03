package com.daniyel.si1lab03.ws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Daniyel on 29/01/2017.
 */

@Entity
public class Task {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private boolean isDone;
    private String description;
    private List<SubTask> subTasks;
    private TaskPriority taskPriority;

    private TaskCategory taskCategory;

    public Task() {
    }

    public Task(long id, String title, boolean isDone, String description, List<SubTask> subTasks,
                TaskPriority taskPriority, TaskCategory taskCategory) {
        this.id = id;
        this.title = title;
        this.isDone = isDone;
        this.description = description;
        this.subTasks = subTasks;
        this.taskPriority = taskPriority;
        this.taskCategory = taskCategory;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public TaskCategory getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(TaskCategory taskCategory) {
        this.taskCategory = taskCategory;
    }
}
