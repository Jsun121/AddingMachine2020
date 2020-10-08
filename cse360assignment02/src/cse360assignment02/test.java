package cse360assignment02;

public class test {
	public static void main(String[] args) 
	{
		AddingMachine newMach = new AddingMachine();
		newMach.add(1);
		newMach.subtract(2);
		newMach.add(5);
		System.out.println(newMach.toString());
		newMach .clear();
		System.out.println(newMach.toString());
		
	}
}
