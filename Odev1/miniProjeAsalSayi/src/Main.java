public class Main {

    public static void main(String[] args) {
	    int sayi = 2;

        if(sayi == 1){
            System.out.println("Sayı asal değildir.");
            return;
        }else if (sayi < 1){
            System.out.println("Geçersiz sayı");
            return;
        }

	    int counter = 0;
	    for(int i = 1; i<sayi; i++) {
            if(sayi % i == 0) {
                counter++;
            }
        }

	    if (counter <= 1 ) {
	        System.out.println("Sayı asaldır.");
        }else {
            System.out.println("Sayı asal değildir.");
        }

    }
}
