package myVersion;

public class Account {

    private int balance;

    public Account(){
        balance = 30000;
    }
    public int getBalance(){
        return balance;
    }

    public void setBalance(int amount){
        this.balance = amount;
    }


    public void updateBalance(int amount) {
        this.balance+=amount;
    }
}
