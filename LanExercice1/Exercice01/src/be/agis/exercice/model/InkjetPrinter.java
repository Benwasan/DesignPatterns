package be.agis.exercice.model;

public class InkjetPrinter implements PrintingStrategy {
    public void print(Packet packet) {
        System.out.println("PRINTED ON InkjetPrinter:" + packet.getContents());
    }
}
