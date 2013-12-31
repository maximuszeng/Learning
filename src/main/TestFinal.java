
public class TestFinal {
	
	public final String finalStr;
	
	public TestFinal(String str) {
		finalStr = str;
	}

	public static void main(String[] args) {
	
		TestFinal tf = new TestFinal("finalStr");
		
		System.out.print("This is finalStr: " + tf.finalStr);
		
	}
}
