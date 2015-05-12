package io.algorithm.compare;

public class User {

	private int no;
	private String name;
	private String address;
	private String phone;
	

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("no=").append(no).append(", ");
		str.append("name=").append(name).append(", ");
		str.append("address=").append(address).append(", ");
		str.append("phone=").append(phone);
 
		return str.toString();
	}
}
