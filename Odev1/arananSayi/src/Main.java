public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[10];
        int arananSayi = 20;

        for(int i = 0; i<sayilar.length; i++ ){
            //diziyi random sayılar ile dolduruyoruz
            sayilar[i] = (int) (Math.random()*(50-1))+1;
        }
        for (int sayi: sayilar) {
            System.out.println(sayi);
            if (sayi == arananSayi) {
                System.out.println("Sayı bulundu");
            }
        }
    }
}
