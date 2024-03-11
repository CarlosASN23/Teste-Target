/**
 * @author Carlos Alberto Souza Nascimento
 * @since 08/03/2024
 *
 * 1) Observe o trecho de código abaixo:
 *
 *  	int INDICE = 13, SOMA = 0, K = 0;
 *
 *  	enquanto K < INDICE faça
 *
 * 	    {
 * 		K = K + 1;
 * 		SOMA = SOMA + K;
 *    }
 *  	imprimir(SOMA);
 * Ao final do processamento, qual será o valor da variável SOMA?
 *
 */
package testetecnico.targetsistemas;

public class Questao01 {

    public static void main(String[] args) {
        int indice = 13, soma = 0, k =0;

        while (k < indice){
            k++;
            soma +=k;
        }
        System.out.println(soma);

        /**
         * Ao final do processo a variavel Soma terá valor = 91
         */
    }
}
