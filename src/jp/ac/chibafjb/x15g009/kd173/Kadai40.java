package jp.ac.chibafjb.x15g009.kd173;

import java.util.Scanner;

public class Kadai40 {

	public static void main(String[] args) {
		int k = 3;
		int[] data = new int[k+1];
		Scanner sin = new Scanner(System.in);
		int a = sin.nextInt();
		int b = sin.nextInt();
		int d = sin.nextInt();
		data[0] = a;
		data[1] = b;
		data[2] = d;
		for(int i = 0;i<k;i++){
			data[k-i] = data[k-i-1];
		}
		int c = 0;
		for(int i:data){
			System.out.println("data["+c+"] = "+i);
			c++;
		}
		sin.close();

	}

}
