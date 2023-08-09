package Shop.Entity;

public class Customer {
	private int custId;
	private String custName;
	private String mobNo;
	private Address addr;
	private Product[] parr;
	private Bill bill;
	
	public Customer(int custId, String custName, String mobNo, Address addr, Product[] parr) {
		
		this.custId = custId;
		this.custName = custName;
		this.mobNo = mobNo;
		this.addr = addr;
		this.parr = parr;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Product[] getParr() {
		return parr;
	}
	public void setParr(Product[] parr) {
		this.parr = parr;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
}
