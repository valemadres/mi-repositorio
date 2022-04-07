public class ejercicio_1{
    int[]vector_numeros=new  int[10];
    
    public ejercicio_1(){
    }
    
    public void ejecutar(){
        for (int i = 0 ; i <vector_numero.lenght; i++){
            int aleatorio=(int) (Math.radom() *10 + 1);
            
            vector_numero[i] = aleatorio;
        } 
        for (int i = 0 ; i <vector_numero.lenght; i++){
            int numero= vector_nuemro[i];
            int cuadrado=(int) Math.pow(numero, 2);
            int cubo=(int)Math.pow(numero, 3);

            System.out.println("vectores_numeros[" + 1 +"]: "+ numero ", " + cuadrado + " ," + cubo);
        }
    }
}
