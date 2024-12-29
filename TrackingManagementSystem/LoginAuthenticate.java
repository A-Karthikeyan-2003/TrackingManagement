package TrackingManagementSystem;

import java.util.ArrayList;

import DataModel.UsersData;

public class LoginAuthenticate {
	

	
	static UsersData authenticate(String email, String password, ArrayList<DataModel.User> userList, ArrayList<DataModel.Seller> sellerList, ArrayList<DataModel.DeliveryPerson> deliveryPersonList, ArrayList<DataModel.Admin> adminList) {
		

		UsersData user =null;

		
		

		for(int i=0; i<sellerList.size(); i++)
		{ UsersData userdata = sellerList.get(i);
			if( userdata.getEmail().equals(email) && userdata.getPassword().equals(password) )
			{
				user = userdata;
				
				break;
			}
		}
		
		if( user == null )
		{
			for(int i=0; i<userList.size(); i++)
			{ UsersData userdata = userList.get(i);
				if( userdata.getEmail().equals(email) && userdata.getPassword().equals(password) )
				{
					user = userdata;
				
					break;
				}
			}
			
		}
		
		if( user == null )
		{
			for(int i=0; i<deliveryPersonList.size(); i++)
			{ UsersData userdata = deliveryPersonList.get(i);
				if( userdata.getEmail().equals(email) && userdata.getPassword().equals(password) )
				{
					user = userdata;
					
					break;
				}
			}
			
		}
		
		if( user == null)
		{
			for(int i=0; i<sellerList.size(); i++)
			{ UsersData userdata = sellerList.get(i);
				if( userdata.getEmail().equals(email) && userdata.getPassword().equals(password) )
				{
					user = userdata;
					
					break;
				}
			}
			
		}
		
		if(user == null)
		{
			for(int i=0; i<adminList.size(); i++)
			{ UsersData userdata = adminList.get(i);
				if( userdata.getEmail().equals(email) && userdata.getPassword().equals(password) )
				{
					user = userdata;
				
					break;
				}
			}
			
		}
		
		
		
		return user;
		
	}
	

}
