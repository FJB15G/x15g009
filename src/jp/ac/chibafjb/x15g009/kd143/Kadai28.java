package jp.ac.chibafjb.x15g009.kd143;

import java.util.Scanner;

public class Kadai28 {

	public static void main(String[] args) {
		Scanner sin1 = new Scanner(System.in);
		Scanner sin2 = new Scanner(System.in);
		Scanner sin3 = new Scanner(System.in);
		
		System.out.print("住所の入力");
		String str1 = sin1.next();
		System.out.print("氏名の入力");
		String str2 = sin2.next();
		System.out.print("電話番号の入力");
		String str3 = sin3.next();
		
		System.out.format("%s\n%s\n%s\n",str1,str2,str3);
	}

}
