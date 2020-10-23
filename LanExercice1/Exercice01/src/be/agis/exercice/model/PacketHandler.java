package be.agis.exercice.model;

public abstract class PacketHandler extends Node {
    public PacketHandler(String address) {
        super(address);
    }

    public abstract void handle(Packet packet);

    public void receive(Packet packet) {
        handle(packet);
    }
}
