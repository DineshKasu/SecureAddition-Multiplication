
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dineshkasu
 */
public class SecureAddition
{
    public static void main(String[] args) 
    {
        int N,randshareval = 0,sum = 0,parVal;
        
         Scanner ConsoleInput = new Scanner(System.in);   
         System.out.println("Howmany numbers do you want to add?");
         N = ConsoleInput.nextInt();
         
         Party[] party;  // Declared a variable of type party[]
         party = new Party[N]; // array is assigned to variable
         
         for (int z = 0; z < N; z++ ) // Party Objects creation 
         {
                   party[z] = new Party();
         }
         
         for(int c = 1 ; c < N+1 ; c++) //Take the user input numbers from the console
         {
             System.out.println("Please Enter the Number#"+c+":");
             party[c-1].SetNumber(ConsoleInput.nextInt());
         }
         
         
         String com = " ";
         String comm = ",";
         for ( int v = 0; v < N; v++ )     
         {
             if(v > 0)
             {
                 com = com + comm;
             }
            com = com + Integer.toString(party[v].GetNumber());
         }
         
         System.out.println("The numbers to add are:"+com);
         System.out.println("\n");
         
         Random rand=new Random();  
         for ( int v = 0; v < N; v++ )     
         {
            sum = 0;
             for(int u = 0; u < N; u++)
             {
                 if(u!=v)
                 {
                     /*The nextInt() will give the int value between 0-(inclusive) and also the specified value-(exclusive)*/
                     randshareval = rand.nextInt(party[v].GetNumber() + 1);
                     System.out.println("Party "+v+" sends "+randshareval+" to party "+u);
                     party[u].Shares.add(randshareval);
                     sum = sum + randshareval;
                 }
             }
             party[v].Shares.add((party[v].GetNumber())-(sum));
             System.out.println("Party "+v+" keeps "+(party[v].GetNumber()-sum)+" as its own share");
             System.out.println("\n");
         }
         
         for ( int v = 0; v < N; v++ )     
         {
               com = "["; comm = ",";
                for(int i =0; i< party[v].Shares.size();i++)
               {
                       if(i>0)
                      {
                         com = com + comm;
                      }
                    com = com + Integer.toString(party[v].Shares.get(i));
                   
                }
                
                System.out.println("Party "+v+" has shares "+com+"]");
         }
          System.out.println("\n");
          
         for ( int v = 0; v < N; v++ )     
         {
             party[v].SetPartialSum();  
              System.out.println("The partial sum for Party "+v+": "+party[v].GetPartialSum());
         }
         
         System.out.println("\n");
         
         for ( int v = 0; v < N; v++ )     
         {
            parVal = party[v].GetPartialSum();
            
             for(int u = 0; u < N; u++)
             {
                 if(u!=v)
                 {
                     party[u].Shares.add(parVal);
                     System.out.println("Party "+v+" sends "+parVal+" to party "+u);
                 }
             }
             System.out.println("\n");
         }
         
         int FinalSum =0;
         for ( int v = 0; v < N; v++ )     
         {
              party[v].SetPartialSum();
              FinalSum = party[v].GetPartialSum();
         }
           
         System.out.println("The Sum is "+FinalSum);
         

    } 
}
