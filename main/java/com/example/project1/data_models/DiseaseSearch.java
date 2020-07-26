package com.example.project1.data_models;

public class DiseaseSearch {
    private String sDiseasename;
    private String sSignal;

    public DiseaseSearch(String sDiseasename,String sSignal) {
        this.setsDiseasename(sDiseasename);
        this.setsSignal(sSignal);
    }

    public String getsDiseasename() {
        return sDiseasename;
    }

    public void setsDiseasename(String sDiseasename) {
        this.sDiseasename = sDiseasename;
    }

    public String getsSignal() {
        return sSignal;
    }

    public void setsSignal(String sSignal) {
        this.sSignal = sSignal;
    }

    @Override
    public String toString() {
        return sDiseasename + ',' + sSignal ;
    }
}
