package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity () {
        CustomList list = new CustomList();
        City Edmonton = new City("Edmonton", "AB");
        list.addCity(Edmonton);
        // initially fails because deleteCity() does not exist
        list.deleteCity(Edmonton);
        assertFalse(list.hasCity(Edmonton));
    }
}
