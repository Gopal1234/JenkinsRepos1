package source.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import souce.pack.Calculator;

public class CalculaorTest {

	
	Calculator c=null;
	@BeforeAll
	static public void callFirst()
	{
		System.out.println("Hi");
		
	}
	@BeforeEach
	public void setUp()
	{
		c=new Calculator();
	}
	@Test
	public void addTestCase()
	{
		assertEquals(10, c.add(5,5));
	}
	
	@Test
	public void validDiv()
	{
		assertEquals(3, c.divide(15,5));
	}
	
	@Test
	public void invalidDiv()
	{
ArithmeticException exception=		assertThrows(ArithmeticException.class, ()->c.divide(10, 0));
		assertEquals("Division by zero is not allowed", exception.getMessage());
	}
	
}
