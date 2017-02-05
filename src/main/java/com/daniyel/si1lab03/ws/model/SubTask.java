package com.daniyel.si1lab03.ws.model;

import javax.persistence.*;

/**
 * Created by Daniyel on 29/01/2017.
 */

@Entity
public class SubTask {

    @Id
    @Column(name="subtask_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="is_completed", nullable = false)
    private boolean isCompleted;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    public SubTask() {
    }

    public SubTask(Long id, String title, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
