interface intf{
    int a = 10; // public static final
    public void show();  //always public
    public void display();

}
interface intf2{
    int b = 20;
    public void show2();
    public void display2();
}
class Demo implements intf,intf2{
    public void show(){
        System.out.println("Show method is called ");
    }
    public void display(){
        System.out.println("Display method is called");
    }
    public void show2(){
        System.out.println("Show2 method called");
    }
    public void display2(){
        System.out.println("Display2 method called");
    }

    public static void main(String[] args) {
        Demo obj =new Demo();
        obj.show();
        obj.display();
        obj.show2();
        obj.display2();
    }
}