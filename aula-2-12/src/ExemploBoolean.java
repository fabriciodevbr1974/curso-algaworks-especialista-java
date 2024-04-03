public class ExemploBoolean {

  public static void main(String[] args) {
    boolean compraAprovada = true;
    boolean clienteBloqueado = false;

    System.out.println(compraAprovada);
    System.out.println(clienteBloqueado);

    int quantidadeEstoque = 10;
    int quantidadePedidaCompra = 11;

    boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidaCompra;
    System.out.println("Estoque suficiente: " + estoqueSuficiente);

  }
}
