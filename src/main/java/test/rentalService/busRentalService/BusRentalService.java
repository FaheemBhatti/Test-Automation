package test.rentalService.busRentalService;

import org.apache.log4j.Logger;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import test.rentalService.RentalService;
import test.rentalService.customer.Customer;

@Getter
@Setter
@ToString
public class BusRentalService extends RentalService{
	
	private  String busType;
	private static String[] busTypeArr;
	private static int[] perdayRentArr;
	
	final static Logger logger = Logger.getLogger(BusRentalService.class);
	
	public BusRentalService(int noOfDays , 
			Customer customer, String busType) {
		super(noOfDays , customer);
		this.busType = busType;
	}
	
	public int identifyPerDayRent() {

		logger.info("calculation of the total bill started");

		//implement logic here
		

		logger.info("Succesfully calculated total bill");
		return 0;

	}

	@Override
	public void calculateTotalBill() {
		// TODO Auto-generated method stub
		super.calculateTotalBill();
	}

	
	
	

}
