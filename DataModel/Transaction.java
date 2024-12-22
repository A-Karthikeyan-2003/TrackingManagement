package DataModel;
public class Transaction {
    
	private int TransactionId ;
	
	private String Username,ProductName, Status= "Pending", Source= "",Destinations= "", CurrentLocation= "",DeliveryPersonName= "",SellerName= "";
	private String type;
	private int Quantity,rate;
	



	public Transaction(int transactionId, String username, String productName, String status, String source,
			String destinations,  String sellerName,
			int quantity,String type,int rate) {
	
		TransactionId =  transactionId;
		Username =  username;
		ProductName =  productName;
		Status =  status;
		Source =  source;
		Destinations =  destinations;
		SellerName =  sellerName;
		Quantity =  quantity;
		this.type =  type;
		this.rate =  rate;
		
	}

	
	public int getRate() {
		return rate;
	}

	public int getTransactionId() {
		return TransactionId;
	}

	public String getUsername() {
		return Username;
	}

	public String getProductName() {
		return ProductName;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status =  status;
	}

	public String getSource() {
		return Source;
	}



	public String getDestinations() {
		return Destinations;
	}

	public String getCurrentLocation() {
		return CurrentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		CurrentLocation =  currentLocation;
	}

	public String getDeliveryPersonName() {
		return DeliveryPersonName;
	}

	public void setDeliveryPersonName(String deliveryPersonName) {
		DeliveryPersonName =  deliveryPersonName;
	}

	public String getSellerName() {
		return SellerName;
	}
	
	public int getQuantity() {
		return Quantity;
	}

	public String getType() {
		return type; // return order or place order ..
	}

	public void setType(String type) {
		this.type =  type;
	}


	
	
	
	public String toString() {
		
		return "-----------------\n\nTransactionId = " + TransactionId + ", \nUsername = " + Username + ", \nProductName = " + ProductName
				+ ", \nStatus = " + Status + ", \nSource = " + Source + ", \nDestinations = " + Destinations + ", \nCurrentLocation = "
				+ CurrentLocation + ", \nDeliveryPersonName= " + DeliveryPersonName + ", \nSellerName= " + SellerName
				+ ", \ntype = " + type + ", \nQuantity = " + Quantity +  " \nRate = " + rate + "";
	}
	

	
}
