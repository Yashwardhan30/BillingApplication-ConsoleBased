package Shop.dao;
import Shop.Entity.Customer;

public interface ShopDao {
	
	public Customer createCust();
	public Customer bill(Customer cust);
	public void generateBill(Customer cust);

}
