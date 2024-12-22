package TrackingManagementSystem;

import java.util.Scanner;
import AccessService.SellerAccessService;

import DataModel.UsersData;
import DataModel.Package;
import DataModel.Seller;
final public class SellerDash implements Dashboards {

	
private Seller uuu ; 

static 	Scanner ob = new Scanner(System.in);



SellerAccessService ss;

	SellerDash(TrackingManagement t ,UsersData u)
	{
		
		this.ss = t;
		
	
		this.uuu = (Seller) u;
	
	}
	
	void sell() {
		
		System.out.println("Enter Product Name : ");
		String proname = ob.next();
		System.out.println("Enter Product Type ( Soft / Hard / Food ) : ");
		ob.next();
		String protype = ob.next();
		System.out.println("Enter Product Quantity : ");
		int proquantity = ob.nextInt();
		System.out.println("Enter Product Weight : ");
		String proweight = ob.next();
		System.out.println("Enter Product Rate : ");
		String prorate = ob.next();

		ss.addPackage( proname, protype, proquantity, proweight, prorate, proname, prorate);
		


		System.out.println("Product added Successfully..");
		


	}
	
	
	void trackMyOrder() {
		
		System.out.println("\n--- These are the " + uuu.getName() + "'s" + " Product Tracking ----\n");
		
		ss.viewTransaction(uuu );
		


	}
	
	
	void history() {
		System.out.println("\n--- These are the " + uuu.getName() + "'s" + " Selled Product ----\n");
		
		ss.viewHistory(uuu);
		
	}
	
	public int Dash( ) {
	
		
		
		while(true) {
	
		System.out.println("\nWelcome To " + uuu.getName() + "'s DashBoard \n");
		
		System.out.println("Enter Options : \n1.Sell My Product\n2.Track My Product Order\n3.History\n4.Report Order\n5.Logout\n");
		int ch = ob.nextInt();
		ll:
		switch(ch)
		{
		case 1:
			this.sell();
			
			break ll;
			
		case 2:
			
		this.trackMyOrder();
			
			break ll;
			
			
		case 3:
		
			this.history();
			break ll;
			
		case 4:
			
		
			
		case 5:
			
			return 1;
			
		}
		
		return 0;
		
		}
	}
		


}
