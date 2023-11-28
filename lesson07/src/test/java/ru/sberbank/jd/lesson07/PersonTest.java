package ru.sberbank.jd.lesson07;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testToString() {
        Person person = new Person("Alina", "Omsk", 33);
        assertEquals("Person{name='Alina', city='Omsk', age=33}", person.toString());
    }

    @Test
    public void testEquals() {
        Person person1 = new Person("Alina", "Omsk", 33);
        Person person2 = new Person("Alina", "Omsk", 33);
        Person person3 = new Person("Alina", "Omsk", 33);

       //Person person2 = new Person("Ivan", "Omsk", 33);
        //Person person3 = new Person("Kirill", "Omsk", 33);

        assertTrue(person1.equals(person2));
        assertFalse(person1.equals(person3));
    }

    @Test
    public void testHashCode() {
       /*
        Person person1 = new Person("Alina", "Omsk", 33);
        Person person2 = new Person("Ivan", "Omsk", 33);
        Person person3 = new Person("Kirill", "Omsk", 33);

        */
        Person person1 = new Person("Alina", "Omsk", 33);
        Person person2 = new Person("Alina", "Omsk", 33);
        Person person3 = new Person("Alina", "Omsk", 33);

        assertEquals(person1.hashCode(), person2.hashCode());
        assertNotEquals(person1.hashCode(), person3.hashCode());
    }

    @Test
    public void compareTo() {
        Person person1 = new Person("Alina", "Omsk", 33);
        Person person2 = new Person("Ivan", "Omsk", 33);
        Person person3 = new Person("Kirill", "Tomsk", 33);

        assertTrue(person1.compareTo(person2) > 0);
        assertTrue(person1.compareTo(person3) < 0);
    }
}