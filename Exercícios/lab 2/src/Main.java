public class Main {
    public static void main(String[] args) {
        //deixar genérico, percorrer um for e ler vários arquivos sendo todos em uma pasta ou pedir para o usuário a quantidade de arquivos e somar o total de linha de todos os arquivos

        (new ex01("src/file1.txt")).start();
        (new ex01("src/file2.txt")).start();
        (new ex01("src/file3.txt")).start();
    }
}
