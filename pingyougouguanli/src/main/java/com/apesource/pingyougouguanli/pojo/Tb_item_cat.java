package com.apesource.pingyougouguanli.pojo;

import java.io.Serializable;

public class Tb_item_cat implements Serializable {
    private int id;
    private int parentId;
    private String name;
    private int typeId;

    public Tb_item_cat() {
    }

    public Tb_item_cat(int id, int parentId, String name, int typeId) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.typeId = typeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Tb_item_cat{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", typeId=" + typeId +
                '}';
    }
}
