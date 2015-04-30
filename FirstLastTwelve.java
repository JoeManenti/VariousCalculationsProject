/* 
    Homework 1
    Joseph Manenti
*/
package umsl.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FirstLastTwelve 
{
    
    void twelve() throws IOException
    {
	int input, first, last,count,num, counter; 
	first=last=count=num=counter=0;

	
        System.out.println("");
        System.out.println("To find how many times you entered the number 12,");
        System.out.println("And the location of the first and last index of 12,");
        System.out.println("Please enter a series of whole numbers (Ex. 12 3 -5 6 9): ");
        System.out.println("");
        
 
        BufferedReader br;
        br = new BufferedReader( new InputStreamReader( System.in ) );
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer( line );

            while(st.hasMoreTokens())
            {
                input = Integer.parseInt(st.nextToken());
                 count++;
                
                    if(input == 12)
                    {
                     if(counter == 0)
                        {
                            first = count;
                            last = count;
                            counter++;
                            num++;
                        }
                    else
                        {
                            last = count;  
                            counter++;
                            num++;
                        }
                    }
            }
                    
            if(counter == 0)
            {
                System.out.println("");
                System.out.println("There is no 12 in this series of numbers. Index 0");
                System.out.println("");
            }      
        
            else
            {
                System.out.println("");
                System.out.println("You entered " + num + " 12's");
                System.out.println("The first instance of the number 12 is located at Index " + first);
                System.out.println("The last instance of the number 12 is located at Index " + last);
                System.out.println("");
            }
    }
}

     
     