package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InvoiceDetail {
	private long invoiceDetailId;
	private InvoiceHeader invoiceHeader;
	private int item;
	private String description;
	private double amount;
	public InvoiceDetail(long invoiceDetailId, InvoiceHeader invoiceHeader, int item, String description,
			double amount) {
		super();
		this.invoiceDetailId = invoiceDetailId;
		this.invoiceHeader = invoiceHeader;
		this.item = item;
		this.description = description;
		this.amount = amount;
	}
	
	
}
