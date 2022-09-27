public class Main {

    public static void main(String[] args) {
        int sayi1 = 284, sayi2 = 220, toplam = 0;
        for(int i = 1; i<sayi1; i++) {
            if(sayi1 % i == 0){
                toplam += i;
            }
        }
        if (toplam == sayi2) {
            System.out.println("Bu iki sayı arkadaş sayıdır.");
        }else {
            System.out.println("Arkadaş sayı değildir.");
        }
    }
}
