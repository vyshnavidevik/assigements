package Com.Sonata;

public class DuplicteForm {
		public static void main(String args[])
		{
			int array[]= {57,80,10,80,60,27,60,57,10}; 
			int i,j,count=0; 
			
			for(i=0;i<array.length;i++)
			{
				for(j=i+1;j<array.length;j++)       
				{
					if(array[i]==array[j])
					{
						count++;
					}
				}
			}
			System.out.print(count);
		}

}
