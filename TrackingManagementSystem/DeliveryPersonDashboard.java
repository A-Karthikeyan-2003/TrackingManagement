package TrackingManagementSystem;

import java.util.Scanner;

import AccessService.DeliveryPersonAccessService;

import DataModel.DeliveryPerson;


 public class DeliveryPersonDashboard implements  Dashboards  {

	
	private DeliveryPerson deliveryPerson;
	
	Scanner scannerObject= new Scanner(System.in);


	private DeliveryPersonAccessService deliveryPersonAccessService ;
 	
    DeliveryPersonDashboard(DeliveryPersonAccessService deliveryPersonAccessService ,DeliveryPerson deliveryPerson)
	{
    	this.deliveryPersonAccessService  = deliveryPersonAccessService;
    	
    	
    	
		this.deliveryPerson=  deliveryPerson;
	}
    
    void myOrders() {
    	
    	System.out.println("\n --- These are our assigned order details --- \n");
    	
    	deliveryPersonAccessService.viewTransaction(deliveryPerson );
    

    }
	
    
    
    void chageStatus() {
    	
    	System.out.println("Enter Transaction Id to change location : ");
		
		int transactionId = scannerObject.nextInt();
		
		System.out.println( "Enter location to update : " );
		
		String location = scannerObject.next();
		
		
		System.out.println("Do You Want to change complete status also  : ? 1.Yes \t 2. No");
		int changeComplete = scannerObject.nextInt();

			if(changeComplete==2) {
				
				deliveryPersonAccessService.updateDeliveryLocation(transactionId, location);
				
	
				
			}
			else {
				
				deliveryPersonAccessService.updateDeliveryStatus(transactionId, location);
				
			}
			
			System.out.println("Updated Successfully");

			
    }
    
    
    
    
    
    void history() {
    	
    	
    	
		System.out.println("\n --- These are completed order details --- \n");
		
		deliveryPersonAccessService.viewHistory( deliveryPerson );
		
	
    }
    
	public int dashboards( ) {
	
		
		
		while(true) {
		
		System.out.println("\nWelcome To " + deliveryPerson.getName() + "'s DashBoard \n");
		
		System.out.println("Enter Options : \n1.My Orders\n2.Change Status Current Order\n3.History\n4.Report Orders\n5.Logout\n");
		int choice = scannerObject.nextInt();
		
		switch(choice)
		{
		case 1:
			myOrders();
			break;
			
		case 2:
			chageStatus();
			break;
			
			
		case 3:
			history();
			break;
			
		case 4:
	
		case 5:
			return 1;
		}
		
		return 0;
	
		}
		
	}
		
		
	}


