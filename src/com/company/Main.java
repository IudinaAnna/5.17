package com.company;
import java.util.Scanner;
public class Main {
    public static double product(int nm){
        double price;
        switch(nm){
            case 1:
                price=2.98;
                break;
            case 2:
                price=4.50;
                break;
            case 3:
                price=9.98;
                break;
            case 4:
                price=4.49;
                break;
            case 5:
                price=6.67;
                break;
            default:
                price=0.0;
        }
        return price;
    }
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner input=new Scanner(System.in);
        double price[]={2.98,4.50,9.98,4.49,6.67};
        System.out.println("Item#    Price");
        double total = 0;
        for(int i=1;i<price.length;i++){
            System.out.printf("%3d %9.2f\n",i,price[i]);
        }
        System.out.println("Select Item NUmber Or -1 to Quit : ");
        int select=input.nextInt();
        while(select !=-1){
            System.out.println(product(select));
            total+=product(select);
            System.out.println("Select Item NUmber Or -1 to Quit : ");
            select=input.nextInt();
        }
        System.out.println("Total Retail : "+total);
    }
}

