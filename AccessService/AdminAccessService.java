package AccessService;

import DataModel.UsersData;

public interface AdminAccessService {
	
	public void viewTransaction();
	
	public void viewDeliveryPersons();
	
	public void assignOrders(int Orderid, String DeliveryPersonName);
	
	public String getDeliveryPersonName(int id);
	
	public void viewReport(UsersData user);
	 
	public void makeReportReply( int replyId, String replyDef ) ;

}
