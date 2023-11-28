package ru.sberbank.jd.lesson06;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomArrayImplTest {
    CustomArrayImpl customArray;
    CustomArrayImpl customArray2;
    @Before
    public void init(){
        customArray = new CustomArrayImpl<>();
        customArray.add(10);
        customArray.add(20);

        customArray2 = new CustomArrayImpl<>();
        customArray2.add("10");
        customArray2.add("20");

    }
    @Test
    public void sizeTest() {
        Assert.assertEquals(2,customArray.size());
    }

    @Test
    public void isEmptyTest() {
        Assert.assertEquals(false,customArray.isEmpty());
    }

    @Test
    public void addTest() {
        customArray.add(30);
        Assert.assertEquals(new Integer[]{10,20,30},customArray.toArray());
    }

    @Test
    public void addAllTest() {
        Integer [] a = new Integer[] {2,3};
        customArray.addAll(a);
        Assert.assertEquals(new Integer[]{10,20,2,3},customArray.toArray());
    }

    @Test
    public void addAllTest2() {
        Integer [] newArray = new Integer[] {30,40};
        Assert.assertEquals(true,customArray.add(newArray));
    }

    @Test
    public void addAllTest3() {
        Integer [] newArray = new Integer[] {30,40};
        Assert.assertEquals(true,customArray.addAll(1,newArray));
    }

    @Test
    public void getTest() {
        Assert.assertEquals(20,customArray.get(1));
    }

    @Test
    public void setTest() {
        customArray.set(0,60);
        Assert.assertEquals(60,customArray.get(0));
    }

    @Test
    public void removeTest() {
        customArray.remove(1);
        Assert.assertEquals(new Integer[]{10},customArray.toArray());
    }

    @Test
    public void testRemoveTest() {
        Assert.assertEquals(true,customArray2.remove("20"));
    }

    @Test
    public void containsTest() {
        Assert.assertEquals(true,customArray.contains(10));
    }

    @Test
    public void indexOfTest() {
        Assert.assertEquals(1,customArray.indexOf(20));
    }

    @Test
    public void ensureCapacityTest() {
        customArray.ensureCapacity(1);
        Assert.assertEquals(11,customArray.getCapacity());
    }

    @Test
    public void getCapacityTest() {
        Assert.assertEquals(10,customArray.getCapacity());
    }

    @Test
    public void reverseTest() {
        customArray.reverse();
        Assert.assertEquals(new Integer[]{20,10},customArray.toArray());
    }

    @Test
    public void testToStringTest() {
        Assert.assertEquals("[10 20 40 20]",customArray.toString());
    }

    @Test
    public void toArrayTest() {
        Assert.assertEquals(new Integer[]{10,20},customArray.toArray());
    }
}