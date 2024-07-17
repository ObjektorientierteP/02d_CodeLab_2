package com.cc.java;

public class App {

	public static void main(String[] args) {
	
		// Konstruktor Mit 4 Objekte
		Mitarbeiter mitarbeiterInfo = new Mitarbeiter(null, null, null, 0);

		// Mitarbeiter 1
		mitarbeiterInfo.setInfo("Jobs","Steve", "Apple CEO", 1955);
		output(mitarbeiterInfo.getInfo());
		
		// Mitarbeiter 2
		mitarbeiterInfo.setInfo("Gates","Bill", "Microsoft CEO", 1975);
		output(mitarbeiterInfo.getInfo());
	}

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
