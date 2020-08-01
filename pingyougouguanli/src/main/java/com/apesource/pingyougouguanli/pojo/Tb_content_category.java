package com.apesource.pingyougouguanli.pojo;

import java.io.Serializable;

public class Tb_content_category implements Serializable {
    private  int id;
    private String name;

    public Tb_content_category() {
    }

    public Tb_content_category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tb_content_category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
