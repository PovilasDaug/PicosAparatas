package com.company.interfaceai;

//receptas bus globalus tad interface

import com.company.Produktai;

public interface Receptas {

    //recepte turi atsispindeti kiek produktu bus sunaudota
    //atsizvelgiant i picos dydi

    // gal cia ne getteris? tiesiog metodas kuris suskaiciuoja
    //kiek produktu bus susnaudota?

    public Produktai getSunaudotiProduktai(int picosDydis);

    // nesuprantu kam to reikia....

    //ka butent siuo atveju setinsiu
    //ar sunaudota produktu skaiciu ar
    public void setProduktai(Produktai produktai);

    public void setDydis(int dydis);

    public void setPavadinimas(String pavadinimas);

    public String getPavadinimas();
}
