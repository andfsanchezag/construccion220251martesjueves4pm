package app.domain.models;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InvoiceHeader {
	private long invoiceHeaderId;
	private Person person;
	private Partner partner;
	private Date createdDate;
	private double amount;
	private boolean status;
	
	public InvoiceHeader(long invoiceHeaderId, Person person, Partner partner, Date createdDate, double amount,
			boolean status) {
		super();
		this.invoiceHeaderId = invoiceHeaderId;
		this.person = person;
		this.partner = partner;
		this.createdDate = createdDate;
		this.amount = amount;
		this.status = status;
	}
	
	
}
