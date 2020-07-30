package com.example.project1.data_models;

public class Hostpital {
     private String sNameHostpital;
     private String sAddress;

    public Hostpital(String sNameHostpital, String sAddress) {
        this.setsNameHostpital(sNameHostpital);
        this.setsAddress(sAddress);
    }

    public String getsNameHostpital() {
        return sNameHostpital;
    }

    public void setsNameHostpital(String sNameHostpital) {
        this.sNameHostpital = sNameHostpital;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    @Override
    public String toString() {
        return sNameHostpital + ',' + sAddress;
    }
}
