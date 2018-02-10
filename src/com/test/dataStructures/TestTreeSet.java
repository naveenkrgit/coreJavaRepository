package com.test.dataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestTreeSet {
public static void main(String[] args) {
TreeSet dset = new TreeSet();
dset.add(new Dog(2));
dset.add(new Dog(1));
dset.add(new Dog(3));

Iterator iterator = dset.iterator();
while (iterator.hasNext()) {
System.out.print(iterator.next() + " ");
}
}
}

//looks like only TreeSet needs a Compataor if an Object is passed into it.
//not sure as to why the other two don't need it//'