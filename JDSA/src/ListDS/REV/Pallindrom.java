package ListDS.REV;

public class Pallindrom {


	public static boolean isPallindrom(String str) {

		int i =0;
		int j=str.length()-1;

		while(i>j) {

			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;

	}

	public static void main(String[] args) {

		String st = "gopal";

		if(isPallindrom(st)) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}

	}

}
