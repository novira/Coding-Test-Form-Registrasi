/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatest;
import org.junit.Test;
 
 import datatest.Employee;
import static org.junit.Assert.*;
 
public class MyAssertEqualsTest {
 
    @Test
    public void mySimpleEqualsTest(){
         
        String expectedName = "Nattu";
        assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
    }
     
    @Test
    public void myObjectEqualsTest(){
         
        Employee expectedEmpObj = new Employee(1, "Nattu", 15000);
        assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
    }
}