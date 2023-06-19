package space.bumtiger.record.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class InvoiceTest {

	@Test
	void test() {
		String id = "Y-118NFA";
		var youngChang = new Invoice(id, 500000);
		InvoiceTest.log.info(youngChang.id());
		assertThat(youngChang.id().indexOf(id) > 0);
	}

}
