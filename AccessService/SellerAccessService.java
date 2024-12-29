package AccessService;

import DataModel.Package;
import DataModel.Seller;
import DataModel.UsersData;

public interface SellerAccessService {

	 public void addPackage( String proname, String protype, int proquantity,String proweight, String prorate, String sname, String address);
	
	 public Package getPackage(int id);
	
	 public void updateQuantity(int id, int q );
	
	 public void viewPakages();
	
	 public void viewTransaction(UsersData s);
	 
	 public void viewHistory(UsersData s);
	
}
