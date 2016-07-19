/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfroog.mfp.command;

/**
 *
 * @author Anonymous
 */
public class PowCommand extends MathCommand {

    public double calculate(double x, double y) {

        double total = 1;
        for (int i = 1; i <= y; i++) {
            total = total * x;
        }
        return total;
    }
}
