package com.cc.java;

public class App {

	public static void main(String[] args) {
	
		// Konstruktor Mit 3 Objekte
		Mitarbeiter mitarbeiterInfo1 = new Mitarbeiter("Jobs","Steve", "Apple CEO", 1955);
		output(mitarbeiterInfo1.getInfo());

		Mitarbeiter mitarbeiterInfo2 = new Mitarbeiter("Gates","Bill", "Microsoft CEO", 1975);
		output(mitarbeiterInfo2.getInfo());

		Mitarbeiter mitarbeiterInfo3 = new Mitarbeiter("Arian","Hormozfar", "", 0);
		output(mitarbeiterInfo3.getInfo());

	}

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
