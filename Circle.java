class Circle{
     private double radius;
      
public Circle(double inputRadius) {
      radius= inputRadius<0 ? 0 : inputRadius;
      } 
public double getRadius(){
      return radius;
}     
public double getArea(){
      return Math.PI*Math.pow(radius,2);
      }
}
class Cylinder extends Circle{
      private double height;
      public Cylinder(double inputRadius, double inputHeight){
            super(inputRadius);
            height = inputHeight<0 ? 0 : inputHeight;
      }

      public double getHeight() {
            return height;
      }
      public double getVolume() {
            return height*super.getArea();
      }
}