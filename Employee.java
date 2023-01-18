class Employee {
    private int EmployeeID = 12345;

    public void setEmployeeID (int eid){
        EmployeeID = eid;
        System.out.println("Your employee id is" + eid);
    }
    public int getEmployeeId(){
        return EmployeeID;
    }
}
class company{

    public static void main(String[] args){
        Employee E = new Employee();
        E.setEmployeeID(1001);
        System.out.println(E.getEmployeeId());
    }
}


