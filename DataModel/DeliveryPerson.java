package DataModel;

import java.time.LocalDate;

public class DeliveryPerson implements UsersData {


	private String name,email,password,address,contact,dateOfBirth,driverLicenseId;
	
	private int age,id;
	
	private boolean isAvailable = true;
	
	public DeliveryPerson(String name, String email, String password, String address, String contact, String dateOfBirth,
			String driverLicenseId, int id) {
		
		this.name  =   name;
		this.email  =   email;
		this.password  =   password;
		this.address  =   address;
		this.contact  =   contact;
		this.dateOfBirth  =   dateOfBirth;
		this.driverLicenseId  =   driverLicenseId;
		
		try {
			
		int y1  =   Integer.parseInt(dateOfBirth.substring(0,4));
	    String cd  =  	 String.valueOf( LocalDate.now() );
		int y2  =   Integer.parseInt(cd.substring(0,4)  );
		
		int h  =   y2 -y1;
		this.age  =   h;
		
		this.id  =   id;
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}


	public boolean getAvailableStatus() {
		return isAvailable;
	}


	public void setAvailableStatus(boolean isAvailable) {
		this.isAvailable  =   isAvailable;
	}


	public void setName(String name) {
	
		this.name  =   name;
	}

	
	public void setEmail(String email) {
		
		this.email  =   email;
	}


	public void setPassword(String password) {
	
		this.password   =   password;
	}

	
	public void setAddress(String address) {
	
		this.address  =   address;
	}

	
	public void setContact(String contact) {
		
		this.contact  =   contact;
		
	}

	
	public String getName() {
	
		return name;
	}

	
	public String getEmail() {
	
		return email;
	}

	
	public String getPassword() {
		
		return password;
	}

	
	public String getAddress() {
		
		return address;
	}


	public String getContact() {
		
		return contact;
	}


	public int getAge() {
		
		return age;
	}

	
	public String getDateOfBirth() {
		
		return dateOfBirth;
	}

	
	public int getId() {
	
		return id;
	}


	public String getDriverLicenseId() {
		return driverLicenseId;
	}


	@Override
	public String toString() {
		return "\nName =  " + name + ", \nEmail =  " + email + ", \nPassword =  " + password + ", \nAddress =  " + address
				+ ", \nContact =  " + contact + ", \nDate Of Birth =  " + dateOfBirth + ", \nDriver License Id =  " + driverLicenseId + ", \nage =  " + age
				+ ", \nId =  " + id + ",\n Available Status  =  " + isAvailable + "";
	}


	
	
	

	
}
