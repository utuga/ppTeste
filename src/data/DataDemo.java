/**
*Pedro Silva
*LEI ESTGF 2013/2014
*8090238@estgf.ipp.pt
*/

package data;

import data.enumeracoes.MesesDoAno;

/**
 *
 * @author Pedro
 */
public class DataDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data x= new Data(2005, 12, 26);
        System.out.println("Data no formato de inteiros:");
        System.out.println(x.getData());
        System.out.println("Data com o mês por extenso");
        Data y= new Data(2014, MesesDoAno.MARCO, 24);
        System.out.println(y.getDataMesPorExtenso());
    }

}
