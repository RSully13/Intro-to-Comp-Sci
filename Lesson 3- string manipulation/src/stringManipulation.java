
public class stringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String name = "Ryan Sullivan"; System.out.println(name.length()-1);
		 * System.out.println(name.substring(5)); String lname =
		 * name.substring(4); String fname = name.substring(0,5);
		 * System.out.println(fname + lname);
		 */
	String s1="Allan Alda";
	String s2 ="John Wayne";
	String s3 = "Gregory Peck";
	String fname1 = s1.substring(2,s1.length()-3);
	String fname2 = s2.substring(2,s2.length()-3);
	String fname3 = s3.substring(2,s3.length()-3);
	System.out.println(s1 +">>>"+ fname1);
	System.out.println(s2 +">>>"+ fname2);
	System.out.println(s3 +">>>"+ fname3);
	}

}
