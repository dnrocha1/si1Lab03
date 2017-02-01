package com.daniyel.si1lab03.ws.model;

import javax.persistence.*;

/**
 * Created by Daniyel on 29/01/2017.
 */

@Entity
public class TaskCategory {

    @Id
    @Column(name = "task_category_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="title", nullable = false)
    private String title;

    public TaskCategory() {
    }

    public TaskCategory(Long id, String titulo) {
        this.id = id;
        this.title = title;
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
}
