package io.verification;

public class FizzBuzz4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 boolean flag = true;

		for(int i=0;i<100;i++){
			if(i%3==0){
				System.out.print("Fizz");
				flag=false;
			}

			if(i%5==0){
				System.out.print("Buzz");
				flag=false;
			}

			if (flag)
				System.out.print(i);

			System.out.print(",");

			flag = true;

		}

	}

}