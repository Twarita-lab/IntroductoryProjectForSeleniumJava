package coreJavaBrushUp;

public class AllAboutStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Literal
		String LiteralA="Welcome";
		String LiteralB="Welcome";
		
		System.out.println("For Literals == operation with same contents returns "+(LiteralA==LiteralB)+" as == refers memory location");
		System.out.println("For Literals .equals operation with same contents returns "+(LiteralA.equals(LiteralB)));
		
		
		//String object
				String ObjA=new String("Welcome");
				String ObjB=new String("Welcome");
				
				System.out.println("For String Objects == operation with same contents returns "+(ObjA==ObjB)+" as == refers memory location");
				System.out.println("For String Objects .equals operation with same contents returns "+(ObjA.equals(ObjB)));
				
				
		System.out.println("Character at 0th index is "+LiteralA.charAt(0));
		
		String[] splittedArray = LiteralA.split("l");
		System.out.println(splittedArray[0]);
		
		System.out.println(".trim trims right and left spaces");
				
	}

}
