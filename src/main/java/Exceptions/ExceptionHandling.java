package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
      //  createNewFile();
        numbersExceptionHandling();
    }

    private static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        //Scanner fileReader = new Scanner(file);

        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);

            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }

    public static void createNewFile() {
        //Use File class in java to create new object
        File file = new File("resources/nonexistant.txt");
        //file.createNewFile();
        //does not compile so we need to add an exception
        try{
            file.createNewFile();
        }catch (Exception e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }
}
