package be.agis.exercice.model;

public class Packet {
    private String destinationAddress;
    private String contents;

    public Packet(String destinationAddress, String contents) {
        this.destinationAddress = destinationAddress;
        this.contents = contents;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
