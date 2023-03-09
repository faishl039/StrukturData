package com.modul1strdt;

public class Makanan extends Hidangan{
    @Override
    public String disantap() {
//        return super.disantap();
        return this.getNamaHidangan() + " dimakan";
    }
}
