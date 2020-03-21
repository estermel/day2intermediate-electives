package oo;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Printer printer = new Printer();
        Flashdisk flashdisk = new Flashdisk();
        Headphone headphone = new Headphone();

        headphone.setName("oo.Headphone Sennheiser PX-200 II");

        laptop.plugIn(headphone);
        printer.plugIn(headphone);
        laptop.plugIn(flashdisk);

        System.out.println("asdfad");
    }

}
