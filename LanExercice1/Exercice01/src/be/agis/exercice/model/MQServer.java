package be.agis.exercice.model;

public class MQServer extends PacketHandler {
    public MQServer(String address) {
        super(address);
    }

    @Override
    public void handle(Packet packet) {
        System.out.println("Saved in a queue");
    }
}
