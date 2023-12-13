package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("---------------------------");

		//camelCase
		//Don't repeat yourself
		String internetSubesiButonu = "İnternet Şubeye Gir";
		double dolarDun = 27.7;
		double dolarBugun = 28.1;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println("InternetSubeButonu");
		
		if(dolarBugun<dolarDun){
			System.out.println("Dolar Düştü img.");
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar Yükseldi img.");
		}
		else {
			System.out.println("Dolar Eşit Kaldı img.");
		}
	
		System.out.println("---------------------------");

		String kredi1 ="Hızlı Kredi";
		String kredi2 ="Mutlu Emekli Kredisi";
		String kredi3 ="Konut Kredisi";
		String kredi4 ="Çiftçi Kredisi";
		String kredi5 ="Msb Kredisi";
		String kredi6 ="Meb Kredisi";
		String kredi7 ="Kültür Bakanlığı Kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		
		System.out.println("---------------------------");

// yukardaki şekilde yapmak doğru değil.
// çünkü yeni bir kredi eklendiğinde hem çıktı için hem yeni bir string yazmak gerekiyor.
// Doğru kullanım aşağıdaki gibi stringleri bir yerde toplayıp for döngüsü kurmak.

		String[] krediler = { 
				"Hızlı Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"Kültür Bakanlığı Kredisi"
		};
	
		 //foreach
		for(String kredi : krediler){
			System.out.println(kredi);
		}
		
		System.out.println("---------------------------");

		//alternatif for döngüsü
		
		for(int i = 0; i<krediler.length;i++){ //i++ yerine i=i+1 de yazılabilir
			System.out.println(krediler[i]);
		}
		
		System.out.println("---------------------------");
        
		//Değer Tip
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		System.out.println("---------------------------");
	
		//Referans Tip 
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		//##### Değer tip: 
		//Belleğin Stack bölümünde direk değeri tutar. Değeri tuttuğu için sayi 1'deki değer, sayi2' deki 20 yi değerini alır. Ondan sonra sayi2 ye 100 atanması, sayi1 'i etkilemez.
		//örn: double, int, boolean....
		//##### Referans Tip 
		//Belleğin stack bölümünde Heap bölümündeki adres tutulur. Sayi1 , sayi2 nin değerini değil adresini alır. Bu yüzden sayi2 deki adresdeki bilginin değişmesi Sayi1' in çıktısını etkiler.
		//örn: dizi, class, interface...
		
		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);
		//İstisna!
		//String ifadeler referans tiptir fakat çıktısı değer tip gibi çalışır.
				
	}
	

}
