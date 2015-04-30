/* 
    Homework 1
    Joseph Manenti
*/

package umsl.edu;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MinMaxAvg
{
    void mma()throws IOException
    {

        System.out.println("");
        System.out.println( "Please enter a collection of integers (Ex. 1 3 -5 6 9): " );
        System.out.println("");
 
        BufferedReader br;
        br = new BufferedReader( new InputStreamReader( System.in ));
        String line = br.readLine();
        System.out.println("");

       StringTokenizer st = new StringTokenizer( line );
 
       int min=0;
       int max=0;
       int sum=0;
       int count =0;
       double average;
       
        while( st.hasMoreTokens() ) 
       {
            
           int input = Integer.parseInt(st.nextToken());
           count++;   
           
           if(count ==1) 
           min=max=input;
           
           else if 
               ( min > input)
               min = input;
                   
           else if 
               (max < input)
                max = input;
           
         sum=sum+input; 
       }
   
        average = sum / count;
        System.out.println ("The average score is "+average); 
        System.out.println ("The highest score is " +max); 
        System.out.println ("The lowest score is " +min); 
        System.out.println("");
    }
}


