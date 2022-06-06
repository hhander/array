package com.array;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<Integer>();
        vc.addElement(1);
        vc.addElement(2);
        vc.addElement(3);
        vc.addElement(4);
        vc.addElement(5);
        for (int i = 0; i < vc.size(); i++) {
            vc.elementAt(i);
        }
    }
}
