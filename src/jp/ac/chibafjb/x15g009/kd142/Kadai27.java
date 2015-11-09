package jp.ac.chibafjb.x15g009.kd142;

import java.util.Scanner;

public class Kadai27 {

	public static void main(String[] args) {
		Scanner sin1 = new Scanner(System.in);
		Scanner sin2 = new Scanner(System.in);
		System.out.print("整数aの入力");
		int a = sin1.nextInt();
		System.out.print("整数bの入力");
		int b = sin2.nextInt();
		sin1.close();
		sin2.close();
		System.out.format("%d + %d = %d\n",a,b,a+b);
		System.out.format("%d - %d = %d\n",a,b,a-b);
		System.out.format("%d * %d = %d\n",a,b,a*b);
		System.out.format("%d / %d = %d",a,b,a/b);

	}

}
