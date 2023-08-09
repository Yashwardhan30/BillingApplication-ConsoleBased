package Shop.ui;
import Shop.Entity.Customer;
import Shop.dao.ShopDaoImpl;

public class ShopMain {

	public static void main(String[] args) {
		ShopDaoImpl si=new ShopDaoImpl();

		Customer cust=si.createCust();
		cust=si.bill(cust);
		si.generateBill(cust);

	}

}
