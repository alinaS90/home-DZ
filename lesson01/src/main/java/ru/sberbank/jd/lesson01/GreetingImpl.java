package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Класс для получения данных студентов для приветствия.
 */

public class GreetingImpl implements Greeting {

    /**
     * Получение имени.
     *
     * @return имя
     */

    @Override
    public String getFirstName() {
        return "Алина";
    }
    /**
     *  Получение фамилии.
     *
     *  @return фамилия
     */

    @Override
    public String getLastName() {
        return "Сергина";
    }

    /**
     * Получение года рождения.
     *
     * @return год рождения
     */

    @Override
    public int getBirthYear() {
        return 1990;
    }
    /**
     * Получение набора хобби.
     *
     * @return набор хобби
     */

    @Override
    public Collection<String> getHobbies() {
        Collection<String> hobbies = new LinkedList<>();
        hobbies.add("Учиться, кулинария");
        return hobbies;
    }
    /**
     * Получение имени репозитория bitbucket.
     *
     * @return репозиторий bitbucket
     */

    @Override
    public String getBitbucketUrl() {
        return "отсутствует";
    }
    /**
     * Получение телефона.
     *
     * @return телефон
     */

    @Override
    public String getPhone() {
        return "9514090021";
    }
    /**
     * Получение набора ожиданий от курса.
     *
     * @return набор ожиданий от курса
     */

    @Override
    public Collection<String> getCourseExpectations() {
        Collection<String> courseExpectations = new LinkedList<>();
        courseExpectations.add("Получить навыки, сменить роль");
        return courseExpectations;
    }
}