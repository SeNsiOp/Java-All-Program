package array;

import java.util.Scanner;

public class Array8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean [][] a=new boolean[3][3];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextBoolean();
			}
		}
		for(boolean[] x:a) {
			for(boolean y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		boolean [][] b=new boolean[3][];
		b[0]=new boolean[1];
		b[1]=new boolean[2];
		b[2]=new boolean[3];
		
		int i=0;
		System.out.println("enter element");
		while(i<b.length) {
			int j=0;
			while(j<b[i].length) {
				b[i][j]=sc.nextBoolean();
				j++;
			}
			i++;
		}
		for(boolean[] x:b) {
			for(boolean y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		boolean [][] c=new boolean[2][];
		c[0]=new boolean[2];
		c[1]=new boolean[3];
		int x=0;
		System.out.println("enter element");
		do {
			int j=0;
			do {
				c[x][j]=sc.nextBoolean();
				j++;
			}
			while(j<c[x].length);
			x++;
		}
		while(x<c.length);
		for(boolean[] v:c) {
			for(boolean y:v) {
				System.out.println(y);
			}
		}

	}

}
