package com.example.android.sabjee;

public class model {
    String vegname,purl;
    Long price;
    public model() {
    }

    public model(String vegname, String purl, Long price) {
        this.vegname = vegname;
        this.purl = purl;
        this.price = price;
    }

    public String getVegname() {
        return vegname;
    }

    public void setVegname(String vegname) {
        this.vegname = vegname;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
