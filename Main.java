package proje;
import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in );
		
		String isim="sevvalyakici" , sifre="abcdef";
		
		
		String kullaniciAdi, kullaniciSifre;
		
		System.out.println("Kullanici Adi Giriniz:" );
		kullaniciAdi=input.next();
		
		System.out.println("Sifre Giriniz:" );
		kullaniciSifre=input.next();
		
		if (isim.equals(kullaniciAdi)&& sifre.equals(kullaniciSifre)) {
			System.out.println("Hos Geldiniz!");
		}else {
			System.out.println("Giris Basarisiz. Tekrar Deneyiniz.");
		}
		
	
	}
	
}

