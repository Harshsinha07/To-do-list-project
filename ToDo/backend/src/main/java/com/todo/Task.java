package com.todo;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks") // Specifies the database table name
public class Task {

    @Id // Marks the primary key field
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremented ID
    private Long id;

    private String title; // Task title
    private boolean completed; // Task completion status

    // No-argument constructor required by JPA
    public Task() {
    }

    // Parameterized constructor for easy object creation
    public Task(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    // Getter and Setter for 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for 'title'
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for 'completed'
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
