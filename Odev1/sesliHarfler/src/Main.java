public class Main {

    public static void main(String[] args) {
	    int[] mukkemmel = new int[100];
	    for(int i = 1000; i>1; i--) {
	        int toplam = 0;
	        for(int j = i-1; j>=1;j--) {
                if(i % j == 0) {
                    toplam = toplam + j;
                }
            }
	        if(toplam == i) {
	            System.out.println(i+" Mükkemmel sayıdır");
            }else {
                System.out.println(i+" Mükkemmel sayı değildir");
            }
        }
    }
}
