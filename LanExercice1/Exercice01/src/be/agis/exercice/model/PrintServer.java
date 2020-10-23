package be.agis.exercice.model;

public class PrintServer extends PacketHandler {
    private PrintingStrategy printing;

    public PrintServer(String address, PrintingStrategy printing) {
        super(address);
        this.printing = printing;
    }

    public void receive(Packet packet) {
        if (packet.getDestinationAddress().equals(this.address)) {
            this.printing.print(packet);
        }
        else {
            LanComponent nextComponent = this.getNextComponent();
            nextComponent.send(packet);
        }
    }

    public void print(Packet packet) {
        this.printing.print(packet);
    }

    @Override
    public void handle(Packet packet) {
        handle(packet);
    }
}
