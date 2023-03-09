package com.modul1strdt;

public class Minuman extends Hidangan {
    @Override
    public String disantap() {
//        return super.disantap();
        return this.getNamaHidangan() + " diminum";
    }
}
