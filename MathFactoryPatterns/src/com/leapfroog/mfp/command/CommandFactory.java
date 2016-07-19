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
public class CommandFactory {

    public static MathCommand get(String key) {
        if (key.equalsIgnoreCase("+")) {
            return new AddCommand();
        } else if (key.equalsIgnoreCase("-")) {
            return new SubCommand();
        } else if (key.equalsIgnoreCase("*")) {
            return new MulCommand();
        } else if (key.equalsIgnoreCase("/")) {
            return new DivCommand();
        } else if (key.equalsIgnoreCase("pow")) {
            return new PowCommand();
        } else if (key.equalsIgnoreCase("min")) {
            return new MinCommand();
        } else if (key.equalsIgnoreCase("max")) {
            return new MaxCommand();
        }
        return null;
    }
}
