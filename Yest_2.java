package test;

public class Yest_2 {
	public static void main(String[] args) {
	       cf(); 
	       // yanghui();
		//jzt();
	       System.out.println();
		muilt();
		jt();
	}
	//9*9
	public static void cf(){
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=i; j++) {
				if ((i==3&&j==3)||(i==4&&j==3)) {
					System.out.print(" "+i+"*"+j+"="+i*j+" " );	
				}else {
					System.out.print(j+"*"+i+"="+i*j+" " );	
				}
				
			}
			System.out.println("\n");
		}
	}
public static void yanghui() {
	int[][] arr=new int[10][10];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=new int[i+1];
	}
	for (int i = 0; i < arr.length; i++) {
		arr[i][0]=1;
		arr[i][i]=1;
	
		for (int j = 1; j < i; j++) {
			arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
		}
		
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.err.print(arr[i][j]+"\t");
		}
		System.err.println("");
	}
	
}
public static void jzt() {
	int i=5;
	for (int j = 0; j <=i; j++) {
		int times=j;
		while (times!=0) {
			System.err.print("*");
			times--;
		}
		System.err.println("");
	}
}
public static void muilt() {
	for (int i = 1; i <=9; i++) {
		for (int j = 1; j <=i; j++) {
			if ((i==3&&j==3)||(i==4&&j==3)) {
				System.err.print(" "+j+"*"+i+"="+i*j+" ");
			}else {
				System.err.print(j+"*"+i+"="+i*j+" ");
			}
		}
		System.err.println(" ");
	}
}
public static void jt() {
	int j=5;
	for (int i = 1; i <=j; i++) {
		int times=(2*i)-1;
		int time=0;
		while(time!=(j-i)){
			System.err.print(" ");
			time++;
		}
		while(times!=0){
			System.err.print("*");
			times--;
		}
		System.err.println();
	}
}
}
