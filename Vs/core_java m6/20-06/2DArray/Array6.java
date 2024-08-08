package array;

import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double [][] a=new double[3][3];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		for(double[] x:a) {
			for(double y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		double [][] b=new double[4][];
		b[0]=new double[1];
		b[1]=new double[4];
		b[2]=new double[3];
		b[3]=new double[2];
		
		int i=0;
		System.out.println("enter element");
		while(i<b.length) {
			int j=0;
			while(j<b[i].length) {
				b[i][j]=sc.nextDouble();
				j++;
			}
			i++;
		}
		for(double[] x:b) {
			for(double y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		double [][] c=new double[2][];
		c[0]=new double[2];
		c[1]=new double[3];
		int x=0;
		System.out.println("enter element");
		do {
			int j=0;
			do {
				c[x][j]=sc.nextDouble();
				j++;
			}
			while(j<c[x].length);
			x++;
		}
		while(x<c.length);
		for(double[] v:c) {
			for(double y:v) {
				System.out.println(y);
			}
		}

	}
}
