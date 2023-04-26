package calc;

public class Calculadora {

    private int soma;

    public synchronized int somaArray(int[] array){
        soma = 0;

        for (int element:
             array) {
            soma += element;

            try{
                Thread.sleep(100);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
        return soma;
    }
}
