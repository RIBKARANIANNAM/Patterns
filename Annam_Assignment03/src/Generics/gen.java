package Generics;

public class gen<T> {

            private T[] items;
		    private int size;

		    public gen(int capacity) {
		        items = (T[]) new Object[capacity];
		        size = 0;
		    }

		    public void add(T item) {
		        items[size] = item;
		        size++;
		    }

		    public T get(int index) {
		        return items[index];
		    }

		    public int size() {
		        return size;
		    }
		


	}


