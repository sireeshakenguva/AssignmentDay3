package com.bridgelabs.Employee;

import java.util.Random;


public class FirstProgram
{
    public static void main(String[] args)
    {
    	
    	        System.out.println("Welcome to EmployeeWage program");
    	        int is_Fullpresent=1;
    	        int is_Parttime=2;
    	        int Wageperhour = 20;
    	        int Fulldayhour = 8;
    	        int Parttimehour = 4;
    	        int Month=20;
    	        Random random = new Random();
    	        int Empcheck = random.nextInt(3);
    	        System.out.println("A random int from 0 to 2: " +  Empcheck);
    	        if (Empcheck == is_Fullpresent)
    	        {
    	            System.out.println("Employee is Present");
    	            int DailyEmpWage=Wageperhour*Fulldayhour*Month;
    	                    System.out.println("Employee Daily Wage is " +  DailyEmpWage);
      }
    	        else if(Empcheck == is_Parttime)
    	        {
    	            System.out.println("Employee is  Part time Present");
    	            int ParttimeEmpWage=Wageperhour*Parttimehour*Month;
    	            System.out.println("Employee Parttime Wage is " + ParttimeEmpWage);
    	        }
    	        else
    	        {
    	            System.out.println("Employee is absent");
    	            System.out.println("Employee Monthly Wage is Zero");
    	        }
    	        
                  }
}