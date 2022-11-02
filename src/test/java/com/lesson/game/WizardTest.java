package com.lesson.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
@DisplayName("Wizard Tests")
public class WizardTest {

	Wizard wizard = new Wizard("Wizard");

	@Test
    public void maxSpells() {
        Wizard wizzy = Mockito.mock( Wizard.class);
        Mockito.when(wizzy.getMagicCount()).thenReturn(7);
        System.out.println(wizzy.getMagicCount());
        assertEquals(true, wizzy.maxSpells());
        
//        assertEquals(7, wizzy.getMagicCount());
//        assertEquals(false, wizzy.maxSpells());
        
//        Mockito.when(newCharacter.getInventory()).thenReturn(inventory);
//        System.out.println(newCharacter.getInventory());
//        assertEquals( newCharacter.getInventory(), inventory );
   }
}