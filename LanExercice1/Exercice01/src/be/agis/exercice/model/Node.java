package be.agis.exercice.model;

public class Node extends LanComponent {

    public Node(String address) {
        super(address);
    }

    @Override
    public void send(Packet packet) {
        System.out.println("Packet sent to "+packet.getDestinationAddress());
        receive(packet);
    }

    @Override
    public void receive(Packet packet) {
        System.out.println("Packet "+packet.getContents()+" is received by "+this.getAddress());

        if (packet.getDestinationAddress().equals(this.getAddress())) {
            System.out.println("Packet received");
        }
        else {
            this.getNextComponent().send(packet);
        }
    }
}
