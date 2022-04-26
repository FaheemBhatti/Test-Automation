package test.rentalService;

import org.apache.log4j.Logger;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import test.rentalService.customer.Customer;

@Getter
@Setter
@ToString
public class RentalService {

	private String orderId;
	private int noOfDays;
	private Double billAmount;
	private Customer customer;
	private static int counter;

	final static Logger logger = Logger.getLogger(RentalService.class);


	public RentalService(int noOfDays ,
			Customer customer) {
		this.noOfDays = noOfDays;
		this.customer = customer;
	}


	public void generateOrderId() {
		logger.info("Generting order id");

		//implement logic here

		logger.info("genaration of order id Completed");
	}

	public void calculateTotalBill() {
		
	}

}
