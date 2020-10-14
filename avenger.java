import java.util.Scanner;
class avenger
{
	public int i;
	public int age[]=new int[5];
	public int power[]=new int[5];
	public String name[]=new String[5];
	public String weapon[]=new String[5];
	public String planet[]=new String[5];
	public void getDetails()
	{
		
		for(i=0;i<5;i++)
		{
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter Name : ");
			name[i] = obj.nextLine();
			System.out.println("Enter Age : ");
			age[i] = obj.nextInt();
			System.out.println("Enter  Power : ");
			power[i] = obj.nextInt();
			System.out.println("Enter Weapon name : ");
			weapon[i]= obj.next();
			System.out.println("Enter Planet name : ");
			planet[i] = obj.next();
			System.out.println("\n-----------------------------");
		}
	}
	public void displayDetails() 
	{
		for(i=0;i<5;i++)
		{
			System.out.println("\n------------------------------");
			System.out.println("\n\nAvanger's Name is : " +name[i]);
			System.out.println("Avanger's Age is : "+age[i]);
			System.out.println("Avanger's power is : "+power[i]);
			System.out.println("Avanger's Weapon is : "+weapon[i]);
			System.out.println("Avanger's Planet : "+planet[i]);
		}
	}
	public static void main(String[] ar)
	{
		avenger a=new avenger();
		a.getDetails();
		a.displayDetails();	
	}
}