public class Main {

    public static void main(String[] args) {
        double[] doubles = {1.5,2.6,3.7,5.5};
        double total = 0, max = doubles[0];

        for (double sayi: doubles) {
            if(max < sayi) {
                max = sayi;
            }
            total += sayi;
            System.out.println(sayi);
        }
        System.out.println(total);
        System.out.println("Max : " + max);
    }
}
