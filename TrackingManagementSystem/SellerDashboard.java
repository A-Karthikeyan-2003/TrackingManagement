package TrackingManagementSystem;

import java.util.Scanner;

import AccessService.SellerAccessService;
import DataModel.Seller;

final public class SellerDashboard implements Dashboards {

	
	private Seller seller ; 

 	Scanner scannerObject = new Scanner(System.in);



 	private SellerAccessService sellerAccessService;

	SellerDashboard(SellerAccessService sellerAccessService ,Seller seller)
	{
		
		this.sellerAccessService = sellerAccessService;
		
	
		this.seller =  seller;
	
	}
	
	void sell() {
		
		System.out.println("Enter Product Name : ");
		String packageName = scannerObject.next();
		
		System.out.println("Enter Product Type ( Soft / Hard / Food ) : ");
		scannerObject.next();
		String packageType = scannerObject.next();
		
		System.out.println("Enter Product Quantity : ");
		int packageQuantity = scannerObject.nextInt();
		
		System.out.println("Enter Product Weight : ");
		String packageWeight = scannerObject.next();
		
		System.out.println("Enter Product Rate : ");
		String packageRate = scannerObject.next();
		
		
		sellerAccessService.addPackage( packageName, packageType, packageQuantity, packageWeight, packageRate, seller.getName(), seller.getAddress());
		


		System.out.println("Product added Successfully..");
		


	}
	
	
	void trackMyOrder() {
		
		System.out.println("\n--- These are the " + seller.getName() + "'s" + " Product Tracking ----\n");
		
		sellerAccessService.viewTransaction( seller );

	}
	
	
	void history() {
		
		System.out.println("\n--- These are the " + seller.getName() + "'s" + " Selled Product ----\n");
		
		sellerAccessService.viewHistory(seller);
		
	}
	
	public int dashboards( ) {
	
		
		
		while(true) {
	
		System.out.println("\nWelcome To " + seller.getName() + "'s DashBoard \n");
		
		System.out.println("Enter Options : \n1.Sell My Product\n2.Track My Product Order\n3.History\n4.Report Order\n5.Logout\n");
		int choice = scannerObject.nextInt();
		ll:
		switch(choice)
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
