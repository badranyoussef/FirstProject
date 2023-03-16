package toyBank;

public class Customer {
    private Account account;
    private String name;
    private int id;
    private static int counter = 1;

    public Customer(String name){
        this.name = name;
        this.id  = counter;
        this.account = new Account();
        counter++;
    }

    public Account getAccount(){
        return this.account;
    }

    public String getName(){
        return this.name;
    }

    public int receiveAmount(int amount){
        this.account.updateBalance(amount);
        return this.account.getBalance();
    }

    public String toString(){
        return getName()+ ": "+ this.account.getBalance();

    }


}
