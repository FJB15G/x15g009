package jp.ac.chibafjb.x15g009.kd231;

import java.util.Scanner;

import jp.ac.chibafjb.x15g009.kd211.ArrayProc;

public class Kadai44 {

	public static void main(String[] args) {
		int[] data = new int[5];
		data[0] = 4;
		data[1] = 12;
		data[2] = 47;
		data[3] = 71;
		data[4] = 86;
		Scanner s = new Scanner(System.in);
		int s_int = s.nextInt();
		ArrayProc a = new ArrayProc();
		int i = a.binarySearch1(data,s_int);
		if(i != -1)
			System.out.format("探索値%dは、配列data[%d]に存在します。",s_int,i);
		else
			System.out.format("探索値%dは、配列data[]に存在しません。",s_int);
		s.close();
	}

}
