/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedReader;

/**
 *
 * @author JAYESH
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class Read_Int_SigleLine 
{
    public static void main(String[] args) {
        System.out.println("Enter the elements seperated by spaces: ");
        Scanner sc =new Scanner(System.in);
    String input = sc.nextLine();
    StringTokenizer strToken = new StringTokenizer(input," ");
    try
    {
        int count = strToken.countTokens();
        //Reads in the numbers to the array
        System.out.println("Count: " + count);
        double[] arr = new double[count];

    for(int x = 0;x < count;x++){
        arr[x] = Double.parseDouble((String)strToken.nextElement());
        System.out.println("arr["+x+"]"+arr[x]);
    }
    }
    catch(NumberFormatException e)
    {
        System.out.println("Wrong input");
    }
    
    
    }
    
}
