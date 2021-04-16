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
   private String name;
   private  String regNo;
    Student obj=new Student(name,regNo);
    private List<String> grpList;
    private String grpID ;
    
    public void setName(String name) {
        this.name = obj.getStdName();
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setGrpList(List<String> grpList) {
        this.grpList = grpList;
    }

    public void setGrpID(String grpID) {
        this.grpID = grpID+1;
    }

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public List<String> getGrpList() {
        return grpList;
    }

    public String getGrpID() {
        return grpID;
    }
    
}
