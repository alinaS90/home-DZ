package ru.sberbank.jd.lesson07;

import java.util.Objects;
/**
 * Класс для хранения данных о человеке.
 */
public class Person implements Comparable<Person> {
    private String name;
    private String city;
    private int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    /**
     * Класс для хранения данных о человеке.
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * Класс для хранения данных о человеке.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equalsIgnoreCase(person.name) &&
                city.equalsIgnoreCase(person.city);
    }

    /**
     * Класс для хранения данных о человеке.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(), city.toLowerCase(), age);
    }

    /**
     * Класс для хранения данных о человеке.
     */
    @Override
    public int compareTo(Person other) {
        int cityComparison = this.city.compareToIgnoreCase(other.city);
        if (cityComparison != 0) {
            return cityComparison;
        }
        return this.name.compareToIgnoreCase(other.name);
    }
}
