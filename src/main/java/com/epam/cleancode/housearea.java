package com.epam.cleancode;
import java.util.Scanner;
public class housearea {
		housearea(double totalarea)//total area=Total area of the house
		{
	Scanner sc=new Scanner(System.in);
	double moneyspendforconstruction;
		double squarefeet=totalarea/10.764;//converting Area into Square Feet
		//"1.Standard MAterial 2.Above Standard MAterial 3.High Standard Material 4.High Standard Material and fully automated home"
		int typeofhouse=sc.nextInt();
		switch(typeofhouse)
		{
		case 1 : moneyspendforconstruction= 1200* squarefeet;//Construction cost for standard Material
		   break;
		case 2 : moneyspendforconstruction=1500 * squarefeet;//construction cost for above standard material
		   break;
		case 3 :moneyspendforconstruction=1800 *squarefeet;//construction cost for High standard material
		  break; 
		case 4: moneyspendforconstruction=2400* squarefeet;//construction cost for High Material and Fully Automated Home
		  break;
		  default: return;
		
		}
		
}
}
