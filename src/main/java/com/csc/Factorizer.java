package com.csc;
import java.util.Scanner;
import java.util.ArrayList;


public class Factorizer {

public static primefactors(int numberin)
{
  ArrayList primenumbs = new ArrayList();
   
  if (numberin == 1 || numberin == 0 )
  {
    System.out.println("null");
  }
  else 
  {
   for (int i = 2; i < numberin; i++)
    {
     if (numberin % i == 0 & i == 2 ) 
     {
       primenumbs.add(i); 
     }
     else if (numberin % i == 0 & i%2 != 0)
     {
       double s = Math.sqrt(i);
       double n = s*s;

       if (i != n )
       {
         primenumbs.add(i);
       }
         
     }
     
    }

    System.out.println("This is the prime factors of " + numberin + ": " + primenumbs);
   }  

}

}








 

