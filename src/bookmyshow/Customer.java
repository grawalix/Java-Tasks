package bookmyshow;

public class Customer {

	int cid;
	String cname;
	String csurname;
	String city;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCsurname() {
		return csurname;
	}
	public void setCsurname(String csurname) {
		this.csurname = csurname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void printCustomer() {
		System.out.println(cname + " " +csurname);
		System.out.println(city +" ");
	}
	
}
