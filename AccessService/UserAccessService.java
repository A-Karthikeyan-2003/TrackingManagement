package AccessService;

import DataModel.Package;
import DataModel.User;

public interface UserAccessService {

	public void addTransaction(int id, String uname,  String address, int quantity);
	
	public void viewTransaction(User s);
	
	public Package getPackage(int id);
	 public void viewHistory(User s);
	public void updateQuantity(int id, int q );
	
	public void viewPakages() ;
	
}
