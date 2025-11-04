/*Öğrenci Adı Soayadı: Zehra ÖZDEMİR
 *Öğrenci No: 250541082
 *Tarih:04.11.2025
 *Açıklama:Maaş Bordrosu Hesaplama
 *Özellikle final kısımlarını eklemek beni çok zorladı bu ödevde diğerlerine nazaran daha çok geminiden yardım aldım.
 */
  import java.util.Scanner;
import java.text.DecimalFormat;

public class MaasBordrosu {

    // Hesaplamalar için gerekli sabitler
    private static final int STANDART_AYLIK_SAAT = 160;
    private static final double MESAI_KATSAYISI = 1.5;
    private static final double SGK_ORAN = 0.14;
    private static final double GELIR_VERGISI_ORAN = 0.15;
    private static final double DAMGA_VERGISI_ORAN = 0.00759; // %0.759
    private static final int STANDART_AYLIK_CALISMA = 176;
    private static final int STANDART_AYLIK_IS_GUNU = 22;

    public static void main(String[] args) {

        // Değerler dışarıdan alınır veya metodlar/constructor aracılığıyla set edilir.
        // Şimdilik yer tutucu olarak kullanıcıdan girdi alalım:
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Çalışan Bilgileri ---");
        System.out.print("Çalışan Adı Soyadı (String): ");
        String calisanAdSoyad = scanner.nextLine();

        System.out.print("Aylık Brüt Maaş (double TL): ");
        double brutMaas = scanner.nextDouble();

        System.out.print("Mesai Saat Sayısı (int): ");
        int mesaiSaatiSayisi = scanner.nextInt();

        scanner.close(); // Scanner kapatılır

        // Hesaplama metodunu çağır ve sonuçları al
        hesaplaVeYazdir(calisanAdSoyad, brutMaas, mesaiSaatiSayisi);
    }

    // Tüm hesaplama ve yazdırma işlerini yapan ana metot
    private static void hesaplaVeYazdir(String adSoyad, double bMaas, int mesaiSaat) {

        // 1. Gelirler
        // Mesai Ücreti = (Brüt Maaş / 160) * Mesai Saat * 1.5
        double saatlikUcret = bMaas / STANDART_AYLIK_SAAT;
        double mesaiUcreti = saatlikUcret * mesaiSaat * MESAI_KATSAYISI;
        // Toplam Gelir = Brüt + Mesai
        double toplamGelir = bMaas + mesaiUcreti;

        // 2. Kesintiler
        double sgkKesintisi = toplamGelir * SGK_ORAN;
        double gelirVergisiKesintisi = toplamGelir * GELIR_VERGISI_ORAN;
        double damgaVergisiKesintisi = toplamGelir * DAMGA_VERGISI_ORAN;
        // Toplam Kesinti
        double toplamKesinti = sgkKesintisi + gelirVergisiKesintisi + damgaVergisiKesintisi;

        // 3. Net Maaş
        double netMaas = toplamGelir - toplamKesinti;

        // 4. İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / STANDART_AYLIK_CALISMA;
        double gunlukNetKazanc = netMaas / STANDART_AYLIK_IS_GUNU;


        // Çıktı formatı için DecimalFormat kullanıldı (daha profesyonel yaklaşım)
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Çıktı Yazdırma Kısmı
        System.out.println("\n=============================================");
        System.out.println("              MAAŞ BORDROSU                  ");
        System.out.println("=============================================");
        System.out.printf("ÇALIŞAN: %s\n", adSoyad);
        System.out.println("---------------------------------------------");

        // GELİRLER
        System.out.println("GELİRLER:");
        System.out.printf("Brüt Maaş               : %s TL\n", df.format(bMaas));
        System.out.printf("Mesai Ücreti (%d saat) : %s TL\n", mesaiSaat, df.format(mesaiUcreti));
        System.out.printf("TOPLAM GELİR            : %s TL\n", df.format(toplamGelir));
        System.out.println("---------------------------------------------");

        // KESİNTİLER
        System.out.println("KESİNTİLER:");
        System.out.printf("SGK Kesintisi (14.0%%) : %s TL\n", df.format(sgkKesintisi));
        System.out.printf("Gelir Vergisi (15.0%%)  : %s TL\n", df.format(gelirVergisiKesintisi));
        System.out.printf("Damga Vergisi (0.8%%)  : %s TL\n", df.format(damgaVergisiKesintisi));
        System.out.println("---------------------------------------------");
        System.out.printf("TOPLAM KESİNTİ          : %s TL\n", df.format(toplamKesinti));
        System.out.println("---------------------------------------------");
        System.out.printf("NET MAAŞ                : %s TL\n", df.format(netMaas));
        System.out.println("=============================================");

        // İSTATİSTİKLER
        System.out.println("\nİSTATİSTİKLER:");
        System.out.printf("Kesinti Oranı           : %.2f%%\n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç      : %s TL\n", df.format(saatlikNetKazanc));
        System.out.printf("Günlük Net Kazanç       : %s TL\n", df.format(gunlukNetKazanc));
    }
}
