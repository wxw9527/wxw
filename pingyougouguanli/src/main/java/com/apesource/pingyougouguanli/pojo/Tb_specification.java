package com.apesource.pingyougouguanli.pojo;

import java.io.Serializable;

public class Tb_specification implements Serializable {
    private int id;
    private String specName;

    public Tb_specification() {
    }

    public Tb_specification(int id, String specName) {
        this.id = id;
        this.specName = specName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    @Override
    public String toString() {
        return "Tb_specification{" +
                "id=" + id +
                ", specName='" + specName + '\'' +
                '}';
    }
}
