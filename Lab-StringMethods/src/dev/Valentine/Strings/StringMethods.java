package dev.Valentine.Strings;

public class StringMethods {

public static void main (String[] args) {
	String w = "Waffles";
	String b = new String ("Waffles");
	String I = "supercalifragilisticexpialidocious";
	System.out.println(w.equals(b));
	System.out.println(w == b);
	System.out.println(w.length());
	System.out.println(w.indexOf('a'));
	System.out.println(I.indexOf('c'));
	System.out.println(I.indexOf('k'));
}
}