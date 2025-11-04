/*
*Öğrenci Adı-Soyadı: Zehra ÖZDEMİR 
*Öğrenci No: 250541082
*Tarih:04.11.2025
*Açıklama:Öğrenci Bilgi Sistemi
*İlk başta idea programımda bir hata çıktı yazdırma işlemini yapamadım gemini yardımı ile hatayı düzelttik ve ödevimi tamamladım.
*/


public class OgrenciBilgiSistemi {

    public static void main(String[] args) {
        // İstenen sabit öğrenci bilgileri
        String ad = "Zehra";
        String soyad = "Özdemir";
        int ogrenciNo = 250541082;
        int yas = 19;
        double gpa = 3.2;

        // Ekrana çıktı düzenlemesi

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        // Örnekteki gibi Ad Soyad girdisi simülasyonu
        System.out.println("Adinizi girin: " + ad);
        System.out.println("Soyadinizi girin: " + soyad);
        System.out.println("Ogrenci numaraniz: " + ogrenciNo);
        System.out.println("Yasiniz: " + yas);
        // GPA (0.00-4.00) çıktısını gösterir
        System.out.printf("GPA (0.00-4.00): %.2f%n", gpa);

        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");

        // Düzenli Çıktı
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ogrenci No: " + ogrenciNo);
        System.out.println("Yas: " + yas);

        // GPA'yi 2 ondalık basamakla göstermek için printf kullanıldı
        System.out.printf("GPA: %.2f%n", gpa);

        // Durum belirleme (örnekteki "Basarili Ogrenci" çıktısına benzer bir mantık)
        String durum = (gpa >= 2.0) ? "Basarili Ogrenci" : "Tekrar Etmeli";
        System.out.println("Durum: " + durum);

        /*
        // Eğer kullanıcıdan GİRİŞ ALMAK isterseniz, bu kısmı kullanabilirsiniz:

        import java.util.Scanner;
        Scanner input = new Scanner(System.in);

        System.out.print("Adinizi girin: ");
        String ad_input = input.next(); // tek kelime

        System.out.print("Soyadinizi girin: ");
        String soyad_input = input.next(); // tek kelime

        System.out.print("Ogrenci numaraniz: ");
        int ogrenciNo_input = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas_input = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa_input = input.nextDouble();

        input.close();

        // Sonraki çıktılarda gpa_input, ad_input vb. değişkenleri kullanın.
        */
    }
}
