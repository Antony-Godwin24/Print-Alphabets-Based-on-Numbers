import java.util.*;
public class PrintAlphabetWithNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer s=new StringBuffer();
		int dig=0;
		for(int i=0;i<str.length();i++){
			if(str.length()==1 || str.charAt(0)>='0' && str.charAt(0)<='9'){
				System.out.println("Enter a valid value!");
				break;
			}
			else{
				while(i<str.length() && str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z'){
					s.append(str.charAt(i));
					i++;
				}
				while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
					dig=dig*10+str.charAt(i)-'0';
					i++;
				}
				i--;
				for(int j=1;j<=dig;j++){
					System.out.println(s);
				}	
				s.setLength(0);
				dig=0;
			}
		}
	}
}
			
				
				
			