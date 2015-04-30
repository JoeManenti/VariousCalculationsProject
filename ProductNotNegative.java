/* 
    Homework 1
    Joseph Manenti
*/

package umsl.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ProductNotNegative 
{
    void pnn() throws IOException
    {

        System.out.println("");
        System.out.println("Please enter a collection of positive integers not including zero (Ex. 1 3 6 9) " );
        System.out.println("(Any negative numbers are not included in product): ");
        System.out.println("");
 
        BufferedReader br;
        br = new BufferedReader( new InputStreamReader( System.in ));
        String line = br.readLine();
        System.out.println("");

       StringTokenizer st = new StringTokenizer( line );
 
       int product = 1; 
       while( st.hasMoreTokens() ) 
       {
           int input = Integer.parseInt(st.nextToken());
           
           if (input == 0)
           {
               System.out.println("Value of zero entered. No values after zero included!");
               System.out.println("");
               break;
           }
           if (input >0)
           {
               product = product * input;
           }    
           
        }
        System.out.println("The product of your data is: " + product);
        System.out.println("");
 
    }
}
