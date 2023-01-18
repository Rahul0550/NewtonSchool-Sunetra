class Account{
    private int balance = 5000;

    public void setBalance (int amount){
        //validation
        System.out.println("Your accont has been deposited with " + amount);
        balance += amount;
    }
    public int getBalance(){
        //validation
        return balance;
    }
}

class bank {
    public static void main(String[] args){
        Account a = new Account();
        a.setBalance ( 750);
        System.out.println( "Your balance is " + a.getBalance());
    }
}

// 1- Declare data member as private
// 2- Create setter and getter methods