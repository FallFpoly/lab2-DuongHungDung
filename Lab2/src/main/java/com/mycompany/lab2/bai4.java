/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai4 {
    static Scanner sc = new Scanner(System.in);

    // ham giai phuong trinh bac nhat
    public static void giaiPTB1() {
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

    // ham giai phuong trinh bac 2
    public static void giaiPTB2() {
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            // giai bac nhat bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("Phuong trinh bac nhat co nghiem x = " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    // ham tinh tien dien
    public static void tinhTienDien() {
        System.out.print("Nhap so dien su dung: ");
        int soDien = sc.nextInt();
        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.println("Tien dien phai tra: " + tien + " dong");
    }

    // ham menu
    public static void menu() {
        int chon;
        do {
            System.out.println("+--------------------------------------+");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("+--------------------------------------+");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1 -> giaiPTB1();
                case 2 -> giaiPTB2();
                case 3 -> tinhTienDien();
                case 4 -> System.out.println("Tam biet!");
                default -> System.out.println("Lua chon khong hop le. Moi nhap lai.");
            }
            System.out.println(); // xuong dong
        } while (chon != 4);
    }

    // main
    public static void main(String[] args) {
        menu();
        sc.close();
    }
}
