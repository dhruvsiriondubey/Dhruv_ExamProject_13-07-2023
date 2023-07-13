package com;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class GameServiceTest {

	@ParameterizedTest
	@MethodSource("data")
	void test(String output, String input) {
		assertEquals(output, GameService.authorSearch(input));
	}

	@Test
	void test1() {
		assertNotNull(GameService.viewAll());
	}

	@Test
	void test2() {
		int size = User.users.size();
		User.addUser("Dhruv", "password");
		assertEquals(size + 1, User.users.size());
	}

	public static Collection data() {
		return Arrays.asList(new Object[][] { { "NOT FOUND", "D" }, { "SnowBird", "danny" }, { "FreshFood", "Ram" },
				{ "NOT FOUND", "X" }, { "YammyTommy", "NarayAn" } });
	}

}
