//@Marcelo Marques CB3005631 
import java.util.Scanner;
import java.util.*;
import java.text.*;




public class Data {
    private int dia;
    private int mes;
    private int ano;

    private Scanner scan = new Scanner(System.in);

    public Data() {
        this.entraDia();
        this.entraMes();
        this.entraAno();
    }

    public Data(int d, int m, int a) {
        this.entraAno(a);
        this.entraMes(m);
        this.entraDia(d);
    }


    public void entraDia(int d){
        int qtdDiasMes = quantidadeDiasNoMes(this.mes);

        if(d < 1 || d > qtdDiasMes){
            System.out.println("O dia deve ser um número entre 1 e " + qtdDiasMes);
            return;
        }

        this.dia = d;
    }

    public void entraMes(int m){
        if(m < 1 || m > 12){
            System.out.println("O mês deve ser um número entre 1 e 12");
            return;
        }

        this.mes = m;
    }
    
    public void entraAno(int a){
        if(a <= 0){
            System.out.println("O ano deve ser positivo");
            return;
        }

        this.ano = a;
    }


    public void entraDia(){
        int d;

        do{
            System.out.print("Digite o dia: ");
            d = scan.nextInt();

            if(d < 1 || d > quantidadeDiasNoMes(this.mes)){
                System.out.println("O dia deve ser um número entre 1 e " + quantidadeDiasNoMes(this.mes));
            }
            
        }while(d < 1 || d > quantidadeDiasNoMes(this.mes));

        this.dia = d;
    }

    public void entraMes(){
        int m;

        do{
            System.out.print("Digite o mês: ");
            m = scan.nextInt();

            if(m < 1 || m > 12){
                System.out.println("O mês deve ser um número entre 1 e 12");
            }
            
        }while(m < 1 || m > 12);

        this.mes = m;
    }

    public void entraAno(){
        int a;

        do{
            System.out.print("Digite o ano: ");
            a = scan.nextInt();

            if(a <= 0){
                System.out.println("O deve ser maior que zero");
            }
            
        }while(a <= 0);

        this.ano = a;
    }


    public int retDia(){
        return this.dia;
    }

    public int retMes(){
        return this.mes;
    }

    public int retAno(){
        return this.ano;
    }


    public String mostra1(){

        return String.format("%02d", this.dia) + "/" +
            String.format("%02d", this.mes) + "/" +
            String.format("%04d", this.ano);
    }

    public String mostra2(){

        return String.format("%02d", this.dia) + "/" +
            nomeMes(this.mes) + "/" +
            String.format("%04d", this.ano);
    }

    public boolean bissexto(){
        return (this.ano % 400 == 0)
            || ((this.ano % 4 == 0) && (this.ano % 100 != 0));
    }
    
    public int diasTranscorridos(){
        
        
        int qtdDias = 0;

        for (int auxMes = 1; auxMes < this.mes; auxMes++) {
            qtdDias += quantidadeDiasNoMes(auxMes);
        }

        qtdDias += (this.dia - 1);
        
        return qtdDias;
    }

    public void apresentaDataAtual (){
        DateFormat DFormat = DateFormat.getDateInstance();

        System.out.println("A Data atual é: " + DFormat.format(new Date()));
    }


    private int quantidadeDiasNoMes(int numMes){
        int[] qtdDiasMes = new int[]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(this.bissexto()){
            qtdDiasMes[1] = 29;
        }

        return qtdDiasMes[numMes - 1];
    }

    private String nomeMes(int numMes){
        String[] mesesDoAno = {
            "JANEIRO",
            "FEVEREIRO",
            "MARÇO",
            "ABRIL",
            "MAIO",
            "JUNHO",
            "JULHO",
            "AGOSTO",
            "SETEMBRO",
            "OUTUBRO",
            "NOVEMBRO",
            "DEZEMBRO"
        };

        return mesesDoAno[numMes - 1];
    }
}
