import java.util.*;

class Phone{
    String name;
    int size;
    int RAM;
    int ROM;
    int batteryCapacity;
    boolean gorillaGlass;
    public Phone(){
        System.out.println("Phone is created: ");
        this.gorillaGlass = true;
    }
    
    public void batteryTest(int batteryCapacity){
        System.out.println("Phone will run for: "+(batteryCapacity/1000) + " hours");
    } 
    public void displayInfo(){
        System.out.println(name + "size: " + size  + " Ram:" + RAM + " ROM:" + ROM);
    }
}

class OOPs{
    public static void main(String[] args) {
//class name; object name; "new" keywod-> to allot memory to the object
        Phone p1 = new Phone();
        Phone p2 = new Phone();

        p1.name = "OnePlus 10 : ";
        p1.size = 6;
        p1.RAM = 8;
        p1.ROM = 128;
        p1.batteryCapacity = 5000;
        //p1.gorillaGlass = true;
//calling of method using object + 
        p1.displayInfo();
        p1.batteryTest(p1.batteryCapacity);


        p2.name = "Iphone 13 : ";
        p2.size = 5;
        p2.RAM =  4;
        p2.ROM = 128;
        p2.batteryCapacity = 3800;

        p2.displayInfo();
        p2.batteryTest(p2.batteryCapacity);
        
    }
}