package com.ge.hibernate.entities;

import javax.persistence.*;

@Entity
@Table(name = "notepads")
public class Notepad {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;

    @ManyToOne
    private Backpack backpack;

    public Notepad(){}

    public Notepad(long id, String title) {
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
