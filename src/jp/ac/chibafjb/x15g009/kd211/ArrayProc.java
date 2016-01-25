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
		for(;i<100 && s[i] != n;){
			i++;
		}
		return i;
	}
		
	public int linerSearch2(int s[],int n){
		int i = 99;
		for(;i>=0 && s[i] != n;){
			i--;
		}
		if(i == -1)
			return 100;
		else
			return i;
	}
	
	public int linerSearch3(double s[],double n){
		int i = 0;
		for(;i<100 && s[i] != n;){
			i++;
		}
		return i;
	}
	
	public int binarySearch1(int d[],int s){
		int L = 0;
		int H = 4;
		int m = (L + H) / 2;
		for(;L <= H && d[m] != s;){
			if(d[m] < s)
				L = m+1;
			else
				H = m-1;
			m = (L + H) / 2;
		}
		if(L <= H)
			return m;
		return -1;
	}
	
	public int binarySearch2(int d[],int s){
		int L = 0;
		int H = 4;
		int m = (L + H) / 2;
		for(;L <= H && d[m] != s;){
			if(d[m] > s)
				L = m+1;
			else
				H = m-1;
			m = (L + H) / 2;
		}
		if(L <= H)
			return m;
		return -1;
	}
	
	public int[] bubbleSort1(int[] num){
		int j = num.length-1;
		for(;j >= 1;){
			int i = 0;
			for(int work = 0;i < j;){
				if(num[i] > num[i+1]){
					work = num[i];
					num[i] = num[i+1];
					num[i+1] = work;
				}
				i++;
			}
			j--;
		}
		return num;
	}
	
	public int[] bubbleSort1a(int[] num){
		int j = num.length-1;
		int count = 1;
		for(;j >= 1;){
			int i = 0;
			System.out.format("%dサイクル目\n",count++);
			for(int work = 0;i < j;){
				if(num[i] > num[i+1]){
					work = num[i];
					num[i] = num[i+1];
					num[i+1] = work;
				}
				i++;
				for(int t:num){
					System.out.print(t+",");
				}
				System.out.println();
			}
			j--;
		}
		return num;
	}
	
	public int[] bubbleSort2(int[] num){
		int j = num.length-1;
		for(;j >= 1;){
			int i = 0;
			for(int work = 0;i < j;){
				if(num[i] < num[i+1]){
					work = num[i];
					num[i] = num[i+1];
					num[i+1] = work;
				}
				i++;
			}
			j--;
		}
		return num;
	}
}
