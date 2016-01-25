package jp.ac.chibafjb.x15g009.kd243;

import jp.ac.chibafjb.x15g009.kd211.ArrayProc;

public class Kadai48 {

	public static void main(String[] args) {
		int num[] = {75,31,64,27,5};
		System.out.print("整列前：　num[] = ");
		for(int i:num){
			System.out.print(i+",");
		}
		System.out.println();
		ArrayProc a = new ArrayProc();
		num = a.bubbleSort2(num);
		System.out.print("整列後：　num[] = ");
		for(int i:num){
			System.out.print(i+",");
		}
	}

}
