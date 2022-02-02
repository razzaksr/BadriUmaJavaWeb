package learn.console.BadriJava.lang;

/*
 * String: literal & nonliteral, Immutability
 * concat
 * equals
 * equalsIgnoreCase
 * compareTo
 * compareToIgnoreCase
 * trim
 * substring
 * charAt
 * contains
 * replace
 * toUpperCase
 * toLowerCase
 * getBytes
 * length
 */

public class DemoString 
{
	public static void main(String[] args) 
	{
		String marvel="Ryan reynolds";// literal
		String dc=new String("Ryan Reynolds");// non literal
		System.out.println(marvel+" "+dc);
		System.out.println(marvel.concat(" DeadPool"));;// immutable
		System.out.println(marvel+" "+dc);
		dc=dc.concat(" Green lantern");
		System.out.println(marvel+" "+dc);
		System.out.println(marvel.equals("ryan reynolds"));
		System.out.println(marvel.equalsIgnoreCase("RYAN REYNOLDS"));
		
		System.out.println(dc.compareTo("Ryan Reynolds lantern"));
		System.out.println(dc.compareToIgnoreCase("ryan REYNOLDS green LANTERN"));
		
		System.out.println(dc+" "+dc.getBytes());
		
		marvel+=" X-Men Origins  ";
		
		System.out.println(marvel);
		System.out.println(marvel.length());
		marvel=marvel.trim();
		System.out.println(marvel.length());
		
		System.out.println(dc.charAt(11));
		
		System.out.println(marvel.substring(5,10));
		
		System.out.println(dc.startsWith("Yan"));
		System.out.println(marvel.startsWith("Ry"));
		
		System.out.println(dc.endsWith("tern"));
		
		System.out.println(marvel.contains("a"));
		System.out.println(dc.contains("Bryan"));
		
		marvel=marvel.replace("Ryan", "Tom");
		
		System.out.println(marvel);
		
		dc=dc.replace("e", "HUGE JACKMAN");
		
		System.out.println(dc);
		
		System.out.println(dc.toLowerCase());
		System.out.println(dc.toUpperCase());
	}
}
