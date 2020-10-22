package be.agis.exercice.model;

public abstract class LanComponent {
    String address="";
    LanComponent nextComponent=null;

    public LanComponent(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public LanComponent getNextComponent()
    {
        return nextComponent;
    }

    public void setNextComponent(LanComponent nextComponent) {
        this.nextComponent = nextComponent;
    }

    public abstract void send(Packet packet);
    public abstract void receive(Packet packet);
}
