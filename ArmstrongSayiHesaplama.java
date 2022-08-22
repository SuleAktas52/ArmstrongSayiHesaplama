import java.util.Scanner;

public class ArmstrongSayiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int sayi = input.nextInt();
        int basamakSayisi=0;
        int basamakDegeri;
        int basamakUssu;
        int sayi1= sayi;
        int sonuc=0;

        while (sayi1 != 0){
            sayi1=sayi1/10;
            basamakSayisi++;
        }
        sayi1=sayi;

        while (sayi1 !=0){
            basamakDegeri=sayi1%10;
            basamakUssu=1;
            for (int i=1; i<=basamakSayisi; i++){
                basamakUssu*=basamakDegeri;
            }

            sonuc+=basamakUssu;
            sayi1=sayi1/10;
        }
        if (sonuc == sayi) {
            System.out.println(sayi + " sayisi bir Armstrong sayidir.");
        } else {
            System.out.println(sayi + " sayisi bir Armstrong sayisi degildir.");
        }
    }
}
