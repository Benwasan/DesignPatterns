package be.agis.exercice.model;

public class DPrinter implements PrintingStrategy {
    public void print(Packet packet) {
        System.out.println("PRINTED ON 3DPrinter:" + packet.getContents());
    }
}
