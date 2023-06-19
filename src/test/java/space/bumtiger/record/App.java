package space.bumtiger.record;

import lombok.extern.slf4j.Slf4j;
import space.bumtiger.record.domain.Person;

@Slf4j
public class App {
	public static void main(String[] args) {
		Person he = new Person(1, "홍길동");
		Person she = new Person(2, "장화홍련");
		
		App.log.info(he.toString());
		App.log.info(he.equals(she) ? "동일" : "상이");
		App.log.info(he.name());
	}
}
