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
public class Advisor {
    private String advID;
    private String advName;
    private int advDes;
    private List<Student> stdName;
    public void markSheet()
    {
      
    }

    public void setAdvName(String advName) {
        this.advName = advName;
    }

    public Advisor() {
        this.advDes = advDes+1;
    }
    
    public String getAdvID() {
        return advID;
    }

    public String getAdvName() {
        return advName;
    }

    public int getAdvDes() {
        return advDes;
    }

    public List<Student> getStdName() {
        return stdName;
    }
   
}
