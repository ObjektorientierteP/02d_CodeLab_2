package com.cc.java;

public class Mitarbeiter {

    private String nName;
    private String vName;
    private String funktion;
    private int eintrittsjahr;
    
    public Mitarbeiter(String nName, String vName, String funktion, int eintrittsjahr) {
        this.nName = nName;
        this.vName = vName;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }

    public String getInfo() {
        return  "Name: " + nName + " Vorname: " + vName + ", Als: " + funktion + ", Geboren am: " + eintrittsjahr;
    }

    public void setInfo(String nName, String vName, String funktion, int eintrittsjahr) {
        
        if (nName != ""){ this.nName = nName; } else{ this.nName = "-"; }

        if (vName != ""){ this.vName = vName; } else{ this.vName = "-"; }

        if (funktion != ""){ this.funktion = funktion; } else{ this.funktion = "-"; }

        if (eintrittsjahr >= 0){ this.eintrittsjahr = eintrittsjahr; } else{ this.eintrittsjahr = 0; }

    }
    

}
