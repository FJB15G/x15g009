package jp.ac.chibafjb.x15g009.kd163;

public class Kadai35 {

	public static void main(String[] args) {
		int[] x;
		int n = 5;
		x = new int[n];
		x[0] = 33;
		x[1] = 18;
		x[2] = 102;
		x[3] = 47;
		x[4] = 5;
		int sum = 0;
		for(int i = 0;i<n;i++){
			sum += x[i];
		}
		System.out.println("合計  ＝  "+sum);

	}

}
