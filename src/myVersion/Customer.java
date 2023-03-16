package myVersion;

public class Customer {

        /*  erklærer account her trods at det er udenfor selve account classen.
        Dette fordi vi ønsker at bruge account inde i klassen her.    */
    private Account account;
    private int id;
    private String name;

    /*  static er i dette eksempel et felt der står på klassen.
    Den bruges nu til at tælle hvor mange gange der laves en instans.   */
    private static  int counter = 1;
    public Customer(String name){
        this.name = name;
        this.id = counter;
        this.account = new Account();
        counter++; //her tæller counteren hver gang der laves en instans af
    }


    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public Account getAccount(){
        return this.account;
    }

    public int updateAccount(int amount){
        this.account.updateBalance(amount);
        return this.account.getBalance();
    }

    public String toString(){
        return "Name: "+getName() + " - ID: " + getId() + " - Balance: " + this.account.getBalance();
    }

}
