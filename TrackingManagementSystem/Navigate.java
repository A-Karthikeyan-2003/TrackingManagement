package TrackingManagementSystem;

import DataModel.Admin;
import DataModel.DeliveryPerson;
import DataModel.Seller;
import DataModel.User;
import DataModel.UsersData;

public class Navigate {

	public static Dashboards navigation(TrackingManagement tm, UsersData user){
		
		Dashboards t = null ;
		
		if ( user instanceof Seller ) {
			
			t = new SellerDash(tm,user);
			
		} else if ( user instanceof User ) {
			
			t = new UserDash(tm,user);
			
		} else if (user instanceof DeliveryPerson ) {
			
			t = new DeliveryPersonDash(tm,user);
			
		} else if (user instanceof Admin ) {
			
			t = new AdminDash(tm,user);
			
		} else {
			
			System.out.println("Something Wrong..!");
			
		}
		
		return t;
		
	}
	
}
