package org.tnsif.abstractkeyworddemo;

public abstract class AbstractExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if any class contains abstract method,
		 * we can't create that class
		 */
		//Remote r = new Remote();
		RemoteChild r = new RemoteChild();
		r.cellName ="Durocell";
		r.display();
		r.functionRemote();
		

	}

}
