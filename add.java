import java.util.Scanner;
public class add 
{
	int arr[]=new int[5];
	int total = 0;
	public void sum() 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 5 numbers : ");
		for (int i = 0; i<5; i++)
			{
				arr[i] = obj.nextInt();
			}
			
		for (int j = 0; j<5; j++)
			{
				total+=arr[j];
			}
		
		System.out.println("Sum = " + total);
		
		obj.close();
		
	}
	

	public static void main(String[] args) 
	{
		add s1 = new add();
		s1.sum();

	}

}
