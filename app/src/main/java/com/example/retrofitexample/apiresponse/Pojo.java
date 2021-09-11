
package com.example.retrofitexample.apiresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pojo {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("products")
    @Expose
    private List<Product> products = null;
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("totalProducts")
    @Expose
    private Integer totalProducts;
    @SerializedName("processingTimeMs")
    @Expose
    private Integer processingTimeMs;
    @SerializedName("expires")
    @Expose
    private Long expires;
    @SerializedName("isStale")
    @Expose
    private Boolean isStale;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pojo withType(String type) {
        this.type = type;
        return this;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Pojo withProducts(List<Product> products) {
        this.products = products;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Pojo withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Pojo withNumber(Integer number) {
        this.number = number;
        return this;
    }

    public Integer getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(Integer totalProducts) {
        this.totalProducts = totalProducts;
    }

    public Pojo withTotalProducts(Integer totalProducts) {
        this.totalProducts = totalProducts;
        return this;
    }

    public Integer getProcessingTimeMs() {
        return processingTimeMs;
    }

    public void setProcessingTimeMs(Integer processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
    }

    public Pojo withProcessingTimeMs(Integer processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
        return this;
    }

    public Long getExpires() {
        return expires;
    }

    public void setExpires(Long expires) {
        this.expires = expires;
    }

    public Pojo withExpires(Long expires) {
        this.expires = expires;
        return this;
    }

    public Boolean getIsStale() {
        return isStale;
    }

    public void setIsStale(Boolean isStale) {
        this.isStale = isStale;
    }

    public Pojo withIsStale(Boolean isStale) {
        this.isStale = isStale;
        return this;
    }

}
