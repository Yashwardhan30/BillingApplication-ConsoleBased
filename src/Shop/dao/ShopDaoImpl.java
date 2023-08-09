package Shop.dao;
import java.util.Scanner;
import Shop.Entity.*;

public class ShopDaoImpl {
	Scanner sc=new Scanner(System.in);
	Product parr[];

	public Customer createCust() {
		

		Customer cust=null;

		return cust;
	}

	public Customer bill(Customer cust) {
		
		return cust;
	}

	public void generateBill(Customer cust) {
		Product[] parr=cust.getParr();
		System.out.println("\t________________________________________________________________");
		System.out.println("\t                          TAX INVOICE");
		System.out.println("\t________________________________________________________________");
		System.out.println("\t                     YASHRAJ SHOPING CENTER                     ");
		System.out.println("\t                              PUNE                              ");
		System.out.println("\t________________________________________________________________");
		System.out.println("\n\t------------------------CUSTOMER DETAILS------------------------");
		System.out.println("\n\t\t\tCustomer ID         "+cust.getCustId());
		System.out.println("\t\t\tCustomer name       "+cust.getCustName());
		System.out.println("\t\t\tCustomer mobile no. "+cust.getMobNo());
		System.out.println("\t----------------------------------------------------------------");
		System.out.println("\t                        Customer Address                        \n\t\t"+cust.getAddr().getCity()+",\t"+cust.getAddr().getState()+",\t"+cust.getAddr().getPincode());
		System.out.println("\t________________________________________________________________");
		System.out.println("\t------------------------------BILL------------------------------");
		System.out.println("\t________________________________________________________________");
		System.out.println("\tProduct Id\tProduct Name\t\tQuantity\tPrice(Rs.)");
		for(int i=0;i<parr.length;i++) {
			System.out.println("\t\t"+parr[i].getProdId()+"\t"+parr[i].getProdName()+"\t\t\t"+parr[i].getProdQty()+"\t\t"+parr[i].getProdPrice());
		}
		System.out.println("\t________________________________________________________________");
		System.out.println("\t________________________________________________________________");
		System.out.println("\t\t\t\t\t\t      Total : Rs."+cust.getBill().getTotal());
		System.out.println("\t\t\t\t\t\t       CGST : Rs."+cust.getBill().getCgst());
		System.out.println("\t\t\t\t\t\t       SGST : Rs."+cust.getBill().getSgst());
		System.out.println("\t________________________________________________________________");
		System.out.println("\t\t\t\t\t\tFINAL T0TAL : Rs."+cust.getBill().getFinalTotal());
		System.out.println("\t================================================================");
		System.out.println("\t\t*Final Total is Inclusive of all taxes.");
		System.out.println("\t\t**This is a computer generated invoice and should be\n\t  treated as signed by an authorised signatory.");
		System.out.println("\t\t***For any queries, please call \n\t   Customer Care-1800-104 7628");
		System.out.println("\t________________________________________________________________");
		System.out.println("\t                            THANK YOU                           ");
		System.out.println("\t                       PLEASE VISIT AGAIN                       ");
		System.out.println("\t________________________________________________________________");
	}

}
