/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author tehreem.nisa
 */
public class Employee {
    
private long salary;  
private String type;
private String title;
  
public Employee() {
}  
  
  public long getsalary() {  
    return salary;  
}  
public void setsalary(long salary) {  
    this.salary = salary;  
}  
  public String gettype() {  
    return type;  
}  
public void settype(String type) {  
    this.type = type;  
} 
  public String gettitle() {  
    return title;  
}  
public void settitle(String title) {  
    this.title = title;  
} 
public void show(){  
    System.out.println("Title:"+title+"\n"+"Salary:"+salary+"\n"+"Type:"+type);  
}
}
