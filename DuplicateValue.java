package Com.Sonata;

public class DuplicateValue {
	public static void main(String args[]) {
		int array[]= {57,80,10,80,60,27,60,57,10}; 
		int i,j; 
		System.out.println("Duplicate Array Elements are:");
		for(i=0;i<array.length;i++) 
		{
			for(j=i+1;j<array.length;j++)    
			{
				if(array[i]==array[j]) 
				{
					System.out.print(array[i]+" ");
				}
			}
		}
	}

}


