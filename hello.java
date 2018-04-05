public class hello{
    public static void main(String[] args){
        for(int i=1;i<=20;i++){
            System.out.println("Ola mundo ... " + i );
        }
         Soma soma = new Soma(5);
         int valor = soma.retorno();
         System.out.println("o valor é = " + valor);
    }
}