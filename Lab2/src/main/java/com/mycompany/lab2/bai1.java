/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap a: ");
            double a = sc.nextDouble();
            System.out.print("Nhap b: ");
            double b = sc.nextDouble();
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -b / a;
                System.out.println("Phuong trinh co nghiem x = " + x);
            }
        }
    }
}
