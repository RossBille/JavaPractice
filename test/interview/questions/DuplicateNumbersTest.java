/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rossbille
 */
public class DuplicateNumbersTest
{
	
	public DuplicateNumbersTest()
	{
	}
	
	@BeforeClass
	public static void setUpClass()
	{
	}
	
	@AfterClass
	public static void tearDownClass()
	{
	}
	
	@Before
	public void setUp()
	{
	}
	
	@After
	public void tearDown()
	{
	}

	

	/**
	 * Test of findDuplicate method, of class DuplicateNumbers.
	 */
	@Test
	public void testFindDuplicate()
	{
		System.out.println("findDuplicate");
		int expResult = 7;
		List<Integer> ints = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,expResult});
		
		int result = DuplicateNumbers.findDuplicate(ints);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDuplicate method, of class DuplicateNumbers.
	 */
	@Test
	public void testGetDuplicate()
	{
		System.out.println("getDuplicate");
		List<Integer> ints = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9});
		int result = DuplicateNumbers.getDuplicate(ints);
		assertTrue(ints.contains(result));
	}
	
	@Test 
	public void testFindDuplicateEmpty(){
		System.out.println("getDuplicate-Fail");
		List<Integer> ints = new LinkedList();
		int result = DuplicateNumbers.findDuplicate(ints);
		int expected = -1;
		assertEquals(expected,result);
	}
	
}
