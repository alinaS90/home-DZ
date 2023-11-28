package ru.sberbank.jd.lesson06;

import java.util.Collection;
/**
 * Simple array. Can store any objects.
 */

public class CustomArrayImpl<T> implements CustomArray<T> {
    private T[] data;
    private int size;

    public CustomArrayImpl() {
        this(10);
    }

    public CustomArrayImpl(int capacity) {
        data = (T[]) new Object[capacity];
    }

    public CustomArrayImpl(Collection<T> c) {
        this(c.size());
        addAll(c);
    }

    /**
     * Returns the number of items in the collection.
     *
     * @return size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks whether the current collection is empty.
     *
     * @return true - if empty, false - if not empty
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     *Add single item.
     *
     * @param item - item
     * @return true - element added
     */
    @Override
    public boolean add(T item) {
        if (size == data.length) {
            ensureCapacity(1);
        }
        data[size++] = item;
        return true;
    }

    /**
     * Add all items.
     *
     * @param items - items
     * @return true - elements added
     * @throws IllegalArgumentException if parameter items is null
     */
    @Override
    public boolean addAll(T[] items) {
        if (items == null) {
            throw new IllegalArgumentException("Parameter items is null");
        }
        ensureCapacity(items.length);
        for (T item : items) {
            add(item);
        }
        return true;
    }

    /**
     * Add all items.
     *
     * @param items - items
     * @return true - elements added
     * @throws IllegalArgumentException if parameter items is null
     */
    @Override
    public boolean addAll(Collection<T> items) {
        if (items == null) {
            throw new IllegalArgumentException("Parameter items is null");
        }
        ensureCapacity(items.size());
        for (T item : items) {
            add(item);
        }
        return true;
    }

    /**
     * Add items to current place in array.
     *
     * @param index - index
     * @param items - items for insert
     * @return true - elements added
     * @throws ArrayIndexOutOfBoundsException if index is out of bounds
     * @throws IllegalArgumentException       if parameter items is null
     */
    @Override
    public boolean addAll(int index, T[] items) {

        if (items == null) {
            throw new IllegalArgumentException("Parameter items is null");
        }
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        ensureCapacity(items.length);
        System.arraycopy(data, index, data, index + items.length, size - index);
        System.arraycopy(items, 0, data, index, items.length);
        size += items.length;
        return true;
    }

    /**
     * Get item by index.
     *
     * @param index - index
     * @return element corresponding to the index
     * @throws ArrayIndexOutOfBoundsException if index is out of bounds
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        return data[index];
    }

    /**
     * Set item by index.
     *
     * @param index - index
     * @return old value
     * @throws ArrayIndexOutOfBoundsException if index is out of bounds
     */
    @Override
    public T set(int index, T item) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        T oldValue = data[index];
        data[index] = item;
        return oldValue;
    }

    /**
     * Remove item by index.
     *
     * @param index - index
     * @throws ArrayIndexOutOfBoundsException if index is out of bounds
     */
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;
    }

    /**
     * Remove item by value. Remove first item occurrence.
     *
     * @param item - item
     * @return true if item was removed
     */
    @Override
    public boolean remove(T item) {
        int index = indexOf(item);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    /**
     * Checks if item exists.
     *
     * @param item - item
     * @return true if item exists else false
     */
    @Override
    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    /**
     * Index of item.
     *
     * @param item - item
     * @return index of element or -1 of list doesn't contain element
     */
    @Override
    public int indexOf(T item) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Grow current capacity to store new elements if needed.
     *
     * @param newElementsCount - new elements count
     */
    @Override
    public void ensureCapacity(int newElementsCount) {
        int newCapacity = data.length + newElementsCount;
        if (newCapacity < 0) {
            newCapacity = Integer.MAX_VALUE;
        }
        T[] newData = (T[]) new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    /**
     * Get current capacity.
     *
     * @return current capacity
     */
    @Override
    public int getCapacity() {
        return data.length;
    }

    /**
     * Reverse list.
     */
    @Override
    public void reverse() {
        for (int i = 0; i < size / 2; i++) {
            T temp = data[i];
            data[i] = data[size - i - 1];
            data[size - i - 1] = temp;
        }
    }

    /**
     * Get content in format '[ element1 element2 ... elenentN ] or [ ] if empty.
     *
     * @return content in format String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Get copy of current array.
     *
     * @return copy of current array
     */
    @Override
    public Object[] toArray() {
        Object[] newData = new Object[size];
        System.arraycopy(data, 0, newData, 0, size);
        return newData;
    }
}
