package com.company.picos;

import com.company.Produktai;
import com.company.interfaceai.Receptas;

public class MargaritaRec implements Receptas {
    private Produktai receptoProduktai;
//    private int picosDydis;
    private String pavadinimas;

    @Override
    public Produktai getSunaudotiProduktai(int picosDydis) {
        if( receptoProduktai == null || picosDydis == 0 || pavadinimas == null){
            System.out.println("Klaida");
            return null;
        }
        //atlikti produktu nuskaiciavima
        return receptoProduktai;
    }

    @Override
    public void setProduktai(Produktai produktai) {
        this.receptoProduktai = produktai;

    }

    @Override
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;

    }

    @Override
    public String getPavadinimas() {
        return pavadinimas;
    }

}
