class Shape{
    String color;
    public void area(){
        System.out.println("area of the shape");
    }
}

class Triangle extends Shape{
    // public void area(int base, int height){
    //     System.out.println(0.5 * base * height);
    // }
    public void area(){
        System.out.println("Shape of traiangle: ");
    }
}

class inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        
        t.area(10, 15);
    }    
}
