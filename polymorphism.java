
 // poly morphism -- multiple forms;
 // method overloading- complie time polymorphism;
 // method overriding - runtime polymorphism
    class Student{
        String name;
        int age;

        public void printInfo(String name, int age){
            System.out.println(name+ " "+ age);
        }
        public void printInfo(String name){
            System.out.println(name);
        }
        public void printInfo(int age){
            System.out.println(age);
        }
    }
    class polymorphism {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name = "Aadarsh";
            s1.age = 12;
            s1.printInfo(s1.name, s1.age);
            s1.printInfo(s1.name);
            s1.printInfo(s1.age);
        }
    }
