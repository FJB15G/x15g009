package jp.ac.chibafjb.x15g009.kd222;

import java.util.Scanner;

import jp.ac.chibafjb.x15g009.kd211.ArrayProc;

public class Kadai43 {

	public static void main(String[] args) {
		double score[] = new double[100];
		for(int a = 0;a<100;a++){
			score[a] = (double)(Math.random()*999);
		}
		Scanner s = new Scanner(System.in);
		double s_num = s.nextDouble();
		ArrayProc a = new ArrayProc();
		int i = a.linerSearch3(score,s_num);
		if(i == 100)
			System.out.format("探索値%fは、配列score[]に存在しません。\n",s_num);
		else
			System.out.format("探索値%fは、配列score[%d]に存在します。\n",s_num,i);
		s.close();
	}

}
