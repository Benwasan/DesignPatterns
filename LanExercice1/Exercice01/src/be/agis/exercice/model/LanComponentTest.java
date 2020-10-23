package be.agis.exercice.model;

import static org.junit.jupiter.api.Assertions.*;

class LanComponentTest {
    public static void main(String[] args) {
        PrintingStrategy inkJetPrinter = new InkjetPrinter();
        PrintingStrategy dPrinter = new DPrinter();
        PrintingStrategy laserPrinter = new LaserPrinter();

        LanComponent workstation1 = new WorkStation("192.168.0.1");
        LanComponent printServer1 = new PrintServer("192.168.0.2", inkJetPrinter);
        LanComponent node1 = new Node("192.168.0.3");
        LanComponent workstation2 = new WorkStation("192.168.0.4");
        LanComponent printServer2 = new PrintServer("192.168.0.5", dPrinter);
        LanComponent node2 = new Node("192.168.0.6");
        LanComponent workstation3 = new WorkStation("192.168.0.7");
        LanComponent printServer3 = new PrintServer("192.168.0.8", laserPrinter);

        workstation1.setNextComponent(printServer1);
        printServer1.setNextComponent(node1);
        node1.setNextComponent(workstation2);
        workstation2.setNextComponent(printServer2);
        printServer2.setNextComponent(node2);
        node2.setNextComponent(workstation3);
        workstation3.setNextComponent(printServer3);
        printServer3.setNextComponent(workstation1);

        Packet packet1 = new Packet(printServer1.getAddress(), "MyMessage1");
        Packet packet2 = new Packet(printServer2.getAddress(), "MyMessage2");
        Packet packet3 = new Packet(printServer3.getAddress(), "MyMessage3");

        workstation1.send(packet3);
        workstation2.send(packet3);
        workstation3.send(packet1);
    }
}