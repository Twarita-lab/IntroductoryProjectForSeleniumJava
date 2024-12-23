package coreJavaBrushUp;

public class ArraysAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,2,3,4,5};
		
		int[] B=new int[5];
		B[0]=6;
		B[1]=7;
		B[2]=8;
		B[3]=9;
		B[4]=10;
		
		System.out.println(A[0]);
		System.out.println(B[0]);
		
		System.out.println("-----------------------------------------");

		//Normal For Loop
	    for(int i=0; i<A.length;i++) {
	    	System.out.println(A[i]);
	    }

	System.out.println("-----------------------------------------");
	
	//Enhanced For loop
	    for(int i:B) {
	    	System.out.println(i);
	    }

	}

}
