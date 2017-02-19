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
private String name;  
private String type;
  
public Employee() {
    System.out.println("def cons");
}  
  
public Employee(long salary) {this.salary = salary;}  
  
public Employee(String name) {  this.name = name;}  
  
public Employee(long salary, String type) {  
    this.salary = salary;  
    this.name = type;  
}  
  
public void show(){  
    System.out.println("Name:"+name+"\n"+"Salary:"+salary+"Type"+type);  
}
}
