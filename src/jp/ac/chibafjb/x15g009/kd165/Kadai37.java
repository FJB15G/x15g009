package jp.ac.chibafjb.x15g009.kd165;

public class Kadai37 {

	public static void main(String[] args) {
		int m = 3;
		int a[] = new int[m];
		int b[] = new int[m];
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		int c;
		for(c = 0;c<3;c++){
			b[m-1] = a[c];
			m--;
		}
		c = 0;
		for(int i:b){
			System.out.println("b["+c+"] = "+i);
		c++;
		}

	}

}
