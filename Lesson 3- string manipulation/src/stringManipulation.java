
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
	String fname1 = s1.substring(2,5);
	String lname1 = s1.substring(6,7);
	String fname2 = s2.substring(2,4);
	String lname2 = s2.substring(5,7);
	String fname3 = s3.substring(2,7);
	String lname3 = s3.substring(8,9);
	System.out.println("Allan Alda>>>"+ fname1 + " " + lname1);
	System.out.println("John Wayne>>>"+ fname2 + " " + lname2);
	System.out.println("Gregory Peck>>>"+ fname3 + " " + lname3);
	
	}

}
