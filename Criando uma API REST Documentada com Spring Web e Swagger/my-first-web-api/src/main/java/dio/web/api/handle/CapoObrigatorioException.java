package dio.web.api.handle;

public class CapoObrigatorioException extends BusinessException {
    public CapoObrigatorioException(String campo){
        super("O campo %s é obrigatório", campo);
    }
}
