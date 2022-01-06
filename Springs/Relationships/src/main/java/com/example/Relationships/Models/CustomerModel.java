package com.example.Relationships.Models;

import com.example.Relationships.Entities.ItemEntity;

public class CustomerModel {

    private Long id;
    private String name;
    private ItemModel itemModel;

    public CustomerModel() {
    }

    public CustomerModel(Long id, String name, ItemModel itemModel) {
        this.id = id;
        this.name = name;
        this.itemModel = itemModel;
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

    public ItemModel getItemModel() {
        return itemModel;
    }

    public void setItemModel(ItemModel itemModel) {
        this.itemModel = itemModel;
    }
}
