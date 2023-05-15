package zerobase.weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherApplicationTests {

	@Test
	void equalTest () {
	    // given
	    // when
	    // then
		assertEquals(1, 1);
	}

	@Test
	void nullTest () {
	    // given
	    // when
	    // then
		assertNull(null);
	}

	@Test
	void trueTest () {
	    // given
	    // when
	    // then
		assertTrue(1==1);
	}

}
