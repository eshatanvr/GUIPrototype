/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmansys;

/**
 *
 * @author PCC
 */
public class Student {
    private String stdName;
    private String stdReg;
    private String password;
    private String email;
    private String [][] stdNames=new String[1000][2];
  public Student(String stdName, String stdReg) {
        
        boolean flag=false;
        boolean flag1=false;
        for(int i=0;i<stdName.length();i++)
        {
            if((stdName.charAt(i)=='a'&&stdName.charAt(i)=='z')|| (stdName.charAt(i)=='A' && stdName.charAt(i)=='Z') )
            {
                flag=true;
            }  
             else
            {
                flag=false;
                break;
            }
        }
        if (flag==true)
        {
            this.stdName = stdName;
        }
        if (stdReg.length()==10)
        {
        if ((stdReg.charAt(0)=='2') && (stdReg.charAt(1)=='0') && (stdReg.charAt(2)>='0' && stdReg.charAt(2)<='9') && (stdReg.charAt(3)>='0' && stdReg.charAt(3)<='9') && stdReg.charAt(4)=='-' && stdReg.charAt(5)=='C'  && stdReg.charAt(6)=='S'&& stdReg.charAt(7)=='-'&& (stdReg.charAt(8)>='0' && stdReg.charAt(8)<='9')&&(stdReg.charAt(9)>='0' && stdReg.charAt(9)<='9'))
            {
                flag1=true;
            }
        }
        else if (stdReg.length()==11)
        {
         if (stdReg.charAt(0)=='2' && stdReg.charAt(1)=='0' && (stdReg.charAt(2)>='0' &&stdReg.charAt(2)<='9') && (stdReg.charAt(3)>='0' && stdReg.charAt(3)<='9') && stdReg.charAt(4)=='-' && stdReg.charAt(5)=='C' && stdReg.charAt(6)=='S'&& stdReg.charAt(7)=='-'&& (stdReg.charAt(8)>='0'&& stdReg.charAt(8)<='9')&&(stdReg.charAt(9)>='0'&&stdReg.charAt(9)<='9')&&(stdReg.charAt(10)>='0'&&stdReg.charAt(10)<='9'))
            {
                flag1=true;
            }     
        }
        else
        {
          flag1=false;
        }
        if(flag1==true)
        {
            this.stdReg = stdReg;
        }
        
    }
    
    public String getStdName() {
        return stdName;
    }

    public String getStdReg() {
        return stdReg;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

  
}
