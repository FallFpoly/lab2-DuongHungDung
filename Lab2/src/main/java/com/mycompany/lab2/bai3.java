/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap so dien su dung trong thang: ");
            int soDien = sc.nextInt();
            
            int tien;
            if (soDien <= 50) {
                tien = soDien * 1000;
            } else {
                tien = 50 * 1000 + (soDien - 50) * 1200;
            }
            System.out.println("Tien dien phai tra: " + tien + " dong");
        }
    }
}
