package com.company.interfaceai;

//abstrakti klase nes nurodo kokrecia elgsena ir turi fiksuotus kintamuosius

public abstract class Pica {

    //saugo recepta ir picos dydi

    private Receptas receptas;
    private int dydis;

    //nurodom konstruktoriu

    public Pica(Receptas receptas, int dydis) {
        this.receptas = receptas;
        this.dydis = dydis;
    }

    //metodas kuris turi grazinti recepta

    public Receptas getReceptas(){
        return receptas;
    }

    //metodas kuris grazina picos dydi

    public int getDydis(){
        return dydis;
    }

    // receptas turi pavadinima kuri graziname
    //metodas kuri privalome igyvendinti

    public abstract String getPavadinias();
}
