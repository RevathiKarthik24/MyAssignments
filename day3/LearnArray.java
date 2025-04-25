package week1.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
        int empNum[]= {100,200,300,400,500};
        //To find the length of an Array
        //Length count starts from 1 
        //Index count is starts from 0
        //Array-Insersion order
        //Sort-sortingorder(Ascending order)
       System.out.println("The length of the Employee is:"+empNum.length);
        Arrays.sort(empNum);
       for (int i = 0; i < empNum.length; i++) {
        	System.out.println("The Employee numbers is:"+empNum[i]);
        	//To print the values in the descending order 
        	for (int j = empNum.length-1; j>=0; j--) {
        		System.out.println(empNum[j]);
            
				}
        	//To print the third largest number
        	System.out.println("The third largest value is:"+empNum[empNum.length-3]);
        	
		}
        	//Instantiation of initializing an array
        	//type name[]=new type[size]
        	String empName[]=new String[4];
        	//empName[0]="Revathi";
        	empName[1]="Karthik";
        	empName[2]="Kanshika";
        	empName[0]="Kavin Sabarish";
        	System.out.println("The length of employee name is:"+empName.length);
        	for (int j = 0; j < empName.length; j++) {
        		System.out.println("Employee name:"+empName[j]);
				if(empName[j].equals("Kanshika"))
				{
					System.out.println("loop is terminated");
				}
			}
        	
	}

}


