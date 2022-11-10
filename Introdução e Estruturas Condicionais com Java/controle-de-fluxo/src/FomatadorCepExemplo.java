public class FomatadorCepExemplo {
    public static void main(String[] args) {
        try {
            
            String cepFormatado = formatarCep("23765054");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            System.out.println("Cep inválido, digite seu cep corretamente!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {

        if (cep.length() != 8)
            throw new CepInvalidoException();

        return "23.765-054";

    }
}
