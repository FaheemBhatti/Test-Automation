package test.rentalService.customer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.regex.*;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Customer {

	private String mobNumber;
	private String customerName;

	public Customer(String mobNumber, String customerName) {
		this.customerName = customerName;
		this.mobNumber = mobNumber;	
	}

	public Customer() {}

	public Boolean validateCustDetails() {

		Pattern p = Pattern.compile("^\\d{10}$");
		Matcher m = p.matcher(mobNumber);

		return (m.matches());
	}


}
