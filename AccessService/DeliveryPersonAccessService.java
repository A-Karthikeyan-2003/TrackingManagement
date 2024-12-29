package AccessService;

import DataModel.DeliveryPerson;
import DataModel.Seller;
import DataModel.UsersData;

public interface DeliveryPersonAccessService {
	
	public void viewTransaction(UsersData dp );
	
	 public void viewHistory(UsersData dp);
	
	public void updateDeliveryLocation(int id, String loc);
	
	public void updateDeliveryStatus(int id, String loc);

}
