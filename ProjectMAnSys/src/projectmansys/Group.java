/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmansys;
import java.util.*;
/**
 *
 * @author PCC
 */
public class Group {
    private int grpID ;
   private List<Student> stdList;
    Group(){
    stdList=new ArrayList<Student>();
}
    private int searchRegNo(Std rgNo1,Std rgNo2,Std rgNo3)
    {
        int index =-1;
         for(int i = 0 ; i  < stdList.size(); i++)
         {
             if(stdList.get(i).getStdReg().equals(rgNo1))
             {
                 index = i;
                 break;
             }
         }
          for(int i = 0 ; i  < stdList.size(); i++)
         {
             if(stdList.get(i).getStdReg().equals(rgNo2))
             {
                 index = i;
                 break;
             }
         }
           for(int i = 0 ; i  < stdList.size(); i++)
         {
             if(stdList.get(i).getStdReg().equals(rgNo3))
             {
                 index = i;
                 break;
             }
         }
        return index;
    }
   
    public void setGrpID() {
        this.grpID = grpID+1;
    }


    public int getGrpID() {
        return grpID;
    }
    
}
