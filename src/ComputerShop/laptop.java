package ComputerShop;

/**
 * Created by student on 01-Jul-16.
 */
public class laptop extends computer {

    private double weight;
    private double bettery_duration;


    public laptop(double weight, double bettery_duration) {
        this.weight = weight;
        this.bettery_duration = bettery_duration;

    }

    public double getBettery_duration() {
        return bettery_duration;
    }

    public void setBettery_duration(double bettery_duration) {
        this.bettery_duration = bettery_duration;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }




}
