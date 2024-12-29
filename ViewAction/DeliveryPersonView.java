package ViewAction;

import java.util.ArrayList;

import DataModel.DeliveryPerson;
import DataModel.Report;
import DataModel.Transaction;
import DataModel.UsersData;
import TrackingManagementSystem.Status;

public class DeliveryPersonView implements ViewAction {
	
	private static DeliveryPersonView obj = null;
	
	private DeliveryPersonView() {
		
	}
	
	public static synchronized DeliveryPersonView getInstance() {
		if( obj == null )
		{
			obj = new DeliveryPersonView();
			
		}
		
		return obj;
	}
	

	
	
	public void viewTransaction( ArrayList<Transaction> transactionList, UsersData ob ) {

		DeliveryPerson deliveryPersonObj = (DeliveryPerson) ob;
		
		 for(int i=0; i<transactionList.size(); i++)
		 {
			 Transaction transaction = transactionList.get(i);
			 
			 
			 if( ( transaction.getDeliveryPersonName().equals( deliveryPersonObj.getName()  ) ) && ( ( transaction.getStatus() == Status.PROCESSING ) )  )
			 {
	 
				 System.out.println( "\nTransactionId : " + transaction.getTransactionId() + "\nUsername : " + transaction.getUsername() + "\nProductName : " + transaction.getProductName() +  "\nDestination : " + transaction.getDestinations() + "\nQuantity : " + transaction.getQuantity() + "\nRate : " + transaction.getRate() + "\nStatus : " + transaction.getStatus() + "\nSource : " + transaction.getSource() + "\nSeller Name : " + transaction.getSellerName() + "\nCurrent Location : " + transaction.getCurrentLocation() + "\nOrder Type : " + transaction.getType());

			 }
		 }
		 
		
	}


	public void viewHistory( ArrayList<Transaction> transactionList, UsersData ob ) {
	
		DeliveryPerson deliveryPersonObj = (DeliveryPerson) ob;
		 
		 for(int i=0; i<transactionList.size(); i++)
		 {
			 Transaction transaction = transactionList.get(i);
			 
			 
			 if( ( transaction.getDeliveryPersonName().equals( deliveryPersonObj.getName()  ) ) && ( transaction.getStatus() == Status.COMPLETED )  )
			 {
				 System.out.println( "\nTransactionId : " + transaction.getTransactionId()  + "\nProductName : " + transaction.getProductName() +  "\nDestination : " + transaction.getDestinations() + "\nQuantity : " +transaction.getQuantity() + "\nRate : " +transaction.getRate() + "\nSeller : " +  transaction.getSellerName() + "\nSource : " + transaction.getSource() + "\nUsername : " + transaction.getUsername() + "\nOrder Type : " +transaction.getType() ); 
			 }
		 }
		 
	
		
	}

	@Override
	public void viewReport(ArrayList<Report> reportList, UsersData user) {
		
		
	}

}
