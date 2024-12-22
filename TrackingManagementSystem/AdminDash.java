package TrackingManagementSystem;

import java.util.Scanner;

import DataModel.DeliveryPerson;
import DataModel.Package;
import DataModel.Transaction;
import DataModel.UsersData;
import AccessService.AdminAccessService;
final public class AdminDash implements Dashboards {

private UsersData uuu;



AdminAccessService as;
   
    Scanner ob = new Scanner(System.in);

	AdminDash(TrackingManagement t, UsersData u)
	{
		this.as = t;
	
	
		this.uuu= u;
	}
	
	
	 void View(){
		 
		System.out.println("\n --- These are transaction details --- \n");
		


		as.viewTransaction();
		
	}
	
	 
	 
	 
	 void Assign_Orders(){
		 
		 System.out.println("Enter Transaction ID to Assign Driver : ");
			int ids = ob.nextInt();
			
			


			System.out.println("\n --- These are delivery person details --- \n");


			as.viewDeliveryPersons();
			
			System.out.println("Enter Driver ID to Assign Driver : ");
			
			int idss = ob.nextInt();
			
			String dss = as.getDeliveryPersonName(idss);
			
			
			


			
			as.assignOrders(ids, dss  );
		


			
			System.out.println("Driver " + dss + " is assigned successfully for TID " + ids  );


	 
	 }
	 
	
	 public int Dash( ) {
		 
		
		
		while(true) {
		System.out.println("\nWelcome To " + uuu.getName() + "'s DashBoard \n");
		
		System.out.println("Enter Options : \n1.View All Orders\n2.Assign Orders\n3.View All Report\n4.Solve Reports\n5.Logout\n");
		int ch = ob.nextInt();
	
			
		ll:
		switch(ch)
		{
		case 1:
		
			this.View();
			break ll;
			
		case 2:
		
			this.View();
			this.Assign_Orders();
			break ll;
			
			
		case 3:
			
			break;
			
		case 4:
			
			
		case 5:
			
			return 1;
		}
		
		return 0;
		}
		
	}
	}


