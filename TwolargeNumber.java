package Com.Sonata;

public class TwolargeNumber {
	public static void main(String args[])
	{
		int arr[]= {100,70,250,900,30,600,950,24};
		int firstlargenum=arr[0];
		int secondlargenum=arr[1];
		int firstlargenumpos=0;
		int secondlargenumpos=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>firstlargenum)
			{   
				
				secondlargenum=firstlargenum;
				secondlargenumpos=firstlargenumpos;
				firstlargenum=arr[i];
				firstlargenumpos=i;
				
				}
			else if(arr[i]>secondlargenum && arr[i]<firstlargenum)
			
          { 
				secondlargenum=arr[i];
				secondlargenumpos=i;
}
		}
		
	
	System.out.println("First Largest number "+firstlargenum+" is at position "+firstlargenumpos);
	System.out.println("second Largest number "+secondlargenum+" is at position "+secondlargenumpos);
		
}

}
