package toyBank;



public class Account {
    private int balance;
    public Account(){
        this.balance = 0;

    }
    int getBalance(){
        return balance;
    }
    void setBalance(int amount){

    }

    public void updateBalance(int amount) {
        this.balance+=amount;
    }
}
