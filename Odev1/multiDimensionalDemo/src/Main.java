public class Main {

    public static void main(String[] args) {
	    String[][] sehirler = new String[3][3];
	    sehirler[0][0] = "Manisa";
	    sehirler[0][1] = "Ankara";
        sehirler[0][2] = "İstanbul";
        sehirler[1][0] = "Konya";
        sehirler[1][1] = "İzmir";
        sehirler[1][2] = "Muğla";
        sehirler[2][0] = "Balıkesir";
        sehirler[2][1] = "Bolu";
        sehirler[2][2] = "Bursa";

        for (String[] sehirs:sehirler) {
            for (String sehir:sehirs) {
                System.out.println(sehir);
            }
        }
    }
}
