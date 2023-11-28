
package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Collection;
import java.util.LinkedList;

public class GreetingImplTest {

    GreetingImpl greeting;

    @Before
    public void init() {
        greeting = new GreetingImpl();
    }

    @Test
    public void getFirstNameTest() {
        Assert.assertEquals("Алина", greeting.getFirstName());
    }

    @Test

    public void getLastNameTest() {
        Assert.assertEquals("Сергина", greeting.getLastName());
    }

    @Test
    public void getBirthYearTest() {
        Assert.assertEquals(1990, greeting.getBirthYear());
    }

    @Test
    public void getHobbiesTest() {
        Collection<String> hobbies = new LinkedList<>();
        hobbies.add("Учиться");
        hobbies.add("Кулинария");
        Assert.assertEquals(hobbies, greeting.getHobbies());
    }

    @Test
    public void getBitbucketUrlTest() {
        Assert.assertEquals("отсутствует", greeting.getBitbucketUrl());
    }

    @Test
    public void getPhoneTest() {
        Assert.assertEquals("9514090021", greeting.getPhone());
    }

    @Test
    public void getCourseExpectationsTest() {
        Collection<String> courseExpectations = new LinkedList<>();
        courseExpectations.add("Получить навыки");
        courseExpectations.add("Сменить роль");
        Assert.assertEquals(courseExpectations, greeting.getCourseExpectations());
    }

}
