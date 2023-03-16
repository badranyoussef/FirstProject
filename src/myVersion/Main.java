package myVersion;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank(3);
        Bank.getTotalBanks();
        TextUI ui = new TextUI();

        int count = 0;
        Customer newCustomer;
        while (count < bank.customerLimit) {
            String name = ui.getInput("Enter the name of the customer:");
            newCustomer = bank.registerCustomer(name);
            try {
                String deposit = ui.getInput("How much would you like to deposit:");
                int pars = Integer.parseInt(deposit);
                newCustomer.getAccount().setBalance(pars);

            } catch (Exception e) {
                System.out.println("You did not type a number");
            }
            count++;
        }

        bank.printCustomers();
        bank.saveCustomers();


    }

}