package jp.ac.chibafjb.x15g009.kd211;

public class Kadai41 {

	public static void main(String[] args) {
		int a = 5;
		int num[] = {2,3,5,8,7};
		
		ArrayProc a1 = new ArrayProc();
		System.out.format("配列num[]の最大値は、%d です。\n",a1.maxFind1(num,a));
		
		ArrayProc a2 = new ArrayProc();
		System.out.format("配列num[]の最大値は、%d です。\n",a2.maxFind2(num,a));
	}
}
/* (1) maxFind2
   (2) エ
*/