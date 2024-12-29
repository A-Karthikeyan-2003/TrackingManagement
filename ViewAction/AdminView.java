package ViewAction;

import java.util.ArrayList;

import DataModel.Admin;
import DataModel.Report;
import DataModel.Transaction;
import DataModel.User;
import DataModel.UsersData;
import TrackingManagementSystem.Status;

public class AdminView implements ViewAction  {

	private static AdminView obj = null;
	
	private AdminView() {
		
	}
	
	public static synchronized AdminView getInstance() {
		if( obj == null )
		{
			obj = new AdminView();
			
		}
		
	
		
		return obj;
	}


	public void viewTransaction(ArrayList<Transaction> transactionList, UsersData user) {
		
		Admin admin = (Admin) user;
		
		
		 for(int i=0; i<transactionList.size(); i++)
		 {
			 Transaction transaction = transactionList.get(i);
			 
		
		 if( transaction.getStatus() == Status.PENDING  || transaction.getStatus() == Status.PROCESSING  ) {
				 
			//	 System.out.println( "\nTransactionId : " + transaction.getTransactionId() + "\nProductName : " + transaction.getProductName() +  "\nDestination : " + transaction.getDestinations()  + "\nQuantity : " + transaction.getQuantity() + "\nRate : " + transaction.getRate() + "\nStatus : " + transaction.getStatus() + " \nSeller : " + transaction.getSellerName()+ "\nOrder Type : " + transaction.getType()  ); 
			
			 System.out.println( transaction.toString() );
			 
				 }
			
				 
				 }
		
	}

	
	public void viewHistory(ArrayList<Transaction> transactionList, UsersData user) {
		
		
		Admin admin = (Admin) user;
		
		
		 for(int i=0; i<transactionList.size(); i++)
		 {
			 Transaction transaction = transactionList.get(i);
			 
		
		 if( transaction.getStatus() == Status.COMPLETED ) {
				 
			//	 System.out.println( "\nTransactionId : " + transaction.getTransactionId() + "\nProductName : " + transaction.getProductName() +  "\nDestination : " + transaction.getDestinations()  + "\nQuantity : " + transaction.getQuantity() + "\nRate : " + transaction.getRate() + "\nStatus : " + transaction.getStatus() + " \nSeller : " + transaction.getSellerName()+ "\nOrder Type : " + transaction.getType()  ); 
			
			 System.out.println( transaction.toString() );
			 
				 }
			
				 
				 }
		
	}


	public void viewReport(ArrayList<Report> reportList, UsersData user) {
	
		 for(int i=0; i<reportList.size(); i++)
		 {
			 Report report = reportList.get(i);
			 	
			 System.out.println( report.toString() );
				 
		}
		
	}
	
	

	

}
