package com.ssf.prototype.wwine.model;

public class Wine implements Product {
    private final int wineId;
    private String wineName;
    private String wineDescription;
    private String winePrice;
    private String wineImage;
    private double wineRate;
    private String wineYear;

    public Wine(int wineId){ this(wineId,null,null,null,null,0,null); }
    public Wine(int wineId, String wineName ,String wineDescription, String winePrice,String wineImage,double wineRate,String wineYear) {
        this.wineId = wineId;
        this.wineName = wineName;
        this.wineDescription = wineDescription;
        this.winePrice = winePrice;
        this.wineImage = wineImage;
        this.wineRate = wineRate;
        this.wineYear = wineYear;
    }

    public int getWineId() {
        return wineId;
    }

    public String getWineName() {
        return wineName;
    }

    public String getWineDescription() {
        return wineDescription;
    }

    public String getWineprice() { return winePrice; }

    public String getWineImage() {
        return wineImage;
    }

    public double getWineRate() { return wineRate; }

    public String getWineYear() {
        return wineYear;
    }
//"id": 1001,
//        "title": "Amaranta 1001",
//        "description": "Amaranta 1001 맛있음, 바디감 높음, 당도가 높음",
//        "price": 10000,
//        "image": "static/images/1001.jpg",
//        "rating": 1
}
