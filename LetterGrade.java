/* 
    Homework 1
    Joseph Manenti
*/
package umsl.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LetterGrade 
{
    private static BufferedReader br;
    void lg() throws IOException
            
    {
    int  input, sumA, sumB, sumC, sumD, sumF;
	sumA=sumB=sumC=sumD=sumF=0;
        
        br = new BufferedReader( new InputStreamReader( System.in ) );// Input in
        
        System.out.println("");
        System.out.println("Please enter a series of grades (Ex. 99 74 87): ");
        System.out.println("");
        
        String number = br.readLine();
        System.out.println("");
        
        StringTokenizer st = new StringTokenizer (number);
        
        while (st.hasMoreTokens())
        {
            input = Integer.parseInt(st.nextToken());
            
            if(input>=90)
            {
                sumA++;
                System.out.println(input + "   A");
	    }
            else if(input >= 80)
            {
                //sumB = sumB + 1; 
                sumB++;
                
                System.out.println(input + "   B");
            }
            else if(input >= 70)
            {
                sumC++;
                System.out.println(input + "   C");
            }
            else if(input >= 60)
            {
                sumD++;
                System.out.println(input + "   D");
            }
            else if (input >= 0)
            {
                sumF++;
                System.out.println(input + "   F");
            }
            
        }
        
        System.out.println("");
        System.out.println("The total number of A's is " + sumA);
        System.out.println("The total number of B's is " + sumB);
        System.out.println("The total number of C's is " + sumC);
        System.out.println("The total number of D's is " + sumD);
        System.out.println("The total number of F's is " + sumF);
        System.out.println("");
    }
    
}