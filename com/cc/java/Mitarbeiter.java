package com.cc.java;

public class Mitarbeiter {

    private String nName;
    private String vName;
    private String funktion;
    private int Eintrittsjahr;
    
    public Mitarbeiter(String nName, String vName, String funktion, int eintrittsjahr) {
        this.nName = nName;
        this.vName = vName;
        this.funktion = funktion;
        this.Eintrittsjahr = eintrittsjahr;
    }

    public String getInfo() {
        return  "Name: " + nName + " Vorname: " + vName + ", Als: " + funktion + ", Geboren am: " + Eintrittsjahr;
    }

    public void setInfo(String nName, String vName, String funktion, int eintrittsjahr) {
        this.nName = nName;
        this.vName = vName;
        this.funktion = funktion;
        this.Eintrittsjahr = eintrittsjahr;
    }
    

}
