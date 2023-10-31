
package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;
import java.util.Collection;
import java.util.LinkedList;

    public class GreetingImplTest {

        @Test
        public void getFirstNameTest() {
            GreetingImpl firstName = new GreetingImpl();
            String _firstName = firstName.getFirstName();
            Assert.assertEquals("Алина", _firstName);
        }

        @Test

        public void getLastNameTest() {
            GreetingImpl lastName = new GreetingImpl();
            String _lastName = lastName.getLastName();
            Assert.assertEquals("Сергина", _lastName);
        }

        @Test
        public void getBirthYearTest() {
            GreetingImpl birthYear = new GreetingImpl();
            int _birthYear = birthYear.getBirthYear();
            Assert.assertEquals(1990, _birthYear);
        }

        @Test
        public void getHobbiesTest() {
            GreetingImpl hobbies = new GreetingImpl();
            Collection<String> _hobbies = new LinkedList<>();
            _hobbies.add("Учиться, кулинария");
            Assert.assertEquals(_hobbies, hobbies.getHobbies());
        }

        @Test
        public void getBitbucketUrlTest() {
            GreetingImpl bitbucketUrl = new GreetingImpl();
            String _bitbucketUrl = bitbucketUrl.getBitbucketUrl();
            Assert.assertEquals("отсутствует", _bitbucketUrl);
        }

        @Test
        public void getPhoneTest() {
            GreetingImpl phone = new GreetingImpl();
            String _phone = phone.getPhone();
            Assert.assertEquals("9514090021", _phone);
        }

        @Test
        public void getCourseExpectationsTest() {
            GreetingImpl cuorseExpectations = new GreetingImpl();
            Collection<String> courseExpectations2 = new LinkedList<>();
            courseExpectations2.add("Получить навыки, сменить роль");
            Assert.assertEquals(courseExpectations2, cuorseExpectations.getCourseExpectations());
        }

    }
