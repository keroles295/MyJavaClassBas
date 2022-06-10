package com.syntax.class12;

public class MyStudy {

	public static void main(String[] args) {
		
		String namee=new String("Pietro Habiby");
		String lastNamee=new String("Botros");
		String name=" Pietro Botros";
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String firstName="Meila";
		String lastName=" Botros";
		System.out.println(firstName+lastName);
		String maz="";
		System.out.println(maz.isEmpty());
		String naz=" i need to study hard these weeks ";
		System.out.println(naz.trim());
		System.out.println(naz.startsWith(" i"));
		System.out.println(naz.endsWith("s "));
		System.out.println(naz.trim().endsWith("weeks"));
		System.out.println(naz.trim().toUpperCase().endsWith("WEEKS"));
		System.out.println(naz.contains("to"));
		System.out.println(naz.toUpperCase().contains("HARD"));
		String n1="Koko";
		String n2="koko";
		System.out.println(n1.equalsIgnoreCase(n2));
		int coun=0;
		for(int i=0; i<naz.length(); i++) {
			if ('s'==naz.charAt(i)) {
			coun++;
		}
		}
		System.out.println("e, d and s are appered for "+coun+" in this String");
		String er="1, 2, 1, 4, 6, 1, 9, 7, 1";
		int counter=0;
		for (int y=0; y<er.length(); y++) {
			if(er.charAt(y)=='1') {
				counter++;
			}
				
		}
		System.out.println(counter);
		System.out.println(er.indexOf('9'));
		System.out.println(naz.indexOf('s'));
		System.out.println(naz.lastIndexOf('w'));
		System.out.println(naz.indexOf(' '));
		System.out.println(naz.substring(0, 2));
		String naz2=naz.substring(3, 7);
		System.out.println(naz2);
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
