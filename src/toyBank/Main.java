package toyBank;


import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank(3);
        Bank.getTotalBanks();
        TextUI ui = new TextUI();

        int count = 0;

        FileIO fileIO = new FileIO();
        ArrayList<String> data = fileIO.readFileData("src/data.csv");

        // Oversæt data til objeter hvis der er kunder i arraylisten
        if (data.size() > 0) {
            for (String s : data) {
                String[] line = s.split(",");
                String name = line[0];
                int balance = Integer.parseInt(line[1]); // trim metoden fjerne mellemrum ved den data som vi står ved. Her er der eksempel et mellemrum efter komma i dokumentet
                Customer c = bank.registerCustomer(name);
                c.receiveAmount(balance);
                //int position = Integer.parseInt(line[2].trim());
                //count++;
            }
        } else {

            //Går ikke inde i loopet siden counteren er 3 eftersom der er 3 kunder i data filen.
            while (count < bank.customerLimit) {
                String name = ui.getInput("Enter name of customer: ");
                Customer c = bank.registerCustomer(name);
                c.receiveAmount(30000);

                /* her kan vi tilføje evt penge... via setbalance og textui. ex:
                    String deposit = ui.getInput("How much would you like to deposit: ");
                    Account.updateBalance(int amount);
                */

                count++;
            }

        }

        Customer c = bank.getCustomer(0);
        bank.getCustomer(0);
        c.receiveAmount(10000);
        fileIO.saveData("src/data.csv", bank.getCustomers());
        bank.displayCustomers();

    }
}