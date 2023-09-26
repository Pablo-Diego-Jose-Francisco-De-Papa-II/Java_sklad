public class September-26th-2023 {
	public static void main(String[] args) throws java.io.IOException {
		char znak, answer = 'X';
		
		System.out.println("Mysli na jedno pismeno A-Z");
		System.out.println("Skus ho uhadnut");

		znak = (char) System.in.read();
				
		if (znak == answer) {
			System.out.print("");
			
			
		} else {
			
			if (znak < answer) {
				System.out.println("You too low");
				
			} else {
				System.out.print("You too high");
			}
		}
	}
}
