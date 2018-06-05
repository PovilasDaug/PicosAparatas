package com.company;

public class Produktai {

    int cheese = 1000;
    int bread = 500;
    int sauce = 1500;
    int salami = 450;
    int tomato = 1200;

    public Produktai(int cheese, int bread, int sauce, int salami, int tomato) {
        this.cheese = cheese;
        this.bread = bread;
        this.sauce = sauce;
        this.salami = salami;
        this.tomato = tomato;
    }

    public int getCheese() {
        return cheese;
    }

    public int getBread() {
        return bread;
    }

    public int getSauce() {
        return sauce;
    }

    public int getSalami() {
        return salami;
    }

    public int getTomato() {
        return tomato;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setBread(int bread) {
        this.bread = bread;
    }

    public void setSauce(int sauce) {
        this.sauce = sauce;
    }

    public void setSalami(int salami) {
        this.salami = salami;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }
}
