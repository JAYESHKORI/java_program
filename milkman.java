/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.util.Scanner;

/**
 *
 * @author JAYESH
 */
public class milkman {
    public static void main(String[] args) {
        int one=0,five=0,seven=0,ten=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of test cases");
        int n=sc.nextInt();
        while(n>0)
        {
            System.out.println("Enter amount of milk you want to store in bottles");
            int amt=sc.nextInt();
            if(amt==1||amt==5||amt==7||amt==10)
            {
                switch(amt)
                {
                    case 1:
                        System.out.println("1 bottle 1 liter ");
                            break;
                        case 5:
                            System.out.println("1 bottle 5 liter");
                            break;
                        case 7:
                            System.out.println("1 bottle 7 liter");
                            break;
                        case 10:
                            System.out.println("1 bottle 10 liter");
                            break;
                    }
                }
                else if(amt%10>=0)
                {
                    switch(amt%10)
                    {
                        case 0:
                            System.out.println(amt/10+" bottles of 10 liter ");
                            break;
                        case 1:
                            System.out.println(amt/10+" bottles of 10 liter and 1 bottle of 1 liter");
                            break;
                        case 2:
                            System.out.println(amt/10+" bottles of 10 liter and 2 bottle of 1 liter");
                            break;
                        case 3:
                            System.out.println(amt/10+" bottles of 10 liter and 3 bottle of 1 liter");
                            break;
                        case 4:
                            System.out.println(amt/10+" bottles of 10 liter and 4 bottle of 1 liter");
                            break;
                        case 5:
                            System.out.println(amt/10+" bottles of 10 liter and 1 bottle of 5 liter");
                            break;
                        case 6:
                            System.out.println(amt/10+" bottles of 10 liter and 1 bottle of 5 liter and 1 bootle of 1 liter");
                            break;
                        case 7:
                            System.out.println(amt/10+" bottles of 10 liter and 1 bottle of 7 liter");
                            break;
                        case 8:
                            System.out.println(amt/10+" bottles of 10 liter and 1 bottle of 7 liter and 1 bottle of 1 liter");
                            break;
                        case 9:
                            System.out.println(amt/10+" bottles of 10 liter and 1 bottle of 7 liter and 2 bottle of 1 liter");
                            break;
                    }
                }
            n--;
        }
    }
}
