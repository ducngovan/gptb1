package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Equation exam = new Equation();
	exam.getData();
	exam.getHendling();
    }
}
class Equation {
    float fistnum, lastnum, result;
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("GIAI PHUONG TRINH BAC NHAT");
        System.out.print("nhap a; ");
        fistnum = scanner.nextFloat();
        System.out.print("nhap b: ");
        lastnum = scanner.nextFloat();
    }
    public void getHendling(){
        if(fistnum == 0 && lastnum == 0){
            System.out.println("Phuong trinh vo so nghiem");
        }else if(fistnum == 0 && lastnum != 0){
            System.out.println("Phuong trinh vo nghiem");
        }else{
            result = -lastnum / fistnum;
            System.out.println("Phuong trinh co nghiem: "+result);
        }
    }
}