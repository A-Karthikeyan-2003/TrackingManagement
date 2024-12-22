package AccessService;

import DataModel.DeliveryPerson;
import DataModel.Seller;

public interface DeliveryPersonAccessService {
	
	public void viewTransaction(DeliveryPerson dp );
	
	 public void viewHistory(DeliveryPerson dp);
	
	public void updateDeliveryLocation(int id, String loc);
	
	public void updateDeliveryStatus(int id, String loc);

}
