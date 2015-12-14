package jp.ac.chibafjb.x15g009.kdT21;

import java.util.Scanner;

public class T21 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("ハンバーガーの個数    -->");
		int han = sin.nextInt();
		System.out.print("フライドポテトの個数  -->");
		int fura = sin.nextInt();
		
		System.out.format("ハンバーガーの代金   ＝ %d円\n",(han*100));
		int hanS = han*100;
		System.out.format("フライドポテトの代金 ＝ %d円\n",(fura*180));
		int furaS = fura*180;
		System.out.format("小計                 ＝ %d円\n",(hanS+furaS));
		int syou = hanS+furaS;
		
		System.out.format("消費税               ＝ %1.0f円\n",Math.floor(syou*0.08f));
		double zei = Math.floor(syou*0.08f);
		System.out.format("合計金額             ＝ %.0f円\n",(syou+zei));
		double g = Math.floor(syou+zei);
		
		System.out.print("受取金額              -->");
		int uke = sin.nextInt();
		System.out.format("つり銭               ＝ %.0f円",(uke-g));
		sin.close();
	}

}
