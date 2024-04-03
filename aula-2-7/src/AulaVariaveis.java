public class AulaVariaveis {

  public static void main(String[] args) {
    //Não recomendado pela code conventions da oracle
    //    int minhaIdade = 50, suaIdade = 51;

    //lowerCamelCase
    int minhaIdade = 50;
    int suaIdade = 51;
    System.out.println(minhaIdade);
    minhaIdade = 51;
    System.out.println(minhaIdade);
    int totalIdade = minhaIdade + suaIdade;
    System.out.println("Total das idades: " + totalIdade);
  }

}
