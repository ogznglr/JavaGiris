public class Main {

    public static void main(String[] args) {
        int sonuc = Topla(2,3,4,5,6,8,9,11);
        System.out.println("toplam: " + sonuc);
    }
    public static int Topla(int... sayilar){
        int toplam = 0;
        for (int sayi: sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}
