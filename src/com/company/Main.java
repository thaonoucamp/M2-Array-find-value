package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            // khai bao mang danh sach sinh vien;
            String[] students = {"Thao", "Minh", "Hien", "Phuc", "Tu"};

            // khai bao bien luu ten tim kiem va gan voi gia tri nhap vao;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a name's student : ");
            String input_name = sc.nextLine();

            // duyet mang da khai bao, tim phan tu co gia tri bang voi ten da nhap;
            boolean isExist = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(input_name)) {
                    System.out.println("vi tri cua sv trong danh sach " + input_name + " la: " + (i+1));
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                System.out.println("ko thay " + input_name + " trong danh sach");
            }
        }
    }
}
