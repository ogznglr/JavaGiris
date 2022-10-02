public class Main {

    public static void main(String[] args) {
	    int[] sayidizi = new int[50];
	    for(int i = 0; i<sayidizi.length; i++) {
	        sayidizi[i] = RandomSayiBul(100,1);
        }
	    DiziYazdir(sayidizi);
    }

    public static int RandomSayiBul(int max, int min){
        return (int) (Math.random() * (max - min))+1;
    }

    public static void DiziYazdir(int[] dizi){
        for (int eleman: dizi) {
            System.out.println(eleman);
        }
    }
}
