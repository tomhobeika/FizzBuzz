class FizzBuzz {
	public static int i = 1;
	public static void main(String [] args) {
		// Multiple of 3 = Fizz
		// Multiple of 5 = Buzz
		// Multiple of 15 = FizzBuzz
	
		for (i = i; i <= 10000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else System.out.println(i);
		}		
	}
}
