import java.util.Scanner;
public class odd 
{
	public void oddNumber() 
	{
	Scanner obj = new Scanner(System.in);
	int arr[] = new int [5];
	System.out.println("Enter 5 Numbers : ");
	for(int i=0;i<5;i++)
	{
		arr[i]= obj.nextInt(); 
	}
	obj.close();
	
	System.out.println("Odd Numbers are : ");
	
	for(int j=0; j<5; j++)
	{
		if (arr[j]%2 != 0)
		{
			System.out.println(arr[j]);
		}
	}
}
	public static void main(String [] args)
	{
		odd get = new odd();
		get.oddNumber();	
	}
}
