package TrackingManagementSystem;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import AccessService.AdminAccessService;
import AccessService.DeliveryPersonAccessService;
import AccessService.SellerAccessService;
import AccessService.UserAccessService;
import DataModel.Admin;
import DataModel.DeliveryPerson;
import DataModel.Package;
import DataModel.Report;
import DataModel.Seller;
import DataModel.Transaction;
import DataModel.User;
import DataModel.UsersData;
import ViewAction.DeliveryPersonView;
import ViewAction.SellerView;
import ViewAction.UserView;
import ViewAction.ViewAction;





public class TrackingManagement implements UserAccessService , AdminAccessService, SellerAccessService, DeliveryPersonAccessService  {

	private UsersData user = null;
	private Dashboards dashboard;
	
	private static int userid = 0, deliverypersonid = 0, sellerid = 0, adminid=0, transactionid=0, packageid=0, reportid=0;

	
	private  ArrayList<DataModel.User> usersList = new ArrayList<DataModel.User>();
	
	private  ArrayList<DataModel.Seller> sellerList = new ArrayList<DataModel.Seller>();
	
	private  ArrayList<DataModel.Admin> adminList = new ArrayList<DataModel.Admin>();
	
	private  ArrayList<DataModel.DeliveryPerson> deliveryPersonList = new ArrayList<DataModel.DeliveryPerson>();

	private  ArrayList<DataModel.Package> packagesList = new ArrayList<DataModel.Package>();

	private  ArrayList<DataModel.Transaction> transactionList = new ArrayList<DataModel.Transaction>();
	
	
	private  ArrayList<DataModel.Report> reportList = new ArrayList<DataModel.Report>();
	

	
	//-------------------------------------
	
	
	
	public void register() {

		Scanner scannerObj = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = scannerObj.next();

		System.out.println("Enter your Email : ");
		String email = scannerObj.next();

		System.out.println("Enter your password : ");
		String password = scannerObj.next();

		System.out.println("Enter your contact : ");
		String contact = scannerObj.next();

		System.out.println("Enter your address : ");
		String address = scannerObj.next();

		System.out.println("Enter your date of birth : (yyyy-mm-dd) ");
		String dob = scannerObj.next();

		System.out.println("Enter User Type : \t1.Seller\t2.DeliveryPerson\t3.User \t4.Admin\t");
		int userType = scannerObj.nextInt();

		

		if (userType == 1) {
			
			System.out.println("Enter Store Document ID : ");
			String storeDocumentId = scannerObj.next();

			Seller seller = new Seller(name, email, password, address, contact, dob, storeDocumentId, sellerid++);
			sellerList.add(seller);
			
			
		} else if (userType == 2) {
			
			System.out.println("Enter Driver License ID : ");
			String driverLicenseID = scannerObj.next();

			DeliveryPerson deliveryPerson = new DeliveryPerson(name, email, password, address, contact, dob, driverLicenseID, deliverypersonid++);
			deliveryPersonList.add(deliveryPerson);
			 
			
		

		} else if (userType == 3) {

			User buyer = new User(name, email, password, address, contact, dob, userid++);
			usersList.add(buyer);
		

		} else if (userType == 4) {
			
			Admin admin = new Admin(name, email, password, address, contact, dob, adminid++);
			adminList.add(admin);
		
			
		} else {

		}

		System.out.println("Registration completed Successfully..");

	}

	// ----------------------

	public  int login() {

		Scanner scannerObj = new Scanner(System.in);

		System.out.println("Enter your Email : ");
		String email = scannerObj.next();

		System.out.println("Enter your password : ");
		String password = scannerObj.next();
		
		user = LoginAuthenticate.authenticate(email, password, usersList, sellerList, deliveryPersonList, adminList);


		if ( user != null ) {

			dashboard= Navigate.navigation(this,user);
			
			
			
			//=======================
			
			
			while (true) {
				if (dashboard.dashboards() == 1) {
					break;
				}
			}
			
			//=======================

		}

	if(user == null ) {
		return 0;
	}
	else {
		return -1;
	}

	}


	
	
	
	//======================================   SELLER START    ===========================
	

	
	public void addPackage( String packageName, String packageType, int packageQuantity,String packageWeight, String packageRate, String sellerName, String address) {
		
		Package packages = new Package( packageid++ , packageName , packageType ,packageQuantity,  packageWeight , packageRate , sellerName , address  );
		packagesList.add(packages);
	}

	
	public Package getPackage(int id) {
	
		return packagesList.get(id);
	}


	
	
	public void viewPakages() {
		
		System.out.println(packagesList);
	}


	
	 public void viewTransaction(UsersData user) {
		 
		ViewAction viewAction=null;
		
		 if( user instanceof Seller )
		 {
			 viewAction = SellerView.getInstance();
			
		 }
		 
		 
		 if( user instanceof DeliveryPerson )
		 {
			 viewAction = DeliveryPersonView.getInstance();
			 
			 
		 }
	
		 
		 if( user instanceof User )
		 {
			 viewAction = UserView.getInstance();
			 
			
		 }
		 
		 if(viewAction != null)
		 {
			 
			 viewAction.viewTransaction(transactionList, user);
		 
		 }
			 

	} 
	
	 
	 
	 
	 
	 
	 public void viewHistory(UsersData user) {
		 
		 
		 ViewAction viewAction=null;
			
		 if( user instanceof Seller )
		 {
			 viewAction = SellerView.getInstance();
			
		 }
		 
		 
		 if( user instanceof DeliveryPerson )
		 {
			 viewAction = DeliveryPersonView.getInstance();
			 
			 
		 }
	
		 
		 if( user instanceof User )
		 {
			 viewAction = UserView.getInstance();
			 
			
		 }
		 
		 if( viewAction != null)
		 {
			 
			 viewAction.viewHistory(transactionList, user);
	 
		 }
		 
		 
	 }

	
	
 public void viewReport(UsersData user) {
		 
		 
		 ViewAction viewAction=null;
			
		 if( user instanceof Seller )
		 {
			 viewAction = SellerView.getInstance();
			
		 }
		 
		 
		 if( user instanceof DeliveryPerson )
		 {
			 viewAction = DeliveryPersonView.getInstance();
			 
			 
		 }
	
		 
		 if( user instanceof User )
		 {
			 viewAction = UserView.getInstance();
			 
			
		 }
		 
		 if( viewAction != null)
		 {
			 
			 viewAction.viewReport(reportList, user);
	 
		 }
		 
		 
	 }

	 
	 
	
	//=================================    SELLER END   ==========================================
	
	
 	//============================= USER START ======================
	
	
	public void addTransaction(int id, String uname,  String address, int quantity) {
		
		
			Package packageObject = getPackage(id) ;
		
		
		int rate=0;
		try {
			rate = quantity * Integer.parseInt( packageObject.getPackageRate() );
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		if(packageObject!=null) {
			


			
		int updatedQuantity = ( packageObject.getPackageQuantity() ) - quantity;
		
		updateQuantity(id, updatedQuantity);	 
		
		
		Transaction transaction= new Transaction( transactionid++, uname , packageObject.getPackageName() , Status.PENDING , packageObject.getSellerLoc() ,address ,  packageObject.getSellerName() , quantity , OrderType.ORDER , rate  );
		
		transactionList.add(transaction);
		System.out.println("Your Order Booked Successfully..");
		}
		else {
			System.out.println("Product Id not Found");
		}
		
	}
	
	
	
	public void makeReport(  String reportDefinition , String reportTitle, int onTransactionId ,String name ) {
		
		Date currentTime = (Date) Calendar.getInstance().getTime(); 
		Report report = new Report(reportid++, reportTitle, reportDefinition, onTransactionId , name,  String.valueOf(currentTime) ,  Status.PENDING );
		
		reportList.add(report);
		
		System.out.println("\nYour report was send to admin\n");
		System.out.println("You will got a solution in few 2 days of times .. \n");
		
	

	}
	
	public void makeReportReply( int replyId, String replyDef ) {
		
		Report reportObj=null;
		
		for(int i=0; i<reportList.size(); i++)
		{
			Report report = reportList.get(i);
			
			if( report.getReportId() == replyId )
			{
				reportObj = report;
				break;
			}
		}
		
		
		
		Date currentTime = (Date) Calendar.getInstance().getTime(); 
		
		reportObj.setReplyDate(String.valueOf(currentTime));
		reportObj.setReplyFromAdmin(replyDef);
		
		reportObj.setStatus(Status.COMPLETED);
		
		System.out.println("Report sended successfully");
		
		
	}
	

	public void returnPackage(int id, String location)
	{
		Transaction transaction = null;
		 for(int i=0; i<transactionList.size(); i++)
		 {
			 transaction = transactionList.get(i);
			 break;
		 }
		 
		 //transaction.setDeliveryPersonName(location);
		 transaction.setType(OrderType.RETURN);
		 transaction.setStatus(Status.PENDING);
	}
	
	public void updateQuantity(int id, int quantity ) {
		Package packages = packagesList.get(id);
		
		packages.setPackageQuantity(quantity);
	}

	
 // UPDATE QUANTITY	
	
	
	
	
	//========================= USER END =========================

	
	
	// =========================   DELIVERY PERSON START    ========
	

	public void updateDeliveryLocation(int id, String location) {
	
		Transaction transaction =	transactionList.get(id);
		
		transaction.setCurrentLocation(location);
	}


	public void updateDeliveryStatus(int id, String location) {
		
		Transaction transaction =	transactionList.get(id);
		
		transaction.setCurrentLocation(location);
		transaction.setStatus(Status.COMPLETED);
		
	
	}
	
	//============================== DELIVERY PERSON END    ===========

	
	// ============================== ADMIN START =================
	
	
public void viewTransaction() {
		
		for(int i=0; i<transactionList.size(); i++)
		{
			System.out.println("------------------------------------------\n");
			System.out.println( transactionList.get(i).toString() );
			System.out.println("------------------------------------------\n");
		}
		
		
	}


public void viewDeliveryPersons() {
	
	for(int i=0; i<deliveryPersonList.size(); i++ ) { 
		
	System.out.println("------------------------------------------\n");
	System.out.println(deliveryPersonList.get(i));
	System.out.println("------------------------------------------\n");
	
	}	
	
} // ASSIGN ORDER KU VIEW DELIVERY PERSON NEED
 

	

public void assignOrders(int orderId, String deliveryPersonName) {
	
	Transaction transaction = transactionList.get(orderId);
	
	transaction.setDeliveryPersonName(deliveryPersonName);
	
	DeliveryPerson deliveryPerson = null;
	
	for(int i=0; i<deliveryPersonList.size(); i++)
	{
		DeliveryPerson deliveryPerson1 = deliveryPersonList.get(i);
		
		if( deliveryPerson1.getName().equals(deliveryPersonName) )
		{
			deliveryPerson = deliveryPerson1;
			break;
		}
	
	}
	
	deliveryPerson.setAvailableStatus(false);
	
	transaction.setStatus(Status.PROCESSING);
	
	
	
}


public String getDeliveryPersonName(int id) {
	
	return deliveryPersonList.get(id).getName();
}





	
	//=============================== ADMIN END ====================

	
	
}
