package TrackingManagementSystem;

import AccessService.AdminAccessService;
import AccessService.DeliveryPersonAccessService;
import AccessService.SellerAccessService;
import AccessService.UserAccessService;
import DataModel.Admin;

import DataModel.DeliveryPerson;
import DataModel.Seller;
import DataModel.User;
import DataModel.UsersData;

public class Navigate {

	public static Dashboards navigation(TrackingManagement trackingManagement, UsersData user){
		
		Dashboards dashboard = null ;
		
		if ( user instanceof Seller ) {
			
			dashboard = new SellerDashboard( (SellerAccessService) trackingManagement, (Seller) user);
			
		} else if ( user instanceof User ) {
			
			dashboard = new UserDashboard( (UserAccessService) trackingManagement, (User) user);
			
		} else if (user instanceof DeliveryPerson ) {
			
			dashboard = new DeliveryPersonDashboard( (DeliveryPersonAccessService) trackingManagement, (DeliveryPerson) user);
			
		} else if (user instanceof Admin ) {
			
			dashboard = new AdminDashboard( (AdminAccessService) trackingManagement, (Admin) user);
			
		} else {
			
			System.out.println("Something Wrong..!");
			
		}
		
		return dashboard;
		
	}
	
}
