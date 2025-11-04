import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class GeometrikHesap { // İstenen Sınıf Adı

    // Görev 2: Önemli Noktalar'a göre PI sabiti
    private static final double PI = 3.14159;

    // Yarıçapı 5.0 olarak sabitliyoruz. Artık klavye girdisine gerek yok.
    private static final double YARICAP = 5.0;

    public static void main(String[] args) {

        // Çıktıyı 2 ondalık basamağa ayarlamak için format (Ödev kuralı)
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", symbols);

        System.out.println("--- GEOMETRIK HESAPLAYICI ---");
        System.out.println("Dairenin yaricapi girin (cm): " + YARICAP);

        // Hesaplamalar
        double daireAlani = PI * YARICAP * YARICAP;
        double daireCevresi = 2 * PI * YARICAP;
        double daireCapi = 2 * YARICAP;

        // Küre Hacmi: (4/3) için 4.0 / 3.0 kullanıldı (Integer Division hatasını önlemek için)
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(YARICAP, 3);
        double kureYuzeyAlani = 4 * PI * Math.pow(YARICAP, 2);

        // SONUÇLAR
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");

        // Düzenli Hizalama için format
        String format = "%-18s : %s %s";

        System.out.println(String.format(format, "Daire Alani", df.format(daireAlani), "cm^2"));
        System.out.println(String.format(format, "Daire Cevresi", df.format(daireCevresi), "cm"));
        System.out.println(String.format(format, "Daire Capi", df.format(daireCapi), "cm"));
        System.out.println(String.format(format, "Kure Hacmi", df.format(kureHacmi), "cm^3"));
        System.out.println(String.format(format, "Kure Yuzey Alani", df.format(kureYuzeyAlani), "cm^2"));
    }
}
