package be.agis.exercice.model;

public class LaserPrinter implements PrintingStrategy {
    public void print(Packet packet) {
        System.out.println("PRINTED ON LaserPrinter:" + packet.getContents());
    }
}
