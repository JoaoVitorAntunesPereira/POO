public interface ImportacaoArquivos {
    String[] carregarConfiguracoes(String arqConfig) throws Exception;
    int importarDados(String arqDadosEntrada) throws Exception;
}
