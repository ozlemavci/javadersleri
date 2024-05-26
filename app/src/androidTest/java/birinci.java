import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class birinci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ogrenciNo = new int[10]; //Öğrenci numarası dizisi tanımlandı
        String[] ogrenciAdi = new String[10]; //Öğrenci isimleri dizisi tanımlandı
        for (int i=0;i<10;i++) //10 elemanlı olduğu için 10 kez tekrar eden bir döngü oluşturuldu
        {
            System.out.print((i+1)+". öğrencinin numarasını giriniz...");
            ogrenciNo[i]=input.nextInt(); //Kullanıcıdan öğrenci numarası bilgisi alındı
            System.out.print((i+1)+". öğrencinin adını giriniz...");
            ogrenciAdi[i]=input.next(); //Kullanıcıdan öğrenci isim bilgisi alındı
        }
    }
}
