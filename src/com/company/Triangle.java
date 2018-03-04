package com.company;

import javax.swing.*;

public class Triangle {

        private double sideA;

        private double sideB;

        private double sideC;


        public Triangle(){

            sideA = 0;

            sideB = 0;

            sideC = 0;

        }



        public Triangle(double newSideA, double newSideB, double newSideC){

                if(sideA <= 0 || sideA + sideB <= sideC || sideA + sideC <= sideB){

                    throw new IllegalArgumentException("Invalid numbers");

                }

                else if(sideB <= 0 || sideB + sideC <= sideA){

                    throw new IllegalArgumentException("Invalid numbers");

                }

                else if(sideC <= 0){

                    throw new IllegalArgumentException("Invalid numbers");

                }
            }




            //sideA = newSideA;

            //sideB = newSideB;

            //sideC = newSideC;


        public void isValid(double sideA, double sideB, double sideC){

            if ((sideA <= 0)||(sideA + sideB <= sideC)||(sideA + sideC <= sideB)){

                JOptionPane.showMessageDialog(null, "Invalid number.");

            }

        else if ((sideB <= 0)||(sideB + sideC <= sideA)){

                JOptionPane.showMessageDialog(null, "Invalid number.");

            }

        else if (sideC <= 0){

                JOptionPane.showMessageDialog(null, "Invalid number.");

            }}

               public static double area(double sideA, double sideB, double sideC) {

            double triangleSides;

            double triangleSideA;

            double triangleSideB;

            double triangleSideC;

            double trianglesSidesMultiplication;

            double triangleSideMultiply;

            double triangleSquareRoot;



            triangleSides = (sideA + sideB + sideC)/2;

            triangleSideA = (triangleSides - sideA);

            triangleSideB = (triangleSides - sideB);
            triangleSideC = (triangleSides - sideC);

            trianglesSidesMultiplication = ((triangleSideA)*(triangleSideB)*(triangleSideC));

            triangleSideMultiply = (trianglesSidesMultiplication * triangleSides);

            triangleSquareRoot = Math.sqrt(triangleSideMultiply);
                       return triangleSquareRoot;

        }

    }


