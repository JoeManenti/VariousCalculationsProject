/* 
    Homework 1
    Joseph Manenti
*/

package umsl.edu;

import java.io.IOException;
import java.util.Scanner;

public class RunMyProgram
{
  public static void main(String args[]) throws IOException
  {
   RunMyProgram rmp = new RunMyProgram();  
   rmp.menu();
   
  }
  
    public void menu() throws IOException 
    {
            Scanner sc = new Scanner(System.in);
            int input =0;
            
            do 
                
            {
            System.out.println("Please choose from the following menu options:");
            System.out.println("1) Product Not Negative");
            System.out.println("2) First Last Twelve");
            System.out.println("3) Letter Grade");
            System.out.println("4) Min Max Avg");
            System.out.println ("5) Exit");
            System.out.println("");
            System.out.print("Selection: ");
            
            input = sc.nextInt();
            if(input == 1)
            {
                ProductNotNegative prd = new ProductNotNegative();
                prd.pnn();  
            }    
            else if(input == 2)
            {
                FirstLastTwelve flt = new FirstLastTwelve();
                flt.twelve();            
             }
            else if (input == 3)
             {
                LetterGrade grader  = new LetterGrade();
                grader.lg();            
             }
            else if (input == 4)
            { 
                MinMaxAvg average = new MinMaxAvg();
                average.mma();
            }
           
            else if (input > 5)
            {    
                 System.out.println("");
                 System.out.println("Invalid Entry! Please Try Again!");
                 System.out.println("");
            }
            else
            {             
                                  
            System.out.println("");    
            System.out.println("Thanks and please come again!");
              
            }
    

            }while (input != 5);

    }
}
