import java.util.*;


import TrackingManagementSystem.TrackingManagement;

public class start  {

	
	public static void main(String[] args) {
		
		Scanner scannerObj =new Scanner(System.in);
		TrackingManagement transactionManagementObj = new TrackingManagement();
	
		while(true)
		{
			System.out.println("Enter Choice : \n1.Login\n2.Register\n3.Exit");
			int choice = scannerObj.nextInt();
			
			 switch(choice)
			 {
			 
			 case 1:
				 
			int result= transactionManagementObj.login();
				
				if( result == 0 )
				{
					System.out.println("Account Not Found .. ! ");
				}
				
				 break;
				 
			 case 2:
				 
				 transactionManagementObj.register();
				 
				 break;
			
			 case 3:
				 
				 break;
				 
			default:
				System.out.println("Something Wrong .. Please Try Again .. ");
			 }
			
			
		}
		
	}
	


}
