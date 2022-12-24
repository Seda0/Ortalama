package Ortalama;

import java.util.Scanner;

public class NotOrtalaması {

	public static void main(String[] args) {
		
   Scanner scan = new Scanner(System.in);
   System.out.println("Vize Giriniz :");
   int Vize=scan.nextInt();
   System.out.println("Final Giriniz :");
   int Final=scan.nextInt();
   System.out.println("Proje Giriniz :");
   int Proje=scan.nextInt();
   System.out.println("Labovatuar Notu Giriniz :");
   int Labovatuar=scan.nextInt();
   
   double notortalama=(Vize*0.2)+ (Final*0.4)+(Proje*0.3)+(Labovatuar*0.1);
   
   
   
   
   
   
   
	}

}
