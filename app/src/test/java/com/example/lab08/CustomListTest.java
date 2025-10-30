package com.example.lab08;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
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
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City Edmonton = new City("Edmonton", "AB");
        list.addCity(Edmonton);
        list.deleteCity(Edmonton);
        // initially fails because deleteCity() does not exist
        assertFalse(list.hasCity(Edmonton));
    }

    @Test
    public void testCountCity() {
        CustomList list = new CustomList();
        City Edmonton = new City("Edmonton", "AB");
        list.addCity(Edmonton);
        // initially fails because countCities() does not exist
        assertEquals(1, list.countCities());
    }
}
