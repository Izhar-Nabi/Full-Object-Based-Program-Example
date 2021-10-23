class Laptop
{
	String Company;
	int Generation;
	String Colour;
	int price;
	public void Programming ()
	{
	 System.out.println("This Will Use For Coding / Programming ");
		}
	public static void main(String args[]){
	Laptop Machine = new Laptop ();
	Machine.Company="HP";
	Machine.Generation= 6 ;
	Machine.Colour= "White";
	Machine.price= 40000;
	System.out.println("Company is " +Machine.Company);
	System.out.println("Gerneration is " +Machine.Generation);
	System.out.println("Colour is " +Machine.Colour);
	System.out.println("Price is " +Machine.price);
	Machine.Programming();	
	}
	
}