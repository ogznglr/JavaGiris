import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        /*System.out.println("Eleman Sayısı: " + mesaj.length());
        System.out.println("5. Eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın."));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));*/

        mesaj = mesaj.replace(' ', '-');
        mesaj = mesaj.replace('ü','u');
        mesaj = mesaj.replace('ç','c');
        System.out.println("Yeni mesaj: " + mesaj);
        System.out.println("substring: " + mesaj.substring(2));
        for (String kelime: mesaj.split("-")) {
            System.out.println(kelime);
        }
        mesaj = mesaj.toLowerCase();
        System.out.println(mesaj);

        mesaj = "     Bugün hava çok güzel   ";
        System.out.println(mesaj.trim());
    }
}
