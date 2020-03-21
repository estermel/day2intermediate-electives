package oo;

public class Headphone extends Device implements USB {
    private String name;

    @Override
    public Device getDevice() {
        return this;
    }

    @Override
    public String getDataFromDevice() {
        return "MP3 File";
    }
}
