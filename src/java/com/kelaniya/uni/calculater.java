package com.kelaniya.uni;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

    public class calculater {





        public static void main(String[] args) {
            try {

                File num_file = new File("src\\java\\com\\kelaniya\\uni\\test.txt");
                Scanner fileScanner = new Scanner(num_file);
                Scanner sc = new Scanner(System.in);
                String opr;
                double res = 0;


                while(fileScanner.hasNextLine()){
                    String data = fileScanner.nextLine();

                    double num1 = Double.parseDouble(data.split(" ")[0]);
                    double num2 = Double.parseDouble(data.split(" ")[1]);

                    System.out.println("print 'addition' to add numbers ");
                    System.out.println("print 'subtraction' to subtraction numbers ");
                    System.out.println("print 'multiplication' to multiple numbers ");
                    System.out.println("Enter the operation: ");
                    opr = sc.nextLine();


                    switch (opr){
                        case("addition"):
                            res = num1 + num2;
                            break;
                        case("subtraction"):
                            res = num1 - num2;
                            break;
                        case("multiplication"):
                            res = num1 * num2;
                            break;
                    }

                    System.out.println("Result: "+res);
                }
            }catch(FileNotFoundException e){

                System.out.println(e.getMessage());
            }
        }
    }

