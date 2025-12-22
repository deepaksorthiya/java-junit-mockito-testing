package com.example.spy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

class MockitoSpyWithListTest {

	// demonstrates of the spy function
	@Test
	void ensureSpyForListWorks() {
		var list = new ArrayList<String>();
		var spiedList = spy(list);

		doReturn("42").when(spiedList).get(99);
		String value = spiedList.get(99);

		assertEquals("42", value);
	}
}
