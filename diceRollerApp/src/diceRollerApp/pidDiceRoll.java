package diceRollerApp;

public class pidDiceRoll {

	public static void main(String[] args) {
		
		for (int d = 0; ; d++) {
			int total = 0;
		    int count = 0;
		    int roll = (int)(Math.random() * 6 + 1);
		    for (int j = 0; j < roll; j++) {
		        count++;
		    }
		    if (roll == 1) {
		    	System.out.println("Your dice rolled" +" "+ d +" "+"times!");
		    	System.out.println(++count);
		    	
		    	return;
		    		}
		    System.out.println(count);
		    
		   
		}
		
		


	}

	private static int sum(int d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
