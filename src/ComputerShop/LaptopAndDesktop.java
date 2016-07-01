package ComputerShop;

/**
 * Created by student on 01-Jul-16.
 */
public class LaptopAndDesktop {

    private computer c;
    private laptop l;

    public LaptopAndDesktop(computer c,laptop l)
    {
        this.c = c;
        this.l = l;
    }

    public computer getC() {
        return c;
    }

    public void setC(computer c) {
        this.c = c;
    }

    public laptop getL() {
        return l;
    }

    public void setL(laptop l) {
        this.l = l;
    }

    public computer getcomputer()
    {
        return c;
    }

    public laptop getlaptop()
    {
        return l;
    }
}
