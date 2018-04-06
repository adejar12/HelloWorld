public class Soma{
    private int a;
    public Soma(int a){
        this.a=a;
    }

    public int retorno(){
        return a;
    }
    // ESSE METODO ESTA NA LINHA MASTER
    public int retornoEmDoseDupla(){
        return a*2;
    }

    // ESSE METODO ESTA NA OUTRA LINHA
    public int retornoEmDoseTripla(){
        return a*3;
    }
}