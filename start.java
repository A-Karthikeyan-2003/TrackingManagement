import java.util.*;


import TrackingManagementSystem.TrackingManagement;

public class start  {

	 
	
	  


	public static void main(String[] args) {
		
		Scanner ob =new Scanner(System.in);
		TrackingManagement tt = new TrackingManagement();
	
		while(true)
		{
			
			
			
			System.out.println("Enter Choice : \n1.Login\n2.Register\n3.Exit");
			int ch = ob.nextInt();
			
			 switch(ch)
			 {
			 
			 case 1:
				 
			int st= tt.login();
				
				if( st == 0 )
				{
					System.out.println("Account Not Found .. ! ");
				}
				else if( st < 0 )
				{
					System.out.println("Email and Password Mismatch..");
				}
				 
				 break;
				 
			 case 2:
				 
				  tt.register();
				 
				 break;
			
			 case 3:
				 
				 break;
				 
			default:
				System.out.println("Something Wrong .. Please Try Again .. ");
			 }
			
			
		}
		
	}
	


}
