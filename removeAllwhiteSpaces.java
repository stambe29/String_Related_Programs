/** WAP to remove all white spaces(Multiple) in a String
 * 
 *@author Indrajit Bhattacharjee
 * @date Jan 05,2019 
 */
package com.program.String_Related_Programs;

public class removeAllwhiteSpaces {

	public static void main(String[] args) {

		String str = "India     Is My    Country";
		System.out.println("String after removal of white space/s");
		String withoutSpace = str.replaceAll("\\s+", "");
		System.out.println(withoutSpace);

	}

}
