package jp.ac.chibafjb.x15g009.kd211;

public class ArrayProc {
	public int maxFind1(int num[],int a){
		int m = 0;
		int i = 0;
		for(;i<a;){
			if(num[i]>m)
				m = num[i];
			++i;
		}
		return m;
	}
	public int maxFind2(int num[],int a){
		int i = 1;
		int m = num[0];
		for(;i<a;){
			if(num[i]>m)
				m = num[i];
			++i;
		}
		return m;
	}
	public int linerSearch1(int s[],int n){
		int i = 0;
		for(int a:s){
			if(i<100)
				if(a == n)
					break;
			i++;
		}
		return i;
		}
}
