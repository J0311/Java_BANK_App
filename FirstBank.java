//@author Joseph Walker

public class FirstBank {

	//FirstBank is the class in which the main method
	//will be declared.
	
	
	public static void main(String[] args) {
	//"showMenu function gives us access to the other functions in the Account class
		
		Account mark = new Account ("Mark Stevens", "A00001");
			mark.showMenu();
	//now that we've created a new instance	of this object named "John", we can call on it.
		Account john = new Account ("John Marshall", "B00002");
			john.showMenu();
		
		Account sally = new Account ("Sally Cooper", "C00003");
			sally.showMenu();
	}

}
