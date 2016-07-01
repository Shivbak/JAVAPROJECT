package ComputerShop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 01-Jul-16.
 */
public class computer {

    private String cpu;
    private double cpuSpeed;
    private double RAM;

    private double hard_drive_capacity;
    private String graphicCard;
    private String make;


    public computer() {}

    public computer(String cpu, double cpuSpeed, double RAM,  double hard_drive_capacity, String graphicCard, String make) {
        this.cpu = cpu;
        this.cpuSpeed = cpuSpeed;
        this.graphicCard = graphicCard;

        this.hard_drive_capacity = hard_drive_capacity;
        this.make = make;
        this.RAM = RAM;
    }



    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }


    public double getHard_drive_capacity() {
        return hard_drive_capacity;
    }

    public void setHard_drive_capacity(double hard_drive_capacity) {
        this.hard_drive_capacity = hard_drive_capacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }
}
