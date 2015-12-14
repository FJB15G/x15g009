package jp.ac.chibafjb.x15g009.kd144;

import java.util.Scanner;

public class Kadai29 {

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
		
		System.out.format("住　　所：%s\n氏　　名：%s\n電話番号：%s\n",str1,str2,str3);
		sin1.close();
		sin2.close();
		sin3.close();
	}

}
