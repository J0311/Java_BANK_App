//@author Joseph Walker

public class FirstBank {

	//FirstBank is the class in which the main method
	//will be declared.
	
	
	public static void main(String[] args) {
	//"showMenu funtion gives us access to the other funtions in the Account class
		
		Account mark = new Account ("Mark Stevens", "A00001");
			mark.showMenu();
	//now that we've created a new instance	of this object named "John", we can call on it.
		Account john = new Account ("John Marshall", "B00002");
			john.showMenu();
	}

}
