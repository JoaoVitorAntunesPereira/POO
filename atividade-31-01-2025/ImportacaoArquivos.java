public interface ImportacaoArquivos {
    String[] carregarConfiguracoes(String arqConfig) throws Exception;
    String[] importarDados(String arqDadosEntrada) throws Exception;
}
