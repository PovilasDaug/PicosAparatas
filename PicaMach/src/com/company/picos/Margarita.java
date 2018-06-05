package com.company.picos;

import com.company.Produktai;
import com.company.interfaceai.Pica;
import com.company.interfaceai.Receptas;

public class Margarita extends Pica {

    public Margarita() {
        super(new MargaritaRec(), 10);
        super.getReceptas().setPavadinimas("Margarita");
        super.getReceptas().setProduktai(new Produktai(10,10,10,10,10));
    }

    @Override
    public String getPavadinias() {
        return null;
    }
}
