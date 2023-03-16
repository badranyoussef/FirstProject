package toyBank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    File file;
    Scanner scan;

    public ArrayList<String> readFileData(String path) {
        file = new File(path);
        ArrayList<String> data = new ArrayList<>();

        try {
            scan = new Scanner(file);
            scan.nextLine(); //ignore header in csv (dvs) ignorer overskifterne i dokumentet

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                data.add(line);

            }
        } catch (FileNotFoundException e) {

            System.out.println("The file does not exist");
        }
        return data;
    }

    public void saveData(String path, ArrayList<Customer> customers) {
            FileWriter writer = null;
        try {
            writer = new FileWriter(path);
            writer.write("Name, Balance");

            for(Customer c: customers) {
                writer.write("\n"+c.getName()+","+c.getAccount().getBalance());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error has occurred");

        }


    }

}