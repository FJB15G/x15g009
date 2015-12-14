package jp.ac.chibafjb.x15g009.kd153;

import java.util.Scanner;

public class Kadai32 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		float r = sin.nextFloat();
		sin.close();
		float p = 3.14f;
		System.out.println("円周"+Math.round(2*p*r*10)/10f);
		System.out.println("面積　="+Math.round(p*r*r*10)/10f);

	}

}
