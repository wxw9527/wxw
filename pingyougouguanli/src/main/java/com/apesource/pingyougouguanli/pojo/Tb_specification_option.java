package com.apesource.pingyougouguanli.pojo;

import java.io.Serializable;

public class Tb_specification_option implements Serializable {

    private int id;
    private String optionName;
    private int orders;
    private int specId;
    private Tb_specification tbSpecification;

    public Tb_specification_option() {
    }

    public Tb_specification_option(int id, String optionName, int orders, int specId, Tb_specification tbSpecification) {
        this.id = id;
        this.optionName = optionName;
        this.orders = orders;
        this.specId = specId;
        this.tbSpecification = tbSpecification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public int getSpecId() {
        return specId;
    }

    public void setSpecId(int specId) {
        this.specId = specId;
    }

    public Tb_specification getTbSpecification() {
        return tbSpecification;
    }

    public void setTbSpecification(Tb_specification tbSpecification) {
        this.tbSpecification = tbSpecification;
    }

    @Override
    public String toString() {
        return "Tb_specification_option{" +
                "id=" + id +
                ", optionName='" + optionName + '\'' +
                ", orders=" + orders +
                ", specId=" + specId +
                ", tbSpecification=" + tbSpecification +
                '}';
    }
}
