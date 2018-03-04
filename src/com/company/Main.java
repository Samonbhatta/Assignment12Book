package com.company;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Main {
public static void main(String [] args) {



            Triangle triangle = null;



            String sideAString = JOptionPane.showInputDialog(null,"Enter the lenght for side A: ");

            double sideA = Double.parseDouble(sideAString);

            String sideBString = JOptionPane.showInputDialog(null,"Enter the lenght for side B: ");

            double sideB = Double.parseDouble(sideBString);

            String sideCString = JOptionPane.showInputDialog(null,"Enter the lenght for side C: ");

            double sideC = Double.parseDouble(sideCString);



            //triangle = new IllegalTriangleException(sideA, sideB, sideC);

            try{

                Triangle s1 = new Triangle(sideA, sideB, sideC);

            }

        catch(IllegalArgumentException ex){

                JOptionPane.showMessageDialog(null, ex);

            }






}}

