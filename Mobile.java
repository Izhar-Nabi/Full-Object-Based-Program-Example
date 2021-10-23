class Mobile
{
	String Company;
	String Model;
	String Colour;
	int price;
	public void Communication ()
	{
	 System.out.println("This Will Use For Communicate With Each Other");
		}
	public static void main(String args[]){
	Mobile Android = new Mobile ();
	Android.Company="Q-Mobile";
	Android.Model= " Q Mobile I-Series 20";
	Android.Colour= "Brown";
	Android.price= 15000;
	System.out.println("Company is " +Android.Company);
	System.out.println("Model is " +Android.Model);
	System.out.println("Colour is " +Android.Colour);
	System.out.println("Price is " +Android.price);
	Android.Communication();	
	}
	
}