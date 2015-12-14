package jp.ac.chibafjb.x15g009.kd171;

public class Kadai38 {

	public static void main(String[] args) {
		int k = 3;
		int[] data = new int[k+1];
		data[0] = 100;
		data[1] = 200;
		data[2] = 300;
		for(int i = 0;i<k;i++){
			data[k-i] = data[k-i-1];
		}
		int c = 0;
		for(int i:data){
			System.out.println("data["+c+"] = "+i);
			c++;
		}
	}

}
