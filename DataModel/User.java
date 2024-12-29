package DataModel;

import java.time.LocalDate;

public class User implements UsersData{

	
	private String name,email,password,address,contact,dateOfBirth;
	
	private int age,id;
	
	
	
	public User(String name, String email, String password, String address, String contact, String dateOfBirth,
			int id) {
	
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact = contact;
		this.dateOfBirth = dateOfBirth;
		
		try {
		int y1 = Integer.parseInt(dateOfBirth.substring(0,4));
	    String cd =	 String.valueOf( LocalDate.now() );
		int y2 = Integer.parseInt(cd.substring(0,4)  );
		
		int h = y2 -y1;
		this.age = h;
		this.age = h;
		this.id = id;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


	public void setName(String name) {
	
		this.name = name;
	}

	
	public void setEmail(String email) {
		
		this.email = email;
	}


	public void setPassword(String pass) {
	
		this.password  = pass;
	}

	
	public void setAddress(String address) {
	
		this.address = address;
	}

	
	public void setContact(String contact) {
		
		this.contact = contact;
		
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


	
	public String toString() {
		return "Name = " + name + ", Email = " + email + ", Password = " + password + ", Address = " + address
				+ ", Contact = " + contact + ", Date Of Birth = " + dateOfBirth + ", Age = " + age + ", Id = " + id + "";
	}

	
	
	
}
