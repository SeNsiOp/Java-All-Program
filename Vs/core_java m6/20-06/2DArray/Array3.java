package array;
import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		short [][] a=new short[3][3];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextShort();
			}
		}
		for(short[] x:a) {
			for(short y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		short [][] b=new short[4][];
		b[0]=new short[4];
		b[1]=new short[3];
		b[2]=new short[5];
		b[3]=new short[7];
		
		int i=0;
		System.out.println("enter element");
		while(i<b.length) {
			int j=0;
			while(j<b[i].length) {
				b[i][j]=sc.nextShort();
				j++;
			}
			i++;
		}
		for(short[] x:b) {
			for(short y:x) {
				System.out.println(y);
			}
		}
		System.out.println();
		short [][] c=new short[2][];
		c[0]=new short[2];
		c[1]=new short[3];
		int x=0;
		System.out.println("enter element");
		do {
			int j=0;
			do {
				c[x][j]=sc.nextShort();
				j++;
			}
			while(j<c[x].length);
			x++;
		}
		while(x<c.length);
		for(short[] v:c) {
			for(short y:v) {
				System.out.println(y);
			}
		}

	}
}
