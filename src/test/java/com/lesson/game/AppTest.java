package com.lesson.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
@DisplayName("general tests")
public class AppTest {

	Wizard wizard = new Wizard("Wizard");

	@Test
	@DisplayName("Values don't match")
	void notEquals() {
		assertNotEquals(10, 20);
	}

	@Test
	void equals() {
		String variable = "Target VaLuE";
		assertEquals("target value", variable.toLowerCase());
	}

	@Test
	void equalsArray() {
		int[] expected = { 5, 10, 15, 20, 25 };
		int[] actual = { 5, 10, 15, 20, 25 };
		assertArrayEquals(expected, actual, "Values don't match in array...");
	}

	@Test
	void mixedTests() {
		int[] expected = { 5, 10, 15, 20, 25 };
		int[] actual = { 5, 10, 15, 20, 25 };
		assertArrayEquals(expected, actual, "Values don't match in array...");

		assertTrue(actual.length < 10);
		assertTrue(actual.length > 3, "Not enough values in the array.");
		assertEquals(5, actual[0]);
	}

	@Test
	void wizardMagicTest() {
		assertEquals(20, wizard.doMagic(10));
	}

	@Test
	void magicSetTest() {

		Wizard wizard = new Wizard("Wizard");
		wizard.getType();
	}

	@Test
	void checkMagicSetSameAsGet() {
		String spell = "test1";
		wizard.setMagic(spell, 50);
		assertEquals(50, wizard.getMagic(spell));
	}

	@Test
	void wizardMagicCount() {
		wizard.setMagic("spell1", 20);
		wizard.setMagic("spell2", 40);
		wizard.setMagic("spell3", 10);

		// 3 spells already created
		assertEquals(6, wizard.getMagicCount());
	}

	@Test
	void checkSpellNameNotNullTest() {
		wizard.setMagic("", 20);
		assertNotNull(wizard.getMagic(""));
	}

	@Test
	void checkHashDamageEqualDoDamage() {

		int testvalue = wizard.doMagic(50);	
		assertEqual(wizard.doMagicHashMap("blast") * 2, testvalue);

	}

	@Test
	void wizardMock() {
		Wizard wizardObj = Mockito.mock( Wizard.class );
		Mockito.when(wizardObj.getMagicCount()).thenReturn(5000000);
//		Mockito.when(wizardObj.getSalary()).thenReturn(1234);

		System.out.println(wizardObj.getMagicCount());

//		assertEquals(wizardObj.getSalary(), 123);

		// Mockito.when( jobObj.getTitle() ).thenCallRealMethod();
		// System.out.println( jobObj.getTitle() );

		// Mockito.when( jobObj.setTitle("value") ).then

	}
	
	@Test
    public void getInventorytest() {
        Character newCharacter = Mockito.mock( Character.class);
        String[] inventory = {"Sword","Gun"};
        Mockito.when(newCharacter.getInventory()).thenReturn(inventory);
        System.out.println(newCharacter.getInventory());
        assertEquals( newCharacter.getInventory(), inventory );
   }
	
	@Test
	void assertingTrue() {
		assertTrue(true);
	}

	
	


	private void assertEqual(int i, int testvalue) {
		// TODO Auto-generated method stub

	}

}