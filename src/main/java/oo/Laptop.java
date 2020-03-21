package oo;

public class Laptop extends Device implements USBPort {

    @Override
    public void plugIn(USB usb) {
        System.out.println("Nama device: " + usb.getDevice().getName());
        System.out.println("Data dari laptop: "+ usb.getDataFromDevice());
    }
}
