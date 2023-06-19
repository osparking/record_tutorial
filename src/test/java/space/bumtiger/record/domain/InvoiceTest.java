package space.bumtiger.record.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class InvoiceTest {

	@Test
	void test() {
		String id = "Y-118NFA";
		var youngChang = new Invoice(id);
		InvoiceTest.log.info(youngChang.id());
		assertThat(youngChang.amount() == 0);
	}

}
