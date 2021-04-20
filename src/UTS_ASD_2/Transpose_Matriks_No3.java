package UTS_ASD_2;

import java.util.Scanner;

public class Transpose_Matriks_No3 {
	
	public static void profil() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126 (2C)");
		System.out.println("===========================");
	}

	public static void main(String[] args) {
		 int i, j, m, n;
	        int matriks[][] = new int [10][10];
	        int transpose[][] = new int [10][10];
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Masukkan Jumlah Baris Matriks A: ");
	        m = scan.nextInt();
	        System.out.print("Masukan Jumlah Kolom Matriks A: ");
	        n = scan.nextInt();
	        System.out.println("Masukkan Element Matriks A: ");
	        for (i = 0; i < m; i++){
	            for(j = 0; j < n; j++){
	                matriks[i][j] = scan.nextInt();
	            }
	        }
	        System.out.println("Hasil Matriks A: ");
	        for (i = 0; i < m; i++){
	            for(j = 0; j < n; j++){
	                System.out.print(matriks[i][j] + "\t" );
	            }
	            System.out.println();
	        }
	        for(i = 0;i<m;i++){
	            for(j = 0;j<n;j++){
	                transpose[j][i]=matriks[i][j];
	            }
	        }
	        System.out.println("Hasil Transpose Matriks A: ");
	        for (i=0;i<n;i++){
	            for(j=0;j<m;j++){
	                System.out.print(transpose[i][j]+"\t");
	            }
	            System.out.println();
	        }
	        
	        System.out.print("Masukkan Jumlah Baris Matriks B: ");
	        m = scan.nextInt();
	        System.out.print("Masukan Jumlah Kolom Matriks B: ");
	        n = scan.nextInt();
	        System.out.println("Masukkan Element Matriks B: ");
	        for (i = 0; i < m; i++){
	            for(j = 0; j < n; j++){
	                matriks[i][j] = scan.nextInt();
	            }
	        }
	        System.out.println("Hasil Matriks B: ");
	        for (i = 0; i < m; i++){
	            for(j = 0; j < n; j++){
	                System.out.print(matriks[i][j] + "\t" );
	            }
	            System.out.println();
	        }
	        for(i = 0;i<m;i++){
	            for(j = 0;j<n;j++){
	                transpose[j][i]=matriks[i][j];
	            }
	        }
	        System.out.println("Hasil Transpose Matriks B: ");
	        for (i=0;i<n;i++){
	            for(j=0;j<m;j++){
	                System.out.print(transpose[i][j]+"\t");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        profil();
	    }

	}

