package com.FaysalBinHasan;
import java.util.*;
public class LabTester {
	public static void main(String[]args)
	  {
	    Scanner k=new Scanner(System.in);
	    System.out.println("choose 1 for Linear Queue ,2 for Circular Array Queue ,3 for ListQueue");
	    int num=k.nextInt();
	    if(num==1)
	    {
	      LinearQueue object=new LinearQueue();
	      Boolean found =true;
	      do{
	        System.out.println("press 1 for register patient\n 2 for serve patient \n 3 for cancell all\n 4 for can doctor go home\n 5 for show all\n 6 for exit");
	        num=k.nextInt();
	        if(num==1){
	          System.out.println("Enter A Number");
	          object.RegisterPatient(k.next());
	        }else if(num==2){
	          object.ServePatient();
	        }else if(num==3){
	          object. Cancellall();
	        }else if(num==4){
	          System.out.println(object. Candoctorgohome ());
	        }
	        else if(num==5){
	          System.out.println(object.Showall());
	        }
	        else if(num==6){
	          found=false;
	        }
	      }
	      while(found);
	    }
	    
	    else if(num==2)
	    {
	      CircularQueue object=new CircularQueue();
	      Boolean found=true;
	      do
	      {
	        System.out.println("press 1 for register patient\n 2 for serve patient\n 3 for cancell all\n 4 for can doctor go home\n 5 for show all\n 6 for exit");
	        num=k.nextInt();
	        if(num==1){
	          System.out.println("Enter A Number");
	          object.RegisterPatient(k.next());
	        }else if(num==2){
	          object.ServePatient();
	        }else if(num==3){
	          object. Cancellall();
	        }else if(num==4){
	          System.out.println(object. Candoctorgohome ());
	        }
	        else if(num==5){
	          System.out.println(object.Showall());
	        }
	        else if(num==6){
	          found=false;
	        }
	      }
	      while(found);
	    }
	    else if(num==3)
	    {
	      ListQueue object=new ListQueue();
	      Boolean found=true;
	      do
	      {
	        System.out.println("press 1 for register patient\n 2 for serve patient\n 3 for cancell all\n 4 for can doctor go home\n 5 for show all\n 6 for exit");
	        num=k.nextInt();
	        if(num==1){
	          System.out.println("Enter A Number");
	          object.RegisterPatient(k.next());
	          
	        }else if(num==2){
	          object.ServePatient();
	        }else if(num==3){
	          object. Cancellall();
	        }else if(num==4){
	          System.out.println(object. Candoctorgohome ());
	        }
	        else if(num==5){
	          System.out.println(object.Showall());
	        }
	        else if(num==6){
	          found=false;
	        }
	      }
	      while(found);
	    }
	  }
}
