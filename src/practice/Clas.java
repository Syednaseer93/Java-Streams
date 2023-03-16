package practice;

public class Clas {

	public static void main(String[] args) {
		String str="page 19 of 203";
		String[] arr=str.split(" ");
		String s=arr[3];
		int sum=0;

		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			int z=Character.getNumericValue(ch);
			sum=sum+z;
		}
		System.out.println(sum);
	}
}
	