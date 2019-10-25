/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritemovie;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class FavoriteMovie {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the quote");
        String quote = sc.nextLine();
        System.out.println(quote);
        int number = howManySpaces(quote);
        System.out.println("The number of space is: "+number);
        System.out.println("Tell me your name now");
        String name=sc.next();
        System.out.println("Tell me your surname now");
        String surname=sc.next();
        System.out.println("Tell me your age now");
        int age=sc.nextInt();
        System.out.println("Tell me your favorite color now");
        String color=sc.next();
        
        String text = textFileWithInf(name, surname, age, color);
        String path ="C:\\Users\\FlamePhoenix\\examples\\myfiles.txt";
        System.out.println(text);
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter output = new BufferedWriter(fileWriter);
        output.write(text);
        output.close();
        fileWriter.close();
    }

    static int howManySpaces(String quote) {
        int number = quote.length() - quote.replaceAll(" ", "").length();
        return number;
    }

    static String textFileWithInf(String name, String surname, int age, String color) {
        String text = name + " " + surname + " " + age + " " + color;
        if ((age > 18 && age < 66) || color.startsWith("b")) {
            return text;
        }
        return "Nope";
    }

}
