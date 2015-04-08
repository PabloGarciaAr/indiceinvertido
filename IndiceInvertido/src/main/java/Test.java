import java.util.Arrays;


public class Test {

	public static void main(String[] args) {

		Data invertedIndex = new Data();
		
		String[] results = invertedIndex.get("music");

		System.out.println(results.length);

		System.out.println(Arrays.toString(results));

	}

}
