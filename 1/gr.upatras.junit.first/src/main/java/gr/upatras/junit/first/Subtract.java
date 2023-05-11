package gr.upatras.junit.first;

public class Subtract {
	
	//method
	public String sub(int a,int b) {
		int c;
		c=a-b;
		if (c == 0) {
			throw new IllegalArgumentException("a must be different than b"); 
			}
		if(c>0) {
			return "POSITIVE";
		}
		else {
			return "NEGATIVE";
		}
	}
	
}
