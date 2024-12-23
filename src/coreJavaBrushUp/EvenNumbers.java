package coreJavaBrushUp;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,2,3,4,6,10,12,45,65,70};
		
		for(int i=0; i<A.length; i++) {
			if(A[i]%2==0) {
				System.out.println(A[i]);
			}
		}
	}

}
