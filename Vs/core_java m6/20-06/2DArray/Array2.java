package array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte [][] a=new byte[3][3];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextByte();
			}
		}
		for(byte[] x:a) {
			for(byte y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		byte [][] b=new byte[4][];
		b[0]=new byte[1];
		b[1]=new byte[4];
		b[2]=new byte[3];
		b[3]=new byte[2];
		
		int i=0;
		System.out.println("enter element");
		while(i<b.length) {
			int j=0;
			while(j<b[i].length) {
				b[i][j]=sc.nextByte();
				j++;
			}
			i++;
		}
		for(byte[] x:b) {
			for(byte y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		byte [][] c=new byte[2][];
		c[0]=new byte[2];
		c[1]=new byte[3];
		int x=0;
		System.out.println("enter element");
		do {
			int j=0;
			do {
				c[x][j]=sc.nextByte();
				j++;
			}
			while(j<c[x].length);
			x++;
		}
		while(x<c.length);
		for(byte[] v:c) {
			for(byte y:v) {
				System.out.println(y);
			}
		}

	}
}
