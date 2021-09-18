package com.kelaniya.uni.v1;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class calculator {
    public static void main(String[] args) {

                try {
                        //calculater/src/java/com/kelaniya/uni/v1/Numbers.txt
                    File file = new File("calculater\\src\\java\\com\\kelaniya\\uni\\v1\\Numbers.txt");
                    Scanner fileScanner = new Scanner(file);
                    Scanner sc = new Scanner(System.in);
                    String operation;
                    double result = 0;


                    while(fileScanner.hasNextLine()){
                        String data = fileScanner.nextLine();

                        double n1 = Double.parseDouble(data.split(" ")[0]);
                        double n2 = Double.parseDouble(data.split(" ")[1]);

                        System.out.println("Enter add for addition");
                        System.out.println("Enter sub for subtraction");
                        System.out.println("Enter mul for multiplication");
                        System.out.print("Enter the operation: ");

                        operation = sc.nextLine();


                        switch (operation){
                            case("add"):
                                result = n1 + n2;
                                break;
                            case("sub"):
                                result = n1 - n2;
                                break;
                            case("mul"):
                                result = n1 * n2;
                                break;
                        }

                        System.out.println("Result: "+result);
                    }
                }catch(FileNotFoundException e){

                    System.out.println(e.getMessage());
                }


    }
}
