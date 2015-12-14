package jp.ac.chibafjb.x15g009.kd172;

public class Kadai39 {

	public static void main(String[] args) {
		int m = 3;
		int n = 2;
		int x[] = {1,2,3};
		int y[] = {7,8};
		int z[] = new int[n+m];
		for(int i = 0;i<n;i++){
			for(int c = 0;c<m;c++){
				z[c] = x[c];
			}
			z[i+m] = y[i];
		}
		System.out.print("z[] = {");
		for(int i:z)
			System.out.print(i);
		System.out.print("}");
	}

}
