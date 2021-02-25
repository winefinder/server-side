package com.ssf.prototype.wwine.model;

public class Retail {
    private final int retailId;
    private String retailName;
    private String retailRegNo;
    private String retailPhone;
    private Double retailLocationX;
    private Double retailLocationY;
    private String retailUserId;
    private String retailAddress;
    private String retailBhours;
    private String retailExp;


    public Retail(int retailId){ this(retailId,null,null,null,null,null,null,null,null,null); }
    public Retail(int retailId, String retailName, String retailRegNo, String retailPhone, Double retailLocationX, Double retailLocationY, String retailUserId, String retailAddress, String retailBhours, String retailExp) {
        this.retailId = retailId;
        this.retailName = retailName;
        this.retailRegNo = retailRegNo;
        this.retailPhone = retailPhone;
        this.retailLocationX = retailLocationX;
        this.retailLocationY = retailLocationY;
        this.retailUserId = retailUserId;
        this.retailAddress = retailAddress;
        this.retailBhours = retailBhours;
        this.retailExp = retailExp;
    }

    // Builder Pattern 적용.


    public int getRetailId() {
        return retailId;
    }

    public String getRetailName() {
        return retailName;
    }

    public String getRetailRegNo() {
        return retailRegNo;
    }

    public String getRetailPhone() {
        return retailPhone;
    }

    public String getRetailUserId() {
        return retailUserId;
    }

    public String getRetailAddress() {
        return retailAddress;
    }

    public String getRetailBhours() {
        return retailBhours;
    }

    public String getRetailExp() {
        return retailExp;
    }

    public Double getRetailLocationX() {
        return retailLocationX;
    }
    public Double getRetailLocationY() {
        return retailLocationY;
    }
}
