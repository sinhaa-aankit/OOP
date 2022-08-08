package com.mindtree.day3;

public class BankCustomerDetails {
	 int custid;
	 String custName;
	 long MobNo;
	 String Address;
	 double Bal;
	 
	 BankCustomerDetails() {}
	 BankCustomerDetails(int custid, String name, long mob, String addr, double bal) {
		 this.custid = custid;
		 this.custName = name;
		 this.MobNo = mob;
		 this.Address = addr;
		 this.Bal = bal;
	 }
	 public void setCustId(int cId) {
		 this.custid = cId;
	 }
	 
	 public void setCustName(String cName) {
		 this.custName = cName;
	 }
	 
	 public void setMobileNo(long mNo) {
		 this.MobNo = mNo;
	 }
	 
	 public void setAddress(String addr) {
		 this.Address = addr;
	 }
	 
	 public void setBalance(double bal) {
		 this.Bal = bal;
	 }
	 
	 
	 public int getCustId() {
		 return custid;
	 }
	 
	 
	 public String getName() {
		 return custName;
	 }
	 
	 public long getMobNo() {
		 return MobNo;
	 }
	 
	 public String getAddres() {
		 return Address;
	 }
	 
	 public double getBalance() {
		 return Bal;
	 }
	 

}
