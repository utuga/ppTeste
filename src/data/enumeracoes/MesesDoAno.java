/**
 * Pedro Silva LEI ESTGF 2013/2014 8090238@estgf.ipp.pt
 */
package data.enumeracoes;

/**
 *
 * @author Pedro
 */
public enum MesesDoAno {

    /**
     * Janeiro
     */
    JANEIRO,
    /**
     * Fevereiro
     */
    FEVEREIRO,
    /**
     * Março
     */
    MARCO,
    /**
     * Abril
     */
    ABRIL,
    /**
     * maio
     */
    MAIO,
    /**
     * Junho
     */
    JUNHO,
    /**
     * Julho
     */
    JULHO,
    /**
     * Agosto
     */
    AGOSTO,
    /**
     * Setembro
     */
    SETEMBRO,
    /**
     * Outubro
     */
    OUTUBRO,
    /**
     * Novembro
     */
    NOVEMBRO,
    /**
     * Dezembro
     */
    DEZEMBRO;

    /**
     * Metodo que baseado numa enumaração da o mês doa no
     *
     * @param mes mes na enumeração
     * @return o mês por extenso em portugues.
     */
    public String getMes(MesesDoAno mes) {
        String resultado;
        switch (mes) {
            case JANEIRO:
                resultado = "Janeiro";
                break;
            case FEVEREIRO:
                resultado = "Fevereiro";
                break;
            case MARCO:
                resultado = "Março";
                break;
            case ABRIL:
                resultado = "Abril";
                break;
            case MAIO:
                resultado = "Maio";
                break;
            case JUNHO:
                resultado = "Junho";
                break;
            case JULHO:
                resultado = "Julho";
                break;
            case AGOSTO:
                resultado = "Agosto";
                break;
            case SETEMBRO:
                resultado = "Setembro";
                break;
            case OUTUBRO:
                resultado = "Outubro";
                break;
            case NOVEMBRO:
                resultado = "Novembro";
                break;
            case DEZEMBRO:
                resultado = "Dezembro";
                break;
            default:
                resultado = "Mês Inválido";
                break;

        }
        return resultado;

    }

    public int getNumeroMes(MesesDoAno mes) {
        int x;
        switch (mes) {
            case JANEIRO:
                x = 1;
                break;
            case FEVEREIRO:
                x = 2;
                break;
            case MARCO:
                x = 3;
                break;
            case ABRIL:
                x = 4;
                break;
            case MAIO:
                x = 5;
                break;
            case JUNHO:
                x = 6;
                break;
            case JULHO:
                x = 7;
                break;
            case AGOSTO:
                x = 8;
                break;
            case SETEMBRO:
                x = 9;
                break;
            case OUTUBRO:
                x = 10;
                break;
            case NOVEMBRO:
                x = 11;
                break;
            case DEZEMBRO:
                x = 12;
                break;
            default:
                x = -1;
                break;

        }
        return x;
    }

}
