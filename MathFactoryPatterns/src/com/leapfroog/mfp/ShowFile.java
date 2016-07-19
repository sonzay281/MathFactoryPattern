/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfroog.mfp;

import com.leapfroog.mfp.command.CommandFactory;
import com.leapfroog.mfp.command.MathCommand;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class ShowFile {

    Scanner input = new Scanner(System.in);

    public void output() {
        System.out.print("Enter the file name to read:");
        String fileName = input.next();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = "";
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {

                String[] token = line.split(",");
                if (token.length >= 3) {
                    double x = Double.parseDouble(token[0]);
                    String key = token[1];
                    double y = Double.parseDouble(token[2]);
                    MathCommand cmd = CommandFactory.get(key);
                    if (cmd != null) {
                        Double ans = cmd.calculate(x, y);
                        System.out.println(ans);
                        content.append(x + key + y + "=" + ans + "\r\n"
                        );

                    } else {
                        System.out.println("Invalid Input");
                    }
                }
            }
            reader.close();
            System.out.print("Enter the file name to write:");
            fileName = input.next();
            FileWriter writer = new FileWriter(fileName);
            writer.write(content.toString());
            writer.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
