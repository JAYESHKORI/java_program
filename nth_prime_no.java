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
class find_prime
{
        int prime(int n)
    {
        int flag=0;
        if(n==1)
            return 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                flag=1;
        }
        if(flag==1)
            return 0;
        else
            return 1;
    }
}

public class nth_prime_no {
    public static void main(String[] args) {
        int chk,cnt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Range to find nth prime number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter which no of prime you want");
        int pri_no=sc.nextInt();
        if(a>b)
        {
            System.out.println("Range is not proper");
            return;
        }
        find_prime fp=new find_prime();
        for(int i=a;i<=b;i++)
        {
            chk=fp.prime(i);
            if(chk==1)
                cnt++;
            if(cnt==pri_no)
            {
                System.out.println("Your "+pri_no+"th prime number is "+i);
                break;
            }
        }
    }
}