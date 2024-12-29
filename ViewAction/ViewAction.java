package ViewAction;

import java.util.ArrayList;

import DataModel.Transaction;
import DataModel.UsersData;

public interface ViewAction {

	
	 void viewTransaction( ArrayList<DataModel.Transaction> transactionList, UsersData user ) ;
	
	 void viewHistory( ArrayList<DataModel.Transaction> transactionList, UsersData user );

	void viewReport(ArrayList<DataModel.Report> reportList, UsersData user);
	
}
