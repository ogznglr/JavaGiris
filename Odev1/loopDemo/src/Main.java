public class Main {

    public static void main(String[] args) {
	    //for
        for(int i = 0; i<10; i++) {
            System.out.println("i degeri : " + i);
        }
        System.out.println("Döngü bitti!");

        int i = 0;
        while (i < 10){
            System.out.println("while i degeri : " + i);
            i++;
        }
        System.out.println("While döngüsü bitti!");

        do {
            System.out.println("Döngüye giriş yaptım");
            i++;
        }while(i < 12);
        System.out.println("Do while bitti!");

    }
}
