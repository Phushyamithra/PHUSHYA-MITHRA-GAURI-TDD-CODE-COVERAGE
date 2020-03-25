package Epam.TDDTESTING;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEpam {
	@Test
	void test1()
	{assertEquals("BCD",DelA.del("ABCD"));}
	@Test
	void test2()
	{assertEquals("CD",DelA.del("AACD"));}
	@Test
	void test3()
		{assertEquals("BBCD",DelA.del("BBCD"));}
	@Test
	void test4()
		{assertEquals("BBAA",DelA.del("AABBAA"));}
}
