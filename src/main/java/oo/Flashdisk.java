package oo;

public class Flashdisk extends Device implements USB {

    @Override
    public Device getDevice() {
        return this;
    }

    @Override
    public String getDataFromDevice() {
        return "GG Poster";
    }

    @Override
    public String getName() {
        return "oo.Flashdisk Kingston";
    }

}
