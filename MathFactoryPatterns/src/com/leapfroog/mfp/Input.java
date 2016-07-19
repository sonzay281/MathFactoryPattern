/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfroog.mfp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Input {

   Scanner input=new Scanner(System.in);

    public void menu() {

        System.out.println("1.Add to file\t2.Show File");
        System.out.print("Choose:");
    }

    public void add() {
        System.out.print("Enter the file name to read:");
        String fileName = input.next();
        StringBuilder content = new StringBuilder();
        String line = "";
        while (!(line = input.nextLine()).equalsIgnoreCase("exit")) {
            content.append(line);
        }
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content.toString());
            writer.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

}
