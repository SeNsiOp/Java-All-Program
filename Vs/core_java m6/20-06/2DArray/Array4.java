package array;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long [][] a=new long[3][3];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextLong();
			}
		}
		for(long[] x:a) {
			for(long y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		long [][] b=new long[4][];
		b[0]=new long[1];
		b[1]=new long[4];
		b[2]=new long[3];
		b[3]=new long[2];
		
		int i=0;
		System.out.println("enter element");
		while(i<b.length) {
			int j=0;
			while(j<b[i].length) {
				b[i][j]=sc.nextLong();
				j++;
			}
			i++;
		}
		for(long[] x:b) {
			for(long y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		long [][] c=new long[2][];
		c[0]=new long[2];
		c[1]=new long[3];
		int x=0;
		System.out.println("enter element");
		do {
			int j=0;
			do {
				c[x][j]=sc.nextLong();
				j++;
			}
			while(j<c[x].length);
			x++;
		}
		while(x<c.length);
		for(long[] v:c) {
			for(long y:v) {
				System.out.println(y);
			}
		}

	}

}
