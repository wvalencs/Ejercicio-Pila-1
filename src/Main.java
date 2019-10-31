import java.util.Random;
import java.util.Stack;

public class Main {

    /* llenar una pila de longitud 100 con número aleatorios del 1 al 1000,
     * y después ordenarlos por orden descendente
     */

    public static void main(String[] args) {
        int aux=0;
        int tam=100;
        int arr[]= new int[tam];
        Random ale= new Random();


        for( int i=0;i<100;i++)
        {
            arr[i] = ale.nextInt(100);
        }


        System.out.println("\n");
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam-1;j++)
            {
                if(arr[j] < arr[j+1])
                {
                    aux=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;
                }
            }
        }

        int k=0;
        while (k<tam)
        {
            System.out.println(arr[k]);
            k++;
        }


    }
}

/*
        for( int i=0;i<100;i++)
        {
           int num= alet.nextInt(1000);
           System.out.println((i+1)+": "+num);
         }
         **************

         int aux=0, tam;
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingresar tamaño");
        tam=sc.nextInt();
        System.out.println("valor ingresado es: "+tam+"\n");
        int arr[]= new int[tam];

        for(int i=0;i<tam;i++)
        {
            System.out.println("Ingresar valor: "+(i+1));
            arr[i]=sc.nextInt();
        }

        System.out.println("\n");
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam-1;j++)
            {
                if(arr[j] < arr[j+1])
                {
                    aux=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;
                }
            }
        }

        int k=0;
        while (k<tam)
        {
            System.out.println(arr[k]);
            k++;
        }

        ***** 2 *****
        int num,aux;
        int posicion=0;

        Random ale= new Random();
        int arr[]= new int[100];

        // Realiza conteo del 1 al 100 y con numero aleatorios
        for( int i=0;i<100;i++)
        {
            num= ale.nextInt(100);
          //  System.out.println((i+1)+": "+num);

            // Ordenamiento por burbuja
          //  System.out.println("\n");
            for(int c=0;c<num;c++)
            {
                for(int j=0;j<num-1;j++)
                {
                    if(arr[j] < arr[j+1])
                    {
                        aux=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=aux;
                    }
                }
            }

            int k=0;
            while (k<num)
            {
                System.out.println(arr[k]);
                k++;
            }

        }
    }
 */