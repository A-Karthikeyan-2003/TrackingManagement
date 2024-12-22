package AccessService;

public interface AdminAccessService {
	
	public void viewTransaction();
	
	public void viewDeliveryPersons();
	
	public void assignOrders(int Orderid, String DeliveryPersonName);
	
	public String getDeliveryPersonName(int id);

}
