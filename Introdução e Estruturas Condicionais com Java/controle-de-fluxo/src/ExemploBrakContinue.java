public class ExemploBrakContinue {
    public static void main(String[] args) {
        // exemplo break
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;
            System.out.println(numero);
        }

        System.out.println(" ------------------------------- ");

        // exeplo continue
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;
            System.out.println(numero);
        }
    }
}
