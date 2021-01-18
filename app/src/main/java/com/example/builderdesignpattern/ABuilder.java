package com.example.builderdesignpattern;

public class ABuilder {

    public AType addA() {
        AType cds = new AType();
        cds.addItem(new A());
        return cds;
    }
}
