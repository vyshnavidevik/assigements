package Com.Sonata;

public class ArraySpecificValue {
	public static void main(String args[]) {
		String str[]=new String[5];
		str[0]="instagram";
		str[1]="facebook";
		str[2]="snapchat";
		str[3]="twitter";
		str[4]="telegram";
		for(int i=0;i<=str.length-1;i++){
			if(str[i]=="snapchat") {
				System.out.println(str[i]+" is at index "+i);
			}
		}
		
	}

}
