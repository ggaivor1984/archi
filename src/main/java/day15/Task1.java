package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File csv = new File("src/main/resources/shoes.csv");
        try {
            Scanner scanner = new Scanner(csv);
            List<Shoes> shoesList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] splittedData = s.split(";");
                if (Integer.parseInt(splittedData[2]) == 0) {
                    Shoes shoes = new Shoes();
                    shoes.setShoesName(splittedData[0]);
                    shoes.setSize(Integer.parseInt(splittedData[1]));
                    shoes.setQuantity(Integer.parseInt(splittedData[2]));
                    shoesList.add(shoes);
                }
            }
            scanner.close();
            //System.out.println(shoesList);
            File neededFile = new File("src/main/resources/missing_shoes");
            PrintWriter pw = new PrintWriter(neededFile);
            for (Shoes zeroShoes : shoesList) {
                pw.println(zeroShoes.getShoesName() + ", " + zeroShoes.getSize() + ", " + zeroShoes.getQuantity());
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
