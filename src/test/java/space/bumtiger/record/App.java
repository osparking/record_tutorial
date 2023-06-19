package space.bumtiger.record;

import lombok.extern.slf4j.Slf4j;
import space.bumtiger.record.domain.Invoice;

@Slf4j
public class App {
	public static void main(String[] args) {
		float[] amt = {400f, 600f, 300f, 700f, 600f};
		Invoice[] invoice = new Invoice[5];
		
		for (int i = 0; i <invoice.length; i++) {
			invoice[i] = new Invoice(String.valueOf(i+1), amt[i]);
		}
		
		for (int i = 0; i <invoice.length; i++) {
			App.log.info(invoice[i].toString());
		}
	}
}
