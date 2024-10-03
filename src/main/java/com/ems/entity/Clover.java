package com.ems.entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "clover")
public class Clover {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    private String name;
    private String username;
	private String address1;
	private String hobbies;
	private String city;
	private String state;
	private String pannumber;
	private String pin;
	private String birthdate;
	public Clover() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clover(long id, String name,String username, String address1, String hobbies, String city,
			String state, String pannumber, String pin, String birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.username =username;
		this.address1 = address1;
	    this.hobbies = hobbies;
	    this.city = city;
		this.state = state;
		this.pannumber = pannumber;
		this.pin = pin;
		this.birthdate = birthdate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPannumber() {
		return pannumber;
	}
	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Clover [id=" + id + ", name=" + name + ", username=" + username + ", address1=" + address1
				+ ", hobbies=" + hobbies + ", city=" + city + ", state=" + state + ", pannumber=" + pannumber + ", pin="
				+ pin + ", birthdate=" + birthdate + "]";
	}
	
	
	

	
}