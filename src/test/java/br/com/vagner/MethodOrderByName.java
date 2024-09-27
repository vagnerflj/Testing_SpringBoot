package br.com.vagner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@Order(1)
@TestMethodOrder(MethodOrderer.MethodName.class)
class MethodOrderByName {

	@Test
	void testA() {
		System.out.println("Running Test A");
		
	}
	@Test
	void testB() {
		System.out.println("Running Test B");
		
	}
	@Test
	void testC() {
		System.out.println("Running Test C");
		
	}

}
