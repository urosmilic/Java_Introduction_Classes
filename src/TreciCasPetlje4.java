
public class TreciCasPetlje4 {
    public static void main(String[] args) {

        //Prikazati parne jednocifrene brojeve

        for (int i = 1; i < 100; i++) {
            if (i%2 == 0 && i%3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Kraj programa");

    }
}