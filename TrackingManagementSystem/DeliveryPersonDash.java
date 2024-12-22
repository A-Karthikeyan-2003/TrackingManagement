package TrackingManagementSystem;

import java.util.Scanner;
import AccessService.DeliveryPersonAccessService;

import DataModel.UsersData;
import DataModel.DeliveryPerson;
import DataModel.Transaction;

final public class DeliveryPersonDash implements  Dashboards  {

	
private DeliveryPerson uuu;
	
static Scanner ob = new Scanner(System.in);


DeliveryPersonAccessService ds ;
 	
    DeliveryPersonDash(TrackingManagement t ,UsersData u)
	{
    	this.ds  = t;
    	
    	
		this.uuu= (DeliveryPerson) u;
	}
    
    void myOrders() {
    	System.out.println("\n --- These are our assigned order details --- \n");
    	
    	ds.viewTransaction(uuu );
    

    }
	
    
    
    void chageStatus() {
    	
    	System.out.println("Enter Transaction Id to change location : ");
		
		int oid = ob.nextInt();
		
		System.out.println( "Enter location to update : " );
		
		String loc = ob.next();
		
		
		System.out.println("Do You Want to change complete status also  : ? 1.Yes \t 2. No");
		int gh = ob.nextInt();

			if(gh==2) {
				
				ds.updateDeliveryLocation(oid, loc);
				
	
				
			}
			else {
				
				ds.updateDeliveryStatus(oid, loc);
				
			}
			
			System.out.println("Updated Successfully");

			
    }
    
    
    
    
    
    void history() {
    	
    	
    	
		System.out.println("\n --- These are completed order details --- \n");
		
		ds.viewHistory( uuu );
		
	
    }
    
	public int Dash( ) {
	
		
		
		while(true) {
		
		System.out.println("\nWelcome To " + uuu.getName() + "'s DashBoard \n");
		
		System.out.println("Enter Options : \n1.My Orders\n2.Change Status Current Order\n3.History\n4.Report Orders\n5.Logout\n");
		int ch = ob.nextInt();
		
		switch(ch)
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


