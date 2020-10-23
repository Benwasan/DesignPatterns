package be.agis.exercice.model;

public class FileServer extends PacketHandler {
    public FileServer(String address) {
        super(address);
    }

    @Override
    public void handle(Packet packet) {
        System.out.println("Saved in a file");
    }
}
