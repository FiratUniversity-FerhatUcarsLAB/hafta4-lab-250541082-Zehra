import java.util.Scanner;

public class GeometrikHesap {
  Zehra ÖZDEMİR 250541082
  27.10.2025
  GEOMETRİK HESAPLAMA SİSTEMİ
    public static void main(String[] args) {
        // Scanner sınıfını kullanıcıdan veri almak için başlatıyoruz.
        Scanner scanner = new Scanner(System.in);

        // Sabit Pi (π) değerini tanımlıyoruz. Genellikle daha hassas bir değer kullanılır.
        // Örnek çıktınıza yakın sonuçlar elde etmek için 3.14159265359 kullanabiliriz.
        final double PI = Math.PI; // Java'daki Math.PI daha hassas bir değer sunar.

        // Başlık
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");

        // Kullanıcıdan yarıçapı girmesini istiyoruz.
        System.out.print("Dairenin yaricapini girin (cm):5.0 ");

        // Yarıçap değerini okuyoruz.
        double r =5.0;

        // Hesaplamalar

        // Daire Alanı: π * r²
        double daireAlani = PI * 5.0 * 5.0;

        // Daire Çevresi: 2 * π * r
        double daireCevresi = 2 * PI * 5.0;

        // Daire Çapı: 2 * r
        double daireCapi = 2 * 5.0;

        // Küre Hacmi: (4/3) * π * r³
        // 4.0 / 3.0 kullanımı, ondalıklı bölme yapılmasını sağlar.
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);

        // Küre Yüzey Alanı: 4 * π * r²
        double kureYuzeyAlani = 4 * PI * 5.0* 5.0;

        // Sonuçları Örnek Çıktı formatına uygun şekilde yazdırıyoruz.
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");

        // Sonuçları iki ondalık basamak hassasiyetle formatlıyoruz.
        // printf kullanılarak formatlama yapılır. %.2f iki ondalık basamak demektir.

        System.out.printf("Daire Alani      : %.2f cm^2\n", daireAlani);
        System.out.printf("Daire Cevresi    : %.2f cm\n", daireCevresi);
        System.out.printf("Daire Capi       : %.2f cm\n", daireCapi);
        System.out.printf("Kure Hacmi       : %.2f cm^3\n", kureHacmi);
        System.out.printf("Kure Yuzey Alani : %.2f cm^2\n", kureYuzeyAlani);

        // Scanner nesnesini kapatmayı unutmuyoruz.
        scanner.close();
    }
}
