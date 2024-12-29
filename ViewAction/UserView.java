package ViewAction;

import java.util.ArrayList;

import DataModel.Report;
import DataModel.Transaction;
import DataModel.User;
import DataModel.UsersData;
import TrackingManagementSystem.Status;

public class UserView implements ViewAction {

private static UserView obj = null;
	
	private UserView() {
		
	}
	
	public static synchronized UserView getInstance() {
		if( obj == null )
		{
			obj = new UserView();
			
		}
		
		return obj;
	}
	
	
	
	@Override
	public void viewTransaction( ArrayList<Transaction> transactionList , UsersData ob ) {
		
		User user = (User) ob;
		
	
		 for(int i=0; i<transactionList.size(); i++)
		 {
			 Transaction transaction = transactionList.get(i);
			 
		
			 if( ( transaction.getUsername().equals( user.getName()  ) ) && ( ( transaction.getStatus() == Status.PROCESSING ) || transaction.getStatus() == Status.PENDING )  )
			 {
				 if(transaction.getStatus() == Status.PENDING ) {
				 
				 System.out.println( "\nTransactionId : " + transaction.getTransactionId() + "\nProductName : " + transaction.getProductName() +  "\nDestination : " + transaction.getDestinations()  + "\nQuantity : " + transaction.getQuantity() + "\nRate : " + transaction.getRate() + "\nStatus : " + transaction.getStatus() + " \nSeller : " + transaction.getSellerName()+ "\nOrder Type : " + transaction.getType()  ); 
			
				 }
				 else {
					 System.out.println( "\nTransactionId : " +transaction.getTransactionId()  + "\nProductName : " + transaction.getProductName() +  "\nDestination : " + transaction.getDestinations() + "\nDeliveryPersonName : " + transaction.getDeliveryPersonName() + "\nQuantity : " + transaction.getQuantity() + "\nRate : " + transaction.getRate() + "\nStatus : " + transaction.getStatus() + "\nCurrent Location : " + transaction.getCurrentLocation()+ "\nOrder Type : " + transaction.getType() ); 
				 }
				 
				 }
		 }
		
	}

	
	
	@Override
	public void viewHistory( ArrayList<Transaction> transactionList , UsersData ob  ) {
		
		User user = (User) ob;
		 
		 for(int i=0; i<transactionList.size(); i++)
		 {
			 Transaction transaction = transactionList.get(i);
			 
			 
			 if( ( transaction.getUsername().equals( user.getName()  ) ) && ( transaction.getStatus() == Status.COMPLETED )  )
			 {
				 System.out.println( "\nTransactionId : " + transaction.getTransactionId() + "\nDeliveryPerson : " + transaction.getDeliveryPersonName() + "\nProductName : " + transaction.getProductName() +  "\nDestination : " + transaction.getDestinations() + "\nDeliveryPersonName : " + transaction.getDeliveryPersonName() + "\nQuantity : " + transaction.getQuantity() + "\nRate : " + transaction.getRate() + "\nSeller Name : "+ transaction.getSellerName()+ "\nOrder Type : " + transaction.getType() ); 
			 }
		 }
		 
		
		
	}


	
	
	public void viewReport(ArrayList<Report> reportList, UsersData user) {
		
		
	}

}
