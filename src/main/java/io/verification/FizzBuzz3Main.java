package io.verification;

public class FizzBuzz3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 100; i++){
			String test = "";
			
			if(i%3 == 0)
				test += "fizz";
			if(i%5 == 0)
				test += "buzz";

			//test += (i % 3) == 0 ? "fizz" : "";
			//test += (i % 5) == 0 ? "buzz" : "";
			// System.out.println(!test.isEmpty() ? test : i);
			System.out.println(test.length() > 0 ? test : i);
		}

	}

}