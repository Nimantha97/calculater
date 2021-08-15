package com.kelaniya.uni;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

    public class calculater {





        public static void main(String[] args) {
            try {
                //creating all scanner and file objects
                File file = new File("src\\java\\com\\kelaniya\\uni\\test.txt");
                Scanner fileScanner = new Scanner(file);
                Scanner sc = new Scanner(System.in);
                String op;
                double result = 0;

                //reading the file line by line
                while(fileScanner.hasNextLine()){
                    String data = fileScanner.nextLine();
                    //extracting num1 and num2 from the string
                    double num1 = Double.parseDouble(data.split(" ")[0]);
                    double num2 = Double.parseDouble(data.split(" ")[1]);

                    //getting input for the operation
                    System.out.print("Enter the operation: ");
                    op = sc.nextLine();

                    //performing the operation
                    switch (op){
                        case("add"):
                            result = num1 + num2;
                            break;
                        case("sub"):
                            result = num1 - num2;
                            break;
                        case("mul"):
                            result = num1 * num2;
                            break;
                    }
                    //output
                    System.out.println("Result: "+result);
                }
            }catch(FileNotFoundException e){
                //if the file was not found
                System.out.println(e.getMessage());
            }
        }
    }

