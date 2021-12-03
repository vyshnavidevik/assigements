package Com.Sonata;
public class StringReplace {
	public static void main(String args[])
	{
		String str = "Sonata Software TRAINING"; 
		char arr[] = str.toCharArray(); 
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') //checks if any characters are vowels or not 
			{
				arr[i]='$'; 
				
			}
			System.out.print(arr[i]); 
		}
	}

}


