

public class ProvaStruttureCondizionali {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		if(x > y) {
			System.out.println("x è maggiore di y");
			
		}else {
			System.out.println("y è maggiore di x");
		}
		
		System.out.println("######################");
		
		int ora = 10;
		
		if(ora > 5) {
			
			System.out.println("Sono passate le 5");
			
		}else if(ora > 8) {
			
			System.out.println("Sono passate le 8");
			
		}else {
			
			System.out.println("Devono ancora arrivare le 5");
			
		}

	}

}

