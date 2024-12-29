package AccessService;

import DataModel.Package;
import DataModel.User;
import DataModel.UsersData;

public interface UserAccessService {

	public void addTransaction(int id, String uname,  String address, int quantity);
	
	public void viewTransaction(UsersData s);
	
	public Package getPackage(int id);
	 public void viewHistory(UsersData s);
	public void updateQuantity(int id, int q );
	
	public void viewPakages() ;
	
	
	public void returnPackage(int id, String location);
	
	public void makeReport(String reportDefinition , String reportTitle, int onTransactionId ,String name );
	
	
}
