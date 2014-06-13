/**
 * Pedro Silva LEI ESTGF 2013/2014 8090238@estgf.ipp.pt
 */
package data;

import data.enumeracoes.DiaDaSemana;
import data.enumeracoes.MesesDoAno;

/**
 *
 * @author Pedro
 */
public class Data {

    private MesesDoAno mes;
    private DiaDaSemana diaDaSemana;
    private int ano;
    private int nMes;
    private int dia;

    /**
     * Construtor da classe <b> Data</b>
     *
     * @param ano inteiro que representa o ano
     * @param nMes inteiro que representa o mês [1-12]
     * @param dia inteiro que representa o dia do mês.
     */
    public Data(int ano, int nMes, int dia) {
        setAno(ano);
        setnMes(nMes);
        setDia(dia);
    }

    /**
     * Construtor da classe <b> Data</b>
     *
     * @param ano inteiro que representa o ano
     * @param mes String com o nome do mês
     * @param dia inteiro que representa o dia do mês.
     */
    public Data(int ano, MesesDoAno mes, int dia) {
        this.mes = mes;
        this.ano = ano;
        this.dia = dia;
    }

    /**
     * Construtor da classe <b> Data</b>
     *
     * @param ano inteiro que representa o ano
     * @param nMes inteiro que representa o mês [1-12]
     * @param dia inteiro que representa o dia do mês.
     * @param diaDaSemana string que representa o nome do dia da semana.
     */
    public Data(int ano, int nMes, int dia, DiaDaSemana diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
        this.ano = ano;
        this.nMes = nMes;
        this.dia = dia;
    }

    public MesesDoAno getMes() {
        return mes;
    }

    public void setMes(MesesDoAno mes) {
        this.mes = mes;
    }

    public DiaDaSemana getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public int getAno() {
        return ano;
    }

    public final void setAno(int ano) {
        this.ano = ano;
    }

    public int getnMes() {
        return nMes;
    }

    public final void setnMes(int nMes) {
        if (nMes <= 0 || nMes > 12) {
            System.err.println("Mês inválido valores possiveis emtre 1 e 12.");
            this.nMes = -1;
        } else {
            this.nMes = nMes;
        }

    }

    public int getDia() {
        return dia;
    }

    /**
     * Metodo que atribui um dia a uma data.
     *
     * @param dia valor interio que vai ser o valor do dia no mes
     *
     */
    public final void setDia(int dia) {

        switch (this.nMes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia > 31 || dia < 1) {
                    System.err.println("Dia inválido para o mês " + this.nMes);
                    //this.dia = -1;
                    break;
                }
            case 2:
                int x = 0;
                if (anoBissesto(this.ano)) {
                    x = 29;
                } else {
                    x = 28;
                }
                if (dia > x || dia < 1) {
                    System.err.println("Dia inválido para o mês " + this.nMes);
                    //this.dia = -1;
                    break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 30 || dia < 1) {
                    System.err.println("Dia inválido para o mês " + this.nMes);
                    //this.dia = -1;
                    break;
                }
            default:
                if(dia<=0 ||dia >31){
                    System.err.println("Dia inválido para o mês " + this.nMes);
                    this.dia=-1;
                }else{
                 this.dia = dia;   
                }
                
        }

    }

    /**
     * Metodo getData
     *
     * @return uma string com a data no formato dd/mm/aaaa.
     */
    public String getData() {
        
        return "" + this.dia + "/" + this.nMes + "/" + this.ano;
    }
    
    /**
     * metodo que retorna a data com o mês por extenso
     * @return uma sting coma  data.
     */
    public String getDataMesPorExtenso(){
        return ""+this.dia+"/"+this.mes.getMes(mes)+"/"+this.ano;
    }

    /**
     * Metodo que verifica se determinado ano é bisesto ou não,
     * @param year inteiro que equivale ao ano.
     * @return true caso a ano seja bisesto, false caso contrario.
     */
    public boolean anoBissesto(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
