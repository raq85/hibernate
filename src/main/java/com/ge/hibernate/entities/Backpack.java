package com.ge.hibernate.entities;

import javax.persistence.*;
import java.util.List;

@Entity(name = "backpacks")
@Table(name = "backpacks")
public class Backpack {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String brand;

    @OneToMany(mappedBy = "backpack")
    private List<Notepad> notepads;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
