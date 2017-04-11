package org.lightadmin.boot.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id private Long id;
    @Column private String name;

    public Item() {}
    public Item(Long id, String name, String country) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}