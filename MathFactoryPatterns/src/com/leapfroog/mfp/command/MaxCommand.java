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
public class MaxCommand extends MathCommand {

    @Override
    public double calculate(double x, double y) {
        double max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
        
        
    }

}
