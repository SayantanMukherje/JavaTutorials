package com.javademo.basic.clonable;

public class Person implements Cloneable {
	String name;
	City city;
	public Person clone() throws CloneNotSupportedException {
        Person clonedObj = (Person) super.clone();
        clonedObj.name = new String(this.name);
        clonedObj.city = this.city.clone();
        return clonedObj;
    }
}
