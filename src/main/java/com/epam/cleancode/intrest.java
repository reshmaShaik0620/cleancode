package com.epam.cleancode;
import java.util.Scanner;
public class intrest {
intrest(){
	Scanner sc=new Scanner(System.in);
	float principleamount=sc.nextInt();
	float time=sc.nextInt();
	float rateofinterest=sc.nextInt();
	float simpleinterest=(principleamount*time*rateofinterest)/100;//Calculating simple interest
	double compoundinterest=principleamount*Math.pow(1*(rateofinterest/100),100*time)-principleamount;//Calculating compound interest
	
}
}
