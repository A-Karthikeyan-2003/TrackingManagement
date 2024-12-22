package DataModel;

import java.time.LocalDate;

public class DeliveryPerson implements UsersData {


	private String name,email,password,address,contact,dob,driver_license_id,status =  "in";
	
	private int age,id;
	
	
	
	public DeliveryPerson(String name, String email, String password, String address, String contact, String dob,
			String driver_license_id, int id) {
		
		this.name  =   name;
		this.email  =   email;
		this.password  =   password;
		this.address  =   address;
		this.contact  =   contact;
		this.dob  =   dob;
		this.driver_license_id  =   driver_license_id;
		
		try {
		int y1  =   Integer.parseInt(dob.substring(0,4));
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


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status  =   status;
	}


	public void setName(String name) {
	
		this.name  =   name;
	}

	
	public void setEmail(String email) {
		
		this.email  =   email;
	}


	public void setPassword(String pass) {
	
		this.password   =   pass;
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

	
	public String getDob() {
		
		return dob;
	}

	
	public int getId() {
	
		return id;
	}


	public String getDriver_license_id() {
		return driver_license_id;
	}


	@Override
	public String toString() {
		return "\nname =  " + name + ", \nemail =  " + email + ", \npassword =  " + password + ", \naddress =  " + address
				+ ", \ncontact =  " + contact + ", \ndob =  " + dob + ", \ndriver_license_id =  " + driver_license_id + ", \nage =  " + age
				+ ", \nid =  " + id + ",\n Status  =  " + status + "";
	}
	
	

	
}
