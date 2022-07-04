package org.itmo.java.labs.task2;

public class Apartment {

    public static int apnumber = 1;
    private Integer num;
    private Double totalArea;
    private Integer roomsNum;
    private Double kitchenArea;
    private Boolean isAvailable;


    public static void main(String[] args) {
        Apartment apartment1 = new Apartment();//Callimg constructor by default
//        apartment1.displayInfo();
        Apartment apartment2 = new Apartment(apnumber);//Calling constructor with one parameter
//        apartment2.displayInfo();
        Apartment apartment3 = new Apartment(apnumber, 77.3, 3, 10.5, false);//Calling constructor with all parameters
        apartment3.displayInfo();

    }

    //Constructor by default
    public Apartment() {}

    //Constructor with one parameter
    public Apartment(Integer n) {
        this.num = n;
    }

    //Constructor with all fields
    public Apartment(Integer num, Double totalArea, Integer roomsNum, Double kitchenArea, Boolean isAvailable) {
        this.num = num;                 //Apartment number
        this.totalArea = totalArea;     //Total Apartment area
        this.roomsNum = roomsNum;       //Number of rooms in the Apartment
        this.kitchenArea = kitchenArea; //Kitchen area
        this.isAvailable = isAvailable; //Availability of the Apartment
        apnumber ++;
    }

    /**
     *
     */

    void displayInfo() {
        System.out.println("There are "+apnumber+" apartments in the list.");
        System.out.println("Apartment: "+num+"\n" +
                "Total apartment area: "+totalArea+"\n" +
                "Number of rooms: "+roomsNum+"\n" +
                "Kitchen area: "+kitchenArea);
        if (isAvailable) {
            System.out.println("AVAILABLE");
        }
        else {
            System.out.println("BOOKED");
        }
    }
}
