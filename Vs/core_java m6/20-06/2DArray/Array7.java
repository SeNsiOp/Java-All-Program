package array;

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char [][] a=new char[3][3];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.next().charAt(0);
			}
		}
		for(char[] x:a) {
			for(char y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		char [][] b=new char[4][];
		b[0]=new char[1];
		b[1]=new char[4];
		b[2]=new char[3];
		b[3]=new char[2];
		
		int i=0;
		System.out.println("enter element");
		while(i<b.length) {
			int j=0;
			while(j<b[i].length) {
				b[i][j]=sc.next().charAt(0);
				j++;
			}
			i++;
		}
		for(char[] x:b) {
			for(char y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		char [][] c=new char[2][];
		c[0]=new char[2];
		c[1]=new char[3];
		int x=0;
		System.out.println("enter element");
		do {
			int j=0;
			do {
				c[x][j]=sc.next().charAt(0);
				j++;
			}
			while(j<c[x].length);
			x++;
		}
		while(x<c.length);
		for(char[] v:c) {
			for(char y:v) {
				System.out.println(y);
			}
		}

	}
}
