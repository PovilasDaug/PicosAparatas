package com.company.interfaceai;

//interfacas picos aparatui su dvejais metodais;

import com.company.Produktai;

public interface Aparatas {

//aparatas atlieka gaminimo ir produktu papildymo veiksmus

    public Pica picosGamyba(String pavadinimas, int dydis);

    public void papildykProduktais(Produktai produktai);
}
