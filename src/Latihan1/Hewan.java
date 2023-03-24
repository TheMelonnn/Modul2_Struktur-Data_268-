package Latihan1;

import java.util.ArrayList;

public class Hewan {
	public static void main(String[] args) {
		ArrayList<String> ListHewan = new ArrayList<String>();
		ArrayList<String> DelHewan = new ArrayList<String>();

		// Add list hewan
		ListHewan.add("Sapi");
		ListHewan.add("Kelinci");
		ListHewan.add("Kambing");
		ListHewan.add("Unta");
		ListHewan.add("Domba");

		System.out.print("List Awal Hewan: [ ");
		for (String str : ListHewan) {
			System.out.print(str + " ");
		}
		System.out.print("]");

		// Add list yang di delete
		DelHewan.add("Kelinci");
		DelHewan.add("Kambing");
		DelHewan.add("Unta");

		System.out.print("\n\nList Delete Hewan: [ ");
		for (String str : DelHewan) {
			System.out.print(str + " ");
		}
		System.out.print("]");

		// Remove hewan yang sama dengan delhewan
		ListHewan.remove("Kelinci");
		ListHewan.remove("Kambing");
		ListHewan.remove("Unta");

		System.out.print("\n\nList Akhir Hewan: [ ");
		for (String str : ListHewan) {
			System.out.print(str + " ");
		}
		System.out.print("]");
	}

}
