package TrackingManagementSystem;

import java.util.Scanner;

import DataModel.Package;
import DataModel.Transaction;
import DataModel.UsersData;
import DataModel.User;
import AccessService.UserAccessService;


final public class UserDashboard implements Dashboards  {
	
	 Scanner scannerObject = new Scanner(System.in);
	
	private User user;
	
	UserAccessService userAccessService  ;
	
	UserDashboard(UserAccessService userAccessService , User user)
	{
		this.userAccessService = userAccessService;
		
		this.user=  user;
		
	}
	
	 void order() {
		 
		
		
		 System.out.println("\n-----------------\n"); 
		 userAccessService.viewPakages();
		 
		 
		 System.out.println("\n-----------------\n");
		 
			System.out.println("Enter Product ID to Order : ");
			int ids = scannerObject.nextInt();
			
			System.out.println("Enter Quantity : ");
			int quantity = scannerObject.nextInt();
			
			System.out.println("Enter address to place order : ");
			String address = scannerObject.next();
			
			userAccessService.addTransaction( ids, user.getName()   , address, quantity);	
		

	}
	 
	 
 
	 
	 void trackMyOrder() {
		 
		 userAccessService.viewTransaction(user );

	 }
	 
	 void history() {  
		 
		 userAccessService.viewHistory(user );

	 }
	 
	 void returnOrder()
	 {
		 System.out.println("This is your ordered product\n");
		 
		 
		 userAccessService.viewHistory(user );
		 
		 System.out.println("Enter Transaction id : " ) ;
		 
		 int id = scannerObject.nextInt();
		 
		 System.out.println("Enter Address : " ) ;
		 
		 String location = scannerObject.next();
		 
		 userAccessService.returnPackage(id, location);
		 
		 
		 
	 }
	 
	 
	
	 public int dashboards( ) {
		
		
	
		
		 while(true) {
	
			
		System.out.println("\nWelcome To " + user.getName() + "'s DashBoard \n");
	
		System.out.println("Enter Options : \n1.Order Product\n2.Track My Order\n3.History\n4.Return Order\n5.Report Order\n6.Logout\n");
		int choice = scannerObject.nextInt();
		ll:
		switch(choice)
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
			this.returnOrder();
			//return 1;
		case 5:
			
		case 6:
			return 1;
			
		}
		
		return 0;
		
		 }
	}

}
