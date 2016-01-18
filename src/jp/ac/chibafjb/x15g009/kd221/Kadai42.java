package jp.ac.chibafjb.x15g009.kd221;

import java.util.Scanner;

import jp.ac.chibafjb.x15g009.kd211.ArrayProc;

public class Kadai42 {
	public static void main(String[] args) {
		int score[] = new int[100];
		for(int a = 0;a<100;a++){
			score[a] = (int)(Math.random()*999);
		}
		Scanner s = new Scanner(System.in);
		int s_num = s.nextInt();
		ArrayProc a = new ArrayProc();
		int i = a.linerSearch1(score,s_num);
		if(i == 100)
			System.out.format("探索値%dは、配列score[]に存在しません。\n",s_num);
		else
			System.out.format("探索値%dは、配列score[%d]に存在します。\n",s_num,i);
		int i2 = a.linerSearch2(score,s_num);
		if(i2 == 100)
			System.out.format("探索値%dは、配列score[]に存在しません。\n",s_num);
		else
			System.out.format("探索値%dは、配列score[%d]に存在します。\n",s_num,i);
		s.close();
	}
}

