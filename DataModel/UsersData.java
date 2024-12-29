package DataModel;

public interface UsersData {

	
	public abstract void setName(String name);
	public abstract void setEmail(String email);
	public abstract void setPassword(String pass);
	public abstract void setAddress(String address);
	public abstract void setContact(String contact);

	
	public abstract String getName();
	public abstract String getEmail();
	public abstract String getPassword();
	public abstract String getAddress();
	public abstract String getContact();
	public abstract int getAge();
	public abstract String getDateOfBirth();
	public abstract int getId();

	
	
}
