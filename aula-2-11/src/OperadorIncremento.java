public class OperadorIncremento {

  public static void main(String[] args) {
    int totalDownloads = 10;

//    totalDownloads = totalDownloads + 1;
//    totalDownloads += 1;
//    totalDownloads++;//pós fixada

//    int novoTotalDownloads = totalDownloads++;
    int novoTotalDownloads = ++totalDownloads;//pré fixado
    System.out.println("Total de downloads: " + totalDownloads);
    System.out.println("Total de downloads: " + novoTotalDownloads);
  }
}
