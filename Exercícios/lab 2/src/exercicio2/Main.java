package exercicio2;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long beforeExecution = System.currentTimeMillis();
        System.out.println("Tempo antes da execução em milissegundos: " + beforeExecution);

        int fileQuantity;
        fileQuantity = 10;
        //fileQuantity = 100;
        //fileQuantity = 1000;

        ThreadPoolExecutor ex02 = (ThreadPoolExecutor) Executors.newFixedThreadPool(fileQuantity);

        for (int i = 1; i <= fileQuantity; i++)
        {
            ex02.execute((new exercicio2.EX02("src/files/file" + i +".txt")));
        }

        ex02.shutdown();
        ex02.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        System.out.println("soma final: " + Counting.getFinalCounter());
        long afterExecution = System.currentTimeMillis();
        System.out.println("Tempo após a execução em milissegundos: " + afterExecution);
        System.out.println("Diferença de tempo em milissegundos: " + (afterExecution - beforeExecution));

        /*
         * Diferença de tempo em milissegundos: 40 (10 arquivos)
         * Diferença de tempo em milissegundos: 66 (100 arquivos)
         * Diferença de tempo em milissegundos: 199 (1000 arquivos)
         */

        /*
         Informações computador

        - Modelo do processador: Intel64 Family 6 Model 141 Stepping 1 GenuineIntel ~2688 Mhz
            Caption: Intel64 Family 6 Model 141 Stepping 1
            Architecture: 9
            CpuStatus: 1
            CurrentClockSpeed: 2688
            DataWidth: 64
            DeviceID: CPU0
            Family: To Be Filled By O.E.M.
            L2CacheSize: 7680
            L2CacheSpeed: 12288
            L3CacheSize: 0
            L3CacheSpeed: 0
            Manufacturer: GenuineIntel
            MaxClockSpeed: 2688
            Name: 11th Gen Intel(R) Core(TM) i5-11400H @ 2.70GHz
            NumberOfCores: 6
            NumberOfEnabledCore: 6
            NumberOfLogicalProcessors: 12
            ProcessorType: 3
            SocketDesignation: U3E1
            AddressWidth: 64
        - Memória física total: 7.955 MB
        - Versão do sistema operacional: Microsoft Windows 11 Home Single Language
        - Tipo de sistema: x64-based PC
        - diskdrive: NVMe HFM512GD3JX016N  \\.\PHYSICALDRIVE0  NVMe HFM512GD3JX016N  3           512105932800
        */
    }
}
