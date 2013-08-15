import javax.swing.JOptionPane;


public class TestSandwich {

	public static void main(String[] args) {
		//Instantiate a sandwich object
		Sandwich mySandwich = new Sandwich();
		Sandwich juniorSandwich = new Sandwich();
		
		//Set the values of fields in mySandwich
		mySandwich.setMainIngredient("turkey");
		mySandwich.setBreadType("white");
		mySandwich.setPrice (4.55);
		
		//Output the details of mySandwich and juniorSandwich
		String yourSandwich;
		yourSandwich = JOptionPane.showInputDialog("Who wants a sandwich? ");
			
		JOptionPane.showMessageDialog(null, yourSandwich + " wants a " + mySandwich.getMainIngredient() +
					" on " + mySandwich.getBreadType() + " costing $ " + mySandwich.getPrice() );
		
		juniorSandwich.setMainIngredient("roast beef");
		juniorSandwich.setBreadType("whole wheat");
		juniorSandwich.setPrice(4.65);
		
		String yourSandwich1;
		yourSandwich1 = JOptionPane.showInputDialog("Who wants a sandwich? ");

		JOptionPane.showMessageDialog(null, yourSandwich1 + " wants a " + juniorSandwich.getMainIngredient() +
				" on " + juniorSandwich.getBreadType() + " costing $ " + juniorSandwich.getPrice() );
	
			
	}

}
