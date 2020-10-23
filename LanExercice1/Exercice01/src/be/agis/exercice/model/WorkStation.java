package be.agis.exercice.model;

public class WorkStation extends Node {
    public WorkStation(String address) {
        super(address);
    }

    public void originate(Packet packet) {
        this.send(packet);
    }
}
