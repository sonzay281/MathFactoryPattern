/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfroog.mfp;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            Input in = new Input();
            ShowFile show = new ShowFile();
            in.menu();

            int option = input.nextInt();

            switch (option) {
                case 1:
                    in.add();
                    break;
                case 2:
                    show.output();

                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
            System.out.println("Do you want to exit[Y/N]");
            String choice = input.next();
            if (input.next().equalsIgnoreCase("y")) {
                System.exit(0);
            }
        }
    }

}
