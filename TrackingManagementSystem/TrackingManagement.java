package TrackingManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import AccessService.AdminAccessService;
import AccessService.DeliveryPersonAccessService;
import AccessService.SellerAccessService;
import AccessService.UserAccessService;
import DataModel.Admin;
import DataModel.DeliveryPerson;
import DataModel.Package;
import DataModel.Seller;
import DataModel.Transaction;
import DataModel.User;
import DataModel.UsersData;

public class TrackingManagement implements UserAccessService , AdminAccessService, SellerAccessService, DeliveryPersonAccessService  {

	private UsersData user;
	private Dashboards t;

	
	static int userid = 0, deliverypersonid = 0, sellerid = 0, adminid=0, transactionid=0, packageid=0;

	
	private  ArrayList<DataModel.User> usersObj = new ArrayList<DataModel.User>();
	
	private  ArrayList<DataModel.UsersData> account = new ArrayList<DataModel.UsersData>();
	
	private  ArrayList<DataModel.Seller> sellerObj = new ArrayList<DataModel.Seller>();
	
	private  ArrayList<DataModel.Admin> adminObj = new ArrayList<DataModel.Admin>();
	
	private  ArrayList<DataModel.DeliveryPerson> deliveryPersonObj = new ArrayList<DataModel.DeliveryPerson>();

	private  ArrayList<DataModel.Package> packagesObj = new ArrayList<DataModel.Package>();

	private  ArrayList<DataModel.Transaction> transactionObj = new ArrayList<DataModel.Transaction>();

	
	//-------------------------------------
	
	public TrackingManagement(){
		
	}
	
	
	public void register() {

		Scanner ob = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = ob.next();

		System.out.println("Enter your Email : ");
		String email = ob.next();

		System.out.println("Enter your password : ");
		String pass = ob.next();

		System.out.println("Enter your contact : ");
		String contact = ob.next();

		System.out.println("Enter your address : ");
		String address = ob.next();

		System.out.println("Enter your date of birth : (yyyy-mm-dd) ");
		String dob = ob.next();

		System.out.println("Enter User Type : \t1.Seller\t2.DeliveryPerson\t3.User \t4.Admin\t");
		int ut = ob.nextInt();

		String c = "";

		if (ut == 1) {
			
			System.out.println("Enter Store Document ID : ");
			String did = ob.next();

			Seller ud = new Seller(name, email, pass, address, contact, dob, did, sellerid++);
			sellerObj.add(ud);
			account.add(ud);
			
		} else if (ut == 2) {
			
			System.out.println("Enter Driver License ID : ");
			String did = ob.next();

			DeliveryPerson ud = new DeliveryPerson(name, email, pass, address, contact, dob, did, deliverypersonid++);
			deliveryPersonObj.add(ud);
			 //ds.add(ud);
			
			account.add(ud);

		} else if (ut == 3) {

			User ud = new User(name, email, pass, address, contact, dob, userid++);
			usersObj.add(ud);
			account.add(ud);

		} else if (ut == 4) {
			
			Admin ud = new Admin(name, email, pass, address, contact, dob, userid++);
			adminObj.add(ud);
			account.add(ud);
			
		} else {

		}

		System.out.println("Registration completed Successfully..");

	}

	// ----------------------

	public  int login() {

		Scanner ob = new Scanner(System.in);

		System.out.println("Enter your Email : ");
		String email = ob.next();

		System.out.println("Enter your password : ");
		String pass = ob.next();
		
		UsersData user =null; //loginSystem(email,pass);

		int c=0;
		

		for(int i=0; i<sellerObj.size(); i++)
		{ UsersData ui = sellerObj.get(i);
			if( ui.getEmail().equals(email) && ui.getPassword().equals(pass) )
			{
				user = ui;
				c=1;
				break;
			}
		}
		
		if( c!=1 )
		{
			for(int i=0; i<usersObj.size(); i++)
			{ UsersData ui = usersObj.get(i);
				if( ui.getEmail().equals(email) && ui.getPassword().equals(pass) )
				{
					user = ui;
					c=1;
					break;
				}
			}
			
		}
		
		if( c!=1 )
		{
			for(int i=0; i<deliveryPersonObj.size(); i++)
			{ UsersData ui = deliveryPersonObj.get(i);
				if( ui.getEmail().equals(email) && ui.getPassword().equals(pass) )
				{
					user = ui;
					c=1;
					break;
				}
			}
			
		}
		
		if( c!=1 )
		{
			for(int i=0; i<sellerObj.size(); i++)
			{ UsersData ui = sellerObj.get(i);
				if( ui.getEmail().equals(email) && ui.getPassword().equals(pass) )
				{
					user = ui;
					c=1;
					break;
				}
			}
			
		}
		
		if( c!=1 )
		{
			for(int i=0; i<adminObj.size(); i++)
			{ UsersData ui = adminObj.get(i);
				if( ui.getEmail().equals(email) && ui.getPassword().equals(pass) )
				{
					user = ui;
					c=1;
					break;
				}
			}
			
		}
		
		


		if ( c==1 ) {

			 t = Navigate.navigation(this,user);
			
			
			
			//=======================
			
			
			while (true) {
				if (t.Dash() == 1) {
					break;
				}
			}
			
			//=======================

		}

	
		return c;

	}


	
	
	
	//======================================   SELLER START    ===========================
	
	
	
	
	
	
	public void addPackage( String proname, String protype, int proquantity,String proweight, String prorate, String sname, String address) {
		
		Package pac = new Package( packageid++ , proname , protype ,proquantity,  proweight , prorate , sname , address  );
		packagesObj.add(pac);
	}

	
	public Package getPackage(int id) {
	
		return packagesObj.get(id);
	}



	

	
	
	public void viewPakages() {
		
		System.out.println(packagesObj);
	}


	
	 public void viewTransaction(Seller s) {
		 
		 for(int i=0; i<transactionObj.size(); i++)
		 {
			 Transaction t = transactionObj.get(i);
			 
			 
			 if( ( t.getSellerName().equals( s.getName()  ) ) && ( ( t.getStatus().equals("Processing") ) || t.getStatus().equals("Pending") )  )
			 {
				 
				 if( t.getStatus().equals("Pending") ) {
					 System.out.println( "\nTransactionId : " + t.getTransactionId() + "\nProductName : " + t.getProductName() +  "\nDestination : " + t.getDestinations()  + "\nQuantity : " + t.getQuantity() + "\nRate : " + t.getRate() + "\nStatus : " + t.getStatus() + " \nUsername : " + t.getUsername()  ); 
				
				 }
				 else {
					 System.out.println( "\nTransactionId : " + t.getTransactionId()  + "\nProductName : " + t.getProductName() +  "\nDestination : " + t.getDestinations() + "\nDeliveryPersonName : " + t.getDeliveryPersonName() + "\nQuantity : " + t.getQuantity() + "\nRate : " + t.getRate() + "Status : " + t.getStatus() + "Current Location : " + t.getCurrentLocation() + " \nUsername : " + t.getUsername()   ); 
						 
					 
				 } 
				 
			 }
		 }
		 
		

	} // history for seller and also track seller product ..
	
	 
	 
	 
	 public void viewHistory(Seller s) {
		 
		 for(int i=0; i<transactionObj.size(); i++)
		 {
			 Transaction t = transactionObj.get(i);
			 
			 
			 if( ( t.getSellerName().equals( s.getName()  ) ) && ( t.getStatus().equals("Completed") )  )
			 {
				 System.out.println( "\nTransactionId : " + t.getTransactionId() + "\nUsername : " + t.getUsername() + "\nProductName : " + t.getProductName() +  "\nDestination : " + t.getDestinations() + "\nDeliveryPersonName : " + t.getDeliveryPersonName() + "\nQuantity : " + t.getQuantity() + "\nRate : " + t.getRate() ); 
			 }
		 }
		 
		 
		 
	 }

	
	
	
	//=================================    SELLER END   ==========================================
	
	
//============================= USER START ======================
	
	
	public void addTransaction(int id, String uname,  String address, int quantity) {
		
		
		
		
		
			Package proobj = getPackage(id) ;
		
		
		int r=0;
		try {
		 r = quantity * Integer.parseInt( proobj.getPackageRate() );
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		if(proobj!=null) {
			


			
		int h = ( proobj.getPackageQuantity() ) -quantity;
		
		updateQuantity(id, h);
		
		
		
		 
		Transaction t = new Transaction( transactionid++, uname , proobj.getPackageName() , "Pending" , proobj.getSellerLoc() ,address ,  proobj.getSellerName() , quantity , "OrderPlace" , r  );
		
		transactionObj.add(t);
		System.out.println("Your Order Booked Successfully..");
		}
		else {
			System.out.println("Product Id not Found");
		}
		
	}
	
	
	
	public void viewTransaction(User s) {
		
		
		 for(int i=0; i<transactionObj.size(); i++)
		 {
			 Transaction t = transactionObj.get(i);
			 
			 
			 if( ( t.getUsername().equals( s.getName()  ) ) && ( ( t.getStatus().equals("Processing") ) || t.getStatus().equals("Pending") )  )
			 {
				 if(t.getStatus().equals("Pending") ) {
				 
				 System.out.println( "\nTransactionId : " + t.getTransactionId() + "\nProductName : " + t.getProductName() +  "\nDestination : " + t.getDestinations()  + "\nQuantity : " + t.getQuantity() + "\nRate : " + t.getRate() + "\nStatus : " + t.getStatus() + " \nSeller : " + t.getSellerName()  ); 
			
				 }
				 else {
					 System.out.println( "\nTransactionId : " + t.getTransactionId()  + "\nProductName : " + t.getProductName() +  "\nDestination : " + t.getDestinations() + "\nDeliveryPersonName : " + t.getDeliveryPersonName() + "\nQuantity : " + t.getQuantity() + "\nRate : " + t.getRate() + "Status : " + t.getStatus() + "Current Location : " + t.getCurrentLocation() ); 
				 }
				 
				 }
		 }
		
		
	} 
	
	

	 public void viewHistory(User s) {
		 

		 
		 for(int i=0; i<transactionObj.size(); i++)
		 {
			 Transaction t = transactionObj.get(i);
			 
			 
			 if( ( t.getUsername().equals( s.getName()  ) ) && ( t.getStatus().equals("Completed") )  )
			 {
				 System.out.println( "\nTransactionId : " + t.getTransactionId() + "\nDeliveryPerson : " + t.getDeliveryPersonName() + "\nProductName : " + t.getProductName() +  "\nDestination : " + t.getDestinations() + "\nDeliveryPersonName : " + t.getDeliveryPersonName() + "\nQuantity : " + t.getQuantity() + "\nRate : " + t.getRate() + "\nSeller Name : "+ t.getSellerName() ); 
			 }
		 }
		 
		 
	 }

	
	// TRACK AND HISTORY 



	
	
	public void updateQuantity(int id, int q ) {
		Package f = packagesObj.get(id);
		
		f.setPackageQuantity(q);
	}

	
 // UPDATE QUANTITY	
	
	
	
	
	//========================= USER END =========================

	
	
	// =========================   DELIVERY PERSON START    ========
	
	
	public void viewTransaction(DeliveryPerson dp ) {
		
		
		 for(int i=0; i<transactionObj.size(); i++)
		 {
			 Transaction t = transactionObj.get(i);
			 
			 
			 if( ( t.getDeliveryPersonName().equals( dp.getName()  ) ) && ( ( t.getStatus().equals("Processing") ) )  )
			 {
	 
				 System.out.println( "\nTransactionId : " + t.getTransactionId() + "\nUsername : " + t.getUsername() + "\nProductName : " + t.getProductName() +  "\nDestination : " + t.getDestinations() + "\nDeliveryPersonName : " + t.getDeliveryPersonName() + "\nQuantity : " + t.getQuantity() + "\nRate : " + t.getRate() + "\nStatus : " + t.getStatus() + "\nSource : " + t.getSource() + "\nSeller Name : " + t.getSellerName() + "Current Location : " + t.getCurrentLocation());

			 }
		 }
		 
	
	} // VIEW MY ORDER AND ALSO HISTORY

	

	public void updateDeliveryLocation(int id, String loc) {
	
		Transaction g =	transactionObj.get(id);
		
		g.setCurrentLocation(loc);
	}


	public void updateDeliveryStatus(int id, String loc) {
		
		Transaction g =	transactionObj.get(id);
		
		g.setCurrentLocation(loc);
		g.setStatus("Completed");
		
	
	}

	
	 public void viewHistory(DeliveryPerson s) {
		 
		 
		 
		 for(int i=0; i<transactionObj.size(); i++)
		 {
			 Transaction t = transactionObj.get(i);
			 
			 
			 if( ( t.getDeliveryPersonName().equals( s.getName()  ) ) && ( t.getStatus().equals("Completed") )  )
			 {
				 System.out.println( "\nTransactionId : " + t.getTransactionId()  + "\nProductName : " + t.getProductName() +  "\nDestination : " + t.getDestinations() + "\nQuantity : " + t.getQuantity() + "\nRate : " + t.getRate() + "\nSeller : " +  t.getSellerName() + "\nSource : " + t.getSource() + "\nUsername : " + t.getUsername() + "\nOrder Type : " + t.getType() ); 
			 }
		 }
		 
	
		 
	 }

	
	
	//============================== DELIVERY PERSON END    ===========

	
	// ============================== ADMIN START =================
	
	
public void viewTransaction() {
		
		for(int i=0; i<transactionObj.size(); i++)
		{
			System.out.println("------\n");
			System.out.println( transactionObj.get(i).toString() );
			System.out.println("------\n");
		}
		
		
	}


public void viewDeliveryPersons() {
	
	for(int i=0; i<deliveryPersonObj.size(); i++ ) { 
		
	System.out.println("------\n");
	System.out.println(deliveryPersonObj.get(i));
	System.out.println("------\n");
	
	}	
	
} // ASSIGN ORDER KU VIEW DELIVERY PERSON NEED
 

	

public void assignOrders(int Orderid, String DeliveryPersonName) {
	
	Transaction t = transactionObj.get(Orderid);
	
	t.setDeliveryPersonName(DeliveryPersonName);
	t.setStatus("Processing");
	
	
}


public String getDeliveryPersonName(int id) {
	
	return deliveryPersonObj.get(id).getName();
}



	
	//=============================== ADMIN END ====================

	
	
}
