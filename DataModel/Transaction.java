package DataModel;
import TrackingManagementSystem.OrderType;
import TrackingManagementSystem.Status;
public class Transaction {
    
	private int transactionId ;
	
	
	
	private String username,productName, source= "",destinations= "", currentLocation= "",deliveryPersonName= "",sellerName= "";
	private OrderType type;
	private Status status;
	private int quantity,rate;
	



	public Transaction(int transactionId, String username, String productName, Status status, String source,
			String destinations,  String sellerName,
			int quantity,OrderType type,int rate) {
	
		this.transactionId =  transactionId;
		this.username =  username;
		this.productName =  productName;
		this.status =  status;
		this.source =  source;
		this.destinations =  destinations;
		this.sellerName =  sellerName;
		this.quantity =  quantity;
		this.type =  type;
		this.rate =  rate;
		
	}



	public int getRate() {
		return rate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public String getUsername() {
		return username;
	}

	public String getProductName() {
		return productName;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status =  status;
	}

	public String getSource() {
		return source;
	}



	public String getDestinations() {
		return destinations;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation =  currentLocation;
	}

	public String getDeliveryPersonName() {
		return deliveryPersonName;
	}

	public void setDeliveryPersonName(String deliveryPersonName) {
		this.deliveryPersonName =  deliveryPersonName;
	}

	public String getSellerName() {
		return sellerName;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public OrderType getType() {
		return type; // return order or place order ..
	}

	public void setType(OrderType type) {
		this.type =  type;
	}


	
	
	
	public String toString() {
		
		return "-----------------\n\nTransactionId = " + transactionId + ", \nUsername = " + username + ", \nProductName = " + productName
				+ ", \nStatus = " + status + ", \nSource = " + source + ", \nDestinations = " + destinations + ", \nCurrentLocation = "
				+ currentLocation + ", \nDeliveryPersonName= " + deliveryPersonName + ", \nSellerName= " + sellerName
				+ ", \ntype = " + type + ", \nQuantity = " + quantity +  " \nRate = " + rate + "";
	}
	

	
}
