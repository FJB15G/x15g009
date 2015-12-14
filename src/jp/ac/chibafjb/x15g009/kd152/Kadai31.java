package jp.ac.chibafjb.x15g009.kd152;

import java.util.Scanner;

public class Kadai31 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		float r = sin.nextFloat();
		sin.close();
		float p = 3.14f;
		System.out.println("円周　="+(2*p*r));
		System.out.println("面積　="+(p*r*r));
	}

}
