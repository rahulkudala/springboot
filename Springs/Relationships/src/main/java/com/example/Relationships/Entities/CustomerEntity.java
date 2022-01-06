package com.example.Relationships.Entities;

import javax.persistence.*;

@Entity
@Table
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private ItemEntity itemEntity;


    public CustomerEntity() {
    }

    public CustomerEntity(String name)
    {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemEntity getItemEntity() {
        return itemEntity;
    }

    public void setItemEntity(ItemEntity itemEntity) {
        this.itemEntity = itemEntity;
    }

    public CustomerEntity(Long id, String name, ItemEntity itemEntity) {
        this.id = id;
        this.name = name;
        this.itemEntity = itemEntity;
    }
}

