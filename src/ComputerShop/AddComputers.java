package ComputerShop;

/**
 * Created by student on 01-Jul-16.
 */
public class AddComputers {

    private LaptopAndDesktop[] laptopAndDesktops = new LaptopAndDesktop[100];

    int counter = 0;

    public void addNewComputer(LaptopAndDesktop laptopAndDesktop)
    {
        laptopAndDesktops[counter + 1] = laptopAndDesktop;
        counter++;
    }

    public LaptopAndDesktop[] getLaptopAndDesktops() {
        return laptopAndDesktops;
    }
}
