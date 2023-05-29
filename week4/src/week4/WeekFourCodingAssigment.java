package week4;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WeekFourCodingAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				//Question 1: Parts a, b, c
				
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
				int subtract = ages[0]-(ages[ages.length-1]);
				System.out.println(subtract);
				
				ArrayList<Integer> agesList = new ArrayList<Integer>();
				
				for(int temp : ages)
				{
					agesList.add(temp);
				}
				System.out.println(agesList);
				
				agesList.add(79);
				
				System.out.println(agesList);
				
				int sum = 0;
				for(int i = 0;i<ages.length;i++) {
					sum = sum + ages[i];
				}
				   
				System.out.println(sum / ages.length);
				
				//Question 2: Parts a, b
				
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
				int sumNames = 0;
				for(int i = 0;i< names.length;i++) {
					sumNames += names[i].length();
				}
				
				System.out.println(sumNames / names.length); 
				
				String concatedNames = "";
				for(int i = 0;i< names.length;i++) {
					concatedNames += (names[i] + " ");
				}
				System.out.println(concatedNames);
				
				//Question 3 - How do you access the last element of any array?
				System.out.println(ages[ages.length - 1]);
				
				//Question 4 - How do you access the first element of any array?
				System.out.println(ages[0]);
				
				//Question 5
				
				int[] nameLengths = new int [names.length];
				
				for(int i = 0; i< names.length;i++) {
					nameLengths[i] = names[i].length();
				}
				
				for(int i : nameLengths)
				
				System.out.println(i);

				
				//Question 6
				
				   int sumName = 0;
				   for (int i = 0; i < nameLengths.length; i++) {  
			           sumName = sumName + nameLengths[i];  
				   }
			        System.out.println("Sum of all the elements of the array: " + sum);  
			  
				//Question 7
			   
			          String str = "Hello";
			          int count = 3;
			          System.out.println(str.repeat(count));
			          
			   //Question 8
			        
			          String firstName = "Peter"; 
			          String lastName = "Stark";
			          
			          System.out.println(fullName("Peter", "Stark"));
			    
			
			     //Question 9
			       
			     int[] arrayNine = {31, 45, 88, 90};
		         System.out.println(greaterthan100 (arrayNine));
		    
		        
		        //Question 10
		        
		        double[] arrayTen = { 59.27, 12.18, 7.9 };
		        System.out.println(calculateAverage(arrayTen));
		        
		        //Question 11
		        
		        double[] arrayElevenx = {10.50, 45.07, 09.01};
		        double[] arrayEleveny = {07.05, 30.08, 39.40};
		        
		        System.out.println(determineAverage(arrayElevenx, arrayEleveny));
		        
		        //Question 12
		    	     
		        
		        System.out.println(willBuyDrink(false, 7.90));
		        
		        //Question 13
		        
		        int[] arrayThirteen = {59, 27, 12, 18, 7, 9};
		        System.out.println(findLargestNumber(arrayThirteen));
			          
			} // end of method
		    
			
			//Question 8 Method
			
			public static String fullName (String firstName, String lastName) {
				return firstName + " " + lastName;
			}
			
			
			//Question 9 Method
			
			public static boolean greaterthan100(int[] numbers) {
				int sum = 0;
			    for (int number : numbers) {
		            sum += number;
		        }
		        if (sum > 100) {
		            return true;
		        }
		        return false;
		    }
			
		    //Question 10 Method
			public static double calculateAverage(double[] array) {
				double sum = 0;
				for (double number : array){
					sum += number;
				}
				return sum / array.length;
				
			}
			
			//Question 11 Method
			  //determineAverage is the method created to take two arrays of double
			  //and return true if the average of the elements in the first array is 
			  // greater than the average of the elements in the second array
			
			public static boolean determineAverage(double[] arrayOne, double[] arrayTwo) {
				double sum1 = 0;
				for(double x : arrayOne) {
					sum1 += x;
					}
					
				 double averageOne  = sum1 / arrayOne.length;
				
				
				double sum2 = 0;
				for(double x : arrayTwo) {
					sum2 += x;
					}
					
				double averageTwo = sum2 / arrayTwo.length;
				if( sum1 > sum2) {
					return true;
				}
				else return false;
				
			}
			
			//Question 12 Method
			  
			public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
				
				if(isHotOutside == true && moneyInPocket >= 10.50) {
					return true;
				}
				else return false;
			}
			
			
			//Question 13 Method
			
			public static int findLargestNumber(int[] numbers) {
				int largest = numbers[0];
				for (int number : numbers) {
					if (number > largest) {
						largest = number;
					}
				}
				return largest;
			}

			//The method created was to find the largest number in an array.			
		
	} //end of class


