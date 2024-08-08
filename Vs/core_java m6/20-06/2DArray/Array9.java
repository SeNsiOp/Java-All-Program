package array;

import java.util.Scanner;

public class Array9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String [][] a=new String[3][3];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.next();
			}
		}
		for(String[] x:a) {
			for(String y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		String [][] b=new String[4][];
		b[0]=new String[1];
		b[1]=new String[4];
		b[2]=new String[3];
		b[3]=new String[2];
		
		int i=0;
		System.out.println("enter element");
		while(i<b.length) {
			int j=0;
			while(j<b[i].length) {
				b[i][j]=sc.next();
				j++;
			}
			i++;
		}
		for(String[] x:b) {
			for(String y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		String [][] c=new String[2][];
		c[0]=new String[2];
		c[1]=new String[3];
		int x=0;
		System.out.println("enter element");
		do {
			int j=0;
			do {
				c[x][j]=sc.next();
				j++;
			}
			while(j<c[x].length);
			x++;
		}
		while(x<c.length);
		for(String[] v:c) {
			for(String y:v) {
				System.out.println(y);
			}
		}

	}

}
