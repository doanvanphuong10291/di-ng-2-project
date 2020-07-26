package com.example.project1.data_models;

import android.media.Image;

public class Doctor {
    private String sName;
    private String sHostpital;
    private String sSpecialist;

    public Doctor(String sName, String sHostpital, String sSpecialist) {
        this.setsName(sName);
        this.setsHostpital(sHostpital);
        this.setsSpecialist(sSpecialist);
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsHostpital() {
        return sHostpital;
    }

    public void setsHostpital(String sHostpital) {
        this.sHostpital = sHostpital;
    }

    public String getsSpecialist() {
        return sSpecialist;
    }

    public void setsSpecialist(String sSpecialist) {
        this.sSpecialist = sSpecialist;
    }

    @Override
    public String toString() {
        return
                sName + ", " +
                 sHostpital + ", " +
                 sSpecialist
                ;
    }
}
