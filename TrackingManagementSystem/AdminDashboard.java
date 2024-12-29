package TrackingManagementSystem;

import java.util.Scanner;

import DataModel.Admin;


import AccessService.AdminAccessService;

final public class AdminDashboard implements Dashboards {

	private Admin admin;

	private AdminAccessService adminAccessService;
   
    Scanner scannerObject = new Scanner(System.in);

	AdminDashboard(AdminAccessService adminAccessService, Admin admin)
	{
		this.adminAccessService = adminAccessService;

		this.admin= admin;
	}
	
	
	private void view(){
		 
		System.out.println("\n --- These are transaction details --- \n");
		


		adminAccessService.viewTransaction();
		
	}
	
	 
		private void viewAllReport() {
		
			adminAccessService.viewReport(admin);
			
		}
		
	 
	private void assignOrders(){
		 
		 System.out.println("Enter Transaction ID to Assign Driver : ");
			int transactionId = scannerObject.nextInt();
			
			


			System.out.println("\n --- These are delivery person details --- \n");


			adminAccessService.viewDeliveryPersons();
			
			System.out.println("Enter Driver ID to Assign Driver : ");
			
			int deliveryPersonId = scannerObject.nextInt();
			
			String deliveryPersonName = adminAccessService.getDeliveryPersonName(deliveryPersonId);
			
			
			


			
			adminAccessService.assignOrders(transactionId, deliveryPersonName  );
		


			
			System.out.println("Driver " + deliveryPersonName + " is assigned successfully for TID " + transactionId  );


	 
	 }
	 
	

	private void replyToReport() {
		
		System.out.println("Enter reply Id to resolve : ");
		int replyId = scannerObject.nextInt();
		
		System.out.println("Enter reply Description to resolve : ");
		String replyDef = scannerObject.next();
		
		adminAccessService.makeReportReply(replyId, replyDef);
		
	}

	
	
	 public int dashboards( ) {
		 
		
		
		while(true) {
		System.out.println("\nWelcome To " + admin.getName() + "'s DashBoard \n");
		
		System.out.println("Enter Options : \n1.View All Orders\n2.Assign Orders\n3.View All Report\n4.Solve Reports\n5.Logout\n");
		int choice = scannerObject.nextInt();
	
			
		ll:
		switch(choice)
		{
		case 1:
		
			this.view();
			break ll;
			
		case 2:
		
			this.view();
			this.assignOrders();
			break ll;
			
			
		case 3:
			
			this.viewAllReport();
			
			break;
			
		case 4:
			this.replyToReport();
			
		case 5:
			
			return 1;
		}
		
		return 0;
		}
		
	}




	}


