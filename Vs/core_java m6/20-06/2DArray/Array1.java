package array;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][] a=new int[3][3];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int[] x:a) {
			for(int y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		int [][] b=new int[4][];
		b[0]=new int[1];
		b[1]=new int[4];
		b[2]=new int[3];
		b[3]=new int[2];
		
		int i=0;
		System.out.println("enter element");
		while(i<b.length) {
			int j=0;
			while(j<b[i].length) {
				b[i][j]=sc.nextInt();
				j++;
			}
			i++;
		}
		for(int[] x:b) {
			for(int y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		int [][] c=new int[2][];
		c[0]=new int[2];
		c[1]=new int[3];
		int x=0;
		System.out.println("enter element");
		do {
			int j=0;
			do {
				c[x][j]=sc.nextInt();
				j++;
			}
			while(j<c[x].length);
			x++;
		}
		while(x<c.length);
		for(int[] v:c) {
			for(int y:v) {
				System.out.println(y);
			}
		}

	}

}
