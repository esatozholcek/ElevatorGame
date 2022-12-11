package com.example.elevatorgame;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek(int index) {
        return list.get(index);
    }

    public Object pop(int index) {
        Object o = list.get(index);
        list.remove(index);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override /** Override the toString in the Object class */
    public String toString() {
        return "stack: " + list.toString();
    }
}