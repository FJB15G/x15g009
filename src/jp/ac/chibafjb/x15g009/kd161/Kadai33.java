package jp.ac.chibafjb.x15g009.kd161;

public class Kadai33 {

	public static void main(String[] args) {
		int x[] = new int[5];
		x[0] = 33;
		x[1] = 18;
		x[2] = 102;
		x[3] = 47;
		x[4] = 5;
		int sum = 0;
		int i;
		for(i=0;i<x.length;i++)
		{
			sum = sum+x[i];
		}
		System.out.println("合計 = "+sum);
	}

}
