package com.apesource.pingyougouguanli.pojo;

import java.io.Serializable;

public class Tb_type_template implements Serializable {
    private int id;
    private String name;
    private String specIds;
    private String brandIds;

    public Tb_type_template() {
    }

    public Tb_type_template(int id, String name, String specIds, String brandIds) {
        this.id = id;
        this.name = name;
        this.specIds = specIds;
        this.brandIds = brandIds;
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

    public String getSpecIds() {
        return specIds;
    }

    public void setSpecIds(String specIds) {
        this.specIds = specIds;
    }

    public String getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(String brandIds) {
        this.brandIds = brandIds;
    }

    @Override
    public String toString() {
        return "Tb_type_template{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specIds='" + specIds + '\'' +
                ", brandIds='" + brandIds + '\'' +
                '}';
    }
}
