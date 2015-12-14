package jp.ac.chibafjb.x15g009.kd162;

public class Kadai34 {

	public static void main(String[] args) {
		int[] x;
		x = new int[5];
		x[0] = 33;
		x[1] = 18;
		x[2] = 102;
		x[3] = 47;
		x[4] = 5;
		int sum = 0;
		for(int i = 0;i<=4;i++)
			sum += x[i];
		System.out.print("合計  ＝  "+sum);
	}

}
