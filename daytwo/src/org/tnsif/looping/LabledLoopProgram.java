package org.tnsif.looping;

public class LabledLoopProgram {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//label
				outer:
					for(int i=1; i<=5; i++) {
						System.out.println();
						inner:
							for(int j=1; j<=5; j++) {
								System.out.print(j+" ");
								if(j==4) {
									break;
								}
							}
					}

	}

}
