package com.javademo.basic.inheritence;

public class MainClass {
	public static void main(String[] args) {
		Parent parentParent = new Parent();
		parentParent.method();
		parentParent.parentDistinct();
		
		
		Parent parentChild = new Child();
		parentChild.method();
		parentChild.parentDistinct();
		
		
		Child childChild = new Child();
		childChild.method();
		childChild.childDistinct();
		childChild.parentDistinct();
		
		
		//Child childParent = new Parent();
	}

}
