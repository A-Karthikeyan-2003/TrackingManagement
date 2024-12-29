package ViewAction;

import java.util.ArrayList;

import DataModel.Report;
import DataModel.Seller;
import DataModel.Transaction;
import DataModel.UsersData;
import TrackingManagementSystem.Status;

public class SellerView implements ViewAction {

	
	
	private static SellerView obj = null;
	
	private SellerView() {
		
	}
	
	public static synchronized SellerView getInstance() {
		if( obj == null )
		{
			obj = new SellerView();
			
		}
		
		return obj;
	}
	

	
	public void viewTransaction( ArrayList<Transaction> transactionList , UsersData ob ) {
	
	Seller seller = (Seller) ob ;
		
		 for(int i=0; i<transactionList.size(); i++)
		 {
			 Transaction transaction = transactionList.get(i);
			 
			 
			 if( ( transaction.getSellerName().equals( seller.getName()  ) ) && ( ( transaction.getStatus() == Status.PROCESSING ) || transaction.getStatus() == Status.PENDING )  )
			 {
				 
				 if( transaction.getStatus() == Status.PENDING ) {
					 System.out.println( "\nTransactionId : " + transaction.getTransactionId() + "\nProductName : " + transaction.getProductName() +  "\nDestination : " +transaction.getDestinations()  + "\nQuantity : " + transaction.getQuantity() + "\nRate : " + transaction.getRate() + "\nStatus : " + transaction.getStatus() + " \nUsername : " + transaction.getUsername() + "\nOrder Type : " + transaction.getType()  ); 
				
				 }
				 else {
					 System.out.println( "\nTransactionId : " +transaction.getTransactionId()  + "\nProductName : " +transaction.getProductName() +  "\nDestination : " + transaction.getDestinations() + "\nDeliveryPersonName : " + transaction.getDeliveryPersonName() + "\nQuantity : " + transaction.getQuantity() + "\nRate : " + transaction.getRate() + "\nStatus : " + transaction.getStatus() + "\nCurrent Location : " + transaction.getCurrentLocation() + " \nUsername : " + transaction.getUsername() + "\nOrder Type : " + transaction.getType()   ); 
						 
					 
				 } 
				 
			 }
		 }
//		 
		
	}
  
	
	public void viewHistory( ArrayList<Transaction> transactionList , UsersData ob ) {
		
		Seller seller = (Seller) ob ;
		 
		 for(int i=0; i<transactionList.size(); i++)
		 {
			 Transaction transaction = transactionList.get(i);
			 
			 
			 if( ( transaction.getSellerName().equals( seller.getName()  ) ) && ( transaction.getStatus() == Status.COMPLETED )  )
			 {
				 System.out.println( "\nTransactionId : " + transaction.getTransactionId() + "\nUsername : " + transaction.getUsername() + "\nProductName : " + transaction.getProductName() +  "\nDestination : " + transaction.getDestinations() + "\nDeliveryPersonName : " + transaction.getDeliveryPersonName() + "\nQuantity : " + transaction.getQuantity() + "\nRate : " + transaction.getRate() ); 
			 }
		 }
		 
		 
		
	}

	
	
	
	public void viewReport(ArrayList<Report> reportList, UsersData user) {
	
		
	}

}
