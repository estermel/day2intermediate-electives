package oo;

public class Printer extends Device implements USBPort {
    @Override
    public void plugIn(USB usb) {
        System.out.println("Data: "+usb.getDataFromDevice());
    }
}
