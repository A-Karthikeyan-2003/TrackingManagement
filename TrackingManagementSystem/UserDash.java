package TrackingManagementSystem;

import java.util.Scanner;

import DataModel.Package;
import DataModel.Transaction;
import DataModel.UsersData;
import DataModel.User;
import AccessService.UserAccessService;


final public class UserDash implements Dashboards  {
	
	 Scanner ob = new Scanner(System.in);
	
	private User uuu;
	
	UserAccessService us  ;
	
	UserDash(TrackingManagement t , UsersData u)
	{
		this.us = t;
	
		
		this.uuu= (User) u;
	}
	
	 void order() {
		
		 System.out.println("\n-----------------\n"); 
		 us.viewPakages();
		 
		 
		 System.out.println("\n-----------------\n");
		 
			System.out.println("Enter Product ID to Order : ");
			int ids = ob.nextInt();
			System.out.println("Enter Quantity : ");
			int q = ob.nextInt();
			System.out.println("Enter address to place order : ");
			String ad = ob.next();
			
			
	
		us.addTransaction( ids, uuu.getName()   , ad, q);
		
		
		
	
	}
	 
	 
	 
	 
	 void trackMyOrder() {
		 
		 
		 us.viewTransaction(uuu );
		
		 


	 }
	 
	 
	 
	 void history() {  //Completed
		 
		 us.viewHistory(uuu );
		 


	 }
	
	 public int Dash( ) {
		
		
	
		
		 while(true) {
	
			
		System.out.println("\nWelcome To " + uuu.getName() + "'s DashBoard \n");
	
		System.out.println("Enter Options : \n1.Order Product\n2.Track My Order\n3.History\n4.Return Order\n5.Report Order\n6.Logout\n");
		int ch = ob.nextInt();
		ll:
		switch(ch)
		{
		case 1:
			
			this.order();
			
			break ll;
			
		case 2:
			
			this.trackMyOrder();
			break ll;
			
			
		case 3:
		this.history();
			break ll;
			
		case 4:
			
			//return 1;
		case 5:
			
		case 6:
			return 1;
			
		}
		
		return 0;
		
		 }
	}

}
