/**
 * Pedro Silva LEI ESTGF 2013/2014 8090238@estgf.ipp.pt
 */
package data.enumeracoes;

/**
 *
 * @author Pedro
 */
public enum DiaDaSemana {

    /**
     * Segunda Feira.
     */
    SEGUNDA,
    /**
     * Terça Feiras
     */
    TERCA,
    /**
     * Quarta Feira
     */
    QUARTA,
    /**
     * Quinta Feira
     */
    QUINTA,
    /**
     * Sexta Feiras
     */
    SEXTA,
    /**
     * Sábado
     */
    SABADO,
    /**
     * Domingi
     */
    DOMINGO;

    /**
     * Metodo que basiado numa enumeração nos da o dia da semana.
     * @param dia recebe o dia 
     * @return o dia por extenso em português.
     */
    public String getDia(DiaDaSemana dia) {
        String resultado;
        switch (dia) {
            case SEGUNDA:
                resultado = "Segunda-Feira";
                break;
            case TERCA:
                resultado = "Terça-Feiras";
                break;
            case QUARTA:
                resultado = "Quarta-Feiras";
                break;
            case QUINTA:
                resultado = "Quinta-Feira";
                break;
            case SEXTA:
                resultado = "Sexta-Feira";
                break;
            case SABADO:
                resultado = "Sábado";
                break;
            case DOMINGO:
                resultado = "Domingo";
                break;
            default:
                resultado = "Dia inválido";
                break;

        }
        return resultado;
    }
}
