package ComputerShop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import static ComputerShop.computerCreation.*;
/**
 * Created by student on 01-Jul-16.
 */
public class mainProgramme {

    static AddComputers comp1 = new AddComputers();
    static char subInput;

    public static void main(String[] srgd)
    {





        char choice;

        do {
            System.out.println("C : Create a new computer");
            System.out.println("N : Create a new customer");
            System.out.println("S : Search");
            System.out.println("M : Match");
            System.out.println("O : Order or otherwise sort computers");
            System.out.println("L : List or otherwise sort computers");
            System.out.println("Q : Quit");
            System.out.println("Choose an Option : ");

            Scanner input = new Scanner(System.in);
            choice = input.next().toUpperCase().charAt(0);

            switch (choice)

            {
                case 'C':
                    newComputer();
                    break;
                case 'L':
                    ListofComputer();

            }

        }while(choice != 'Q' );



    }

    static void newComputer()
    {

        System.out.println("Enter D for Desktop and L for Laptop :");
        Scanner s = new Scanner(System.in);
        subInput = s.next().toUpperCase().charAt(0);

        if (subInput == 'D')
        {
            AddNewComputer(getcomputerDetails());
        }
        else
        {

            getcomputerDetails();

        }

    }

    // Get Details of Desktop Computer From Customer
    static LaptopAndDesktop getcomputerDetails()
    {
        String cpu,graphicCard,make;
        double cpuSpeed,RAM,hard_drive_capacity;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter CPU type:");
        cpu = s.nextLine();

        System.out.println("Enter CPU Speed :");
        cpuSpeed = s.nextDouble();

        System.out.println("Enter RAM :");
        RAM = s.nextDouble();

        System.out.println("Enter HardDrive Capacity :");
        hard_drive_capacity = s.nextDouble();

        System.out.println("Enter Graphic card Name : ");
        graphicCard = s.nextLine();

        s.nextLine();

        System.out.println("Enter Make : ");
        make = s.nextLine();

        // Get Details of new Laptop from Customer
        if (subInput == 'L')
        {
            double weight,bettery_duration;
            Scanner s2 = new Scanner(System.in);

            System.out.println("Enter Laptop's weight : ");
            weight = s2.nextDouble();

            System.out.println("Enter Laptop's Bettery duration : ");
            bettery_duration = s2.nextDouble();
            LaptopAndDesktop Newlap = new LaptopAndDesktop(new computer(cpu,cpuSpeed,RAM,hard_drive_capacity,graphicCard,make),new laptop(weight,bettery_duration));
            return Newlap;
        }
        LaptopAndDesktop Newcom = new LaptopAndDesktop(new computer(cpu,cpuSpeed,RAM,hard_drive_capacity,graphicCard,make),new laptop(0,0));
        return  Newcom;
    }




    static void AddNewComputer(LaptopAndDesktop laptopAndDesktop)
    {
        comp1.addNewComputer(laptopAndDesktop);
        for (LaptopAndDesktop LD : comp1.getLaptopAndDesktops())
        {
            if (LD != null)
            {
                System.out.println(LD.getcomputer().getCpu());
            }
        }
    }

    static void ListofComputer()
    {
        for (LaptopAndDesktop LD : comp1.getLaptopAndDesktops())
        {
            if (LD != null)
            {
                System.out.println("CPU :" +LD.getcomputer().getCpu() + "CPU Speed : " + LD.getcomputer().getCpuSpeed() +
                                   "RAM : " + LD.getcomputer().getRAM() + "HardDrive Capacity : " + LD.getcomputer().getHard_drive_capacity() +
                                    "Graphic Card : " + LD.getcomputer().getGraphicCard() + "Make : "+ LD.getcomputer().getMake() +
                                    "Laptop Weight : " + LD.getlaptop().getWeight() + " Bettery duration : " + LD.getlaptop().getBettery_duration());
            }
        }
    }
}
