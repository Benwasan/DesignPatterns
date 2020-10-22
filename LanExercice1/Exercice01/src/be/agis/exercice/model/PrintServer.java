package be.agis.exercice.model;

public class PrintServer extends Node {

    public PrintServer(String address) {
        super(address);
    }

    public void receive(Packet packet) {
        if (packet.getDestinationAddress().equals(this.address)) {
            print(packet);
        }
        else {
            LanComponent nextComponent = this.getNextComponent();
            nextComponent.send(packet);
        }
    }

    public void print(Packet packet) {
        System.out.println("To: "+packet.getDestinationAddress() +" Content:"+packet.getContents());
    }
}
