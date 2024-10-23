/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burlazafrancis;

import javax.swing.JOptionPane;

/**
 *
 * @author Francis
 */
public class Burlazafrancis {

    public static void main(String[] args) {
        boolean main = true;
        while (main) {
            JOptionPane.showMessageDialog(null, "Welcome to Francis Store");

            String condition = JOptionPane.showInputDialog(null, "Wanna buy in my shop? (yes/no)");
            main = false;
            boolean CHECK = false;
            double total = 0;
            double subtotal = 0;

            while (condition.equalsIgnoreCase("yes")) {

                String message = "Welcome to the store \n1. Candy: PHP 3\n2. Water: PHP 10\n3. Ice: PHP 2\n4. Bulad: PHP 200\n5. Ginamos: PHP 100";
                int code = Integer.parseInt(JOptionPane.showInputDialog(null, message));
                double price = 0;
                String productname = "";

                switch (code) {
                    case 1:
                        price = 3;
                        productname = "candy";
                        CHECK = true;
                        break;
                    case 2:
                        price = 10;
                        productname = "water";
                        CHECK = true;
                        break;
                    case 3:
                        price = 2;
                        productname = "ice";
                        CHECK = true;
                        break;
                    case 4:
                        price = 200;
                        productname = "bulad";
                        CHECK = true;
                        break;
                    case 5:
                        price = 100;
                        productname = "ginamos";
                        CHECK = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice.");
                        CHECK = false;
                }

                if (CHECK) {
                    double QNTYTY = Double.parseDouble(JOptionPane.showInputDialog(null, "You chose " + productname + " for PHP " + price + "\nEnter quantity:"));
                    subtotal = price * QNTYTY;
                    total += subtotal;
                    JOptionPane.showMessageDialog(null, "Subtotal: PHP " + total);

                    condition = JOptionPane.showInputDialog(null, "Do you want to add another item? (yes/no)");
                }

                double discount = 0.10;
                double totalDis = 0;
                double TOTAL = 0;

                if (total > 1000) {
                    totalDis = total * discount;
                    TOTAL = total - totalDis;
                    JOptionPane.showMessageDialog(null, "A discount of 10% is applied.");
                } else {
                    TOTAL = total;
                }

                if (condition.equalsIgnoreCase("no")) {
                    JOptionPane.showMessageDialog(null, "Subtotal: PHP " + TOTAL);
                    JOptionPane.showMessageDialog(null, "Total: PHP " + TOTAL);

                    double payment = 0;

                    do {
                        payment = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter payment amount:"));
                        double kulang = TOTAL - payment;
                        if (payment < TOTAL) {
                            JOptionPane.showMessageDialog(null, "Not enough money. You still need PHP " + kulang);
                        } else {
                            double change = payment - TOTAL;
                            JOptionPane.showMessageDialog(null, "Your change is PHP " + change + ". Thank you!");
                        }

                    } while (payment < TOTAL);

                    main = true;
                    JOptionPane.showMessageDialog(null, "...............................");
                }
            }
        }
    }
}
    

