package test;

public class MaoPao {
public static void main(String[] args) {
	int [] a={5,2,8,10};
	MaoPao(a);
}

private static void MaoPao(int[] a) {
	// TODO Auto-generated method stub
	int temp;
	for (int i = 0; i < a.length-1; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]>a[j]) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.err.println(a[i]+"\t");
		int b=2<<2;
		System.err.println("++"+b);
	}
	
	
}
}
