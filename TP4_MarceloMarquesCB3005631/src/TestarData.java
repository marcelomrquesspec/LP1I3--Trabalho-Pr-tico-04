//@Marcelo Marques CB3005631 

public class TestarData {
    public static void main (String[] args){
        Data MarceloMarques = new Data (1,1 ,2022 );
        
        
        System.out.println("Marcelo Marques");
        System.out.println("Mostra 1: " + MarceloMarques.mostra1());
        System.out.println("Mostra 2: " + MarceloMarques.mostra2());
        System.out.println("Ano é bissexto: " + MarceloMarques.bissexto());
        System.out.println("Dias transcorridos: " + MarceloMarques.diasTranscorridos());
        MarceloMarques.apresentaDataAtual();
        System.out.println("");

        
    }
}
