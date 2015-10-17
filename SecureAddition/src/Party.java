
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dineshkasu
 */
public class Party 
{
    private int Number;
    List<Integer> Shares = new ArrayList<>();
    int PartialSum;

     public void SetPartialSum()
    {
         int sum = 0;
        for(Integer Share : Shares) 
        {
            sum = sum + Share;
        }  
         this.PartialSum = sum;
    }
   
    public void SetNumber(int Number)
    {
        this.Number = Number;
    }
    
    public int GetPartialSum()
    {
         return PartialSum;
    }
        
    public int GetNumber()
    {
        return this.Number;
    }
        
}

