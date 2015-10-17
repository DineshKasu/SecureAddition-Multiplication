
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
    int[] Row = new int[4];
    private int RShare,PShare,InputBit,SecretKeyVal,C1,C2;
    
    public void SetUserInput(int inputbit)
    {
        this.InputBit = inputbit;
    }
    public void SetPShare(int PShare)
    {
        this.PShare = PShare;
    }
    public void SetRShare(int RShare)
    {
        this.RShare = RShare;
    }
    
    public void SetSecretKValue(int SecretKeyVal)
    {
        this.SecretKeyVal = SecretKeyVal;
    }
    
    public void SetC1value(int C1Val)
    {
        this.C1 = C1Val;
    }
        
     public void SetC2value(int C2Val)
    {
        this.C2= C2Val;
    }
    
    public int GetUserInput()
    {
        return this.InputBit; 
    }
    
    public int GetRShare()
    {
        return this.RShare; 
    }
    
     public int GetPShare()
    {
        return this.PShare;
    }
    
     public int GetSecretKValue()
    {
        return this.SecretKeyVal;
    }
     public int GetC1Value()
    {
        return this.C1;
    }
     public int GetC2Value()
    {
        return this.C2;
    }
      
}

