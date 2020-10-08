package cse360assignment02;
/**
 * The class of Adding Machine which allows adding , subtracting and also allows the get the total 
 * @author james sun 
 * 
 *
 */
public class AddingMachine {
	private int total;// a variable that is access by all the classes
	private String list; 
	/**
	 * It sets the vales of total to zero and the list to a string containing zero in it
	 */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity and also it set the total value to zero
	    list = "0 ";// set list starting as zero
	  }
	  /**
	   * It printout the total
	   * @return total
	   */
	  public int getTotal () {
	    return total; // It will return the total
	  }
	  /**
	   * It adds value to the total, but it also give you a list, so we can print it out later 
	   * @param int value
	   */
	  public void add (int value) 
	  { 
		total += value; 
		list += "+ " + value + " ";
	  }
	  /**
	   * It subtracts the value to the total, but it also give you a list, so we can print it out later 
	   * @param int value
	   */
	  public void subtract (int value) 
	  {
		 total -= value;
		 list += "- " + value + " ";
	  }
	  /**
	   * the method prints out the list that was created early.
	   * @return list
	   */
	  public String toString () 
	  {
		return list;
	  }
	  
	  /**
	   * it is called clear. It resets the total and the list to zero
	   * 
	   */ 
	  public void clear() 
	  {
		  total = 0;
		  list ="0 ";
	  }
	  
	 

}
