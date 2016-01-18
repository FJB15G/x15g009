package jp.ac.chibafjb.x15g009.kd232;

import java.util.Scanner;

import jp.ac.chibafjb.x15g009.kd211.ArrayProc;

public class Kadai45 {

	public static void main(String[] args) {
		int[] data = new int[5];
		data[0] = 132;
		data[1] = 64;
		data[2] = 51;
		data[3] = 19;
		data[4] = 3;
		Scanner s = new Scanner(System.in);
		int s_int = s.nextInt();
		ArrayProc a = new ArrayProc();
		int i = a.binarySearch2(data,s_int);
		if(i != -1)
			System.out.format("探索値%dは、配列data[%d]に存在します。",s_int,i);
		else
			System.out.format("探索値%dは、配列data[]に存在しません。",s_int);
		s.close();
	}

}
