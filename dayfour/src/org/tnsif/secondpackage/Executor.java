package org.tnsif.secondpackage;

import org.tnsif.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		Base b =new Base();
		//if any method is default we cannot acess into another package
		b.methodpublic();

	}

}
