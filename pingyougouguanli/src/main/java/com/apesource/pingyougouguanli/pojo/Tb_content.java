package com.apesource.pingyougouguanli.pojo;

import java.io.Serializable;

public class Tb_content implements Serializable {
    private int id;
    private int categoryId;
    private String title;
    private String url;
    private String pic;
    private String status;
    private int sortOrder;

    private Tb_content_category tb_content_category;

    public Tb_content() {
    }

    public Tb_content(int id, int categoryId, String title, String url, String pic, String status, int sortOrder, Tb_content_category tb_content_category) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.url = url;
        this.pic = pic;
        this.status = status;
        this.sortOrder = sortOrder;
        this.tb_content_category = tb_content_category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Tb_content_category getTb_content_category() {
        return tb_content_category;
    }

    public void setTb_content_category(Tb_content_category tb_content_category) {
        this.tb_content_category = tb_content_category;
    }

    @Override
    public String toString() {
        return "Tb_content{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", pic='" + pic + '\'' +
                ", status='" + status + '\'' +
                ", sortOrder=" + sortOrder +
                ", tb_content_category=" + tb_content_category +
                '}';
    }
}
