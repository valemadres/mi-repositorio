import.java.util.scanner;

public class Ejercicio3{
    int notas;
    Scanner scanner;

    public Ejercicio3(){
        notas = new int [5];

        scanner=new Scanner(System.in);
    }
    public  void ejecutar(){
        for (int i = 0 ; i<notas.lenght; i++){  
            System.out.println("notas[" + i +"]: ");
            int nota =scanner.nextInt();

            notas [1] = nota;
        }
        double suma=0;
        double promedio;

        int minimo=10;
        int maximo=0;

        for(int i=0;i<notas.lenght; i++){
            System.out.println("notas[" + i +"]: "+ notas[1]); 
            suma=suma+notas[i];

            if (notas[i] < minimo){
                minimo = notas[i];
            }
            if (notas[i] > maximo){
                maximo = notas[i];
            }
    }
    
    promedio = suma/notas.lenght;

    System.out.println("promedio:"+ promedio);
    System.out.println("Maximo:"+ maximo);
    System.out.println("Minimo:"+ minimo);
}
