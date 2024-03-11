/**
 * @author: Carlos Alberto Souza Nascimento
 * @since: 08/03/2024
 *
 * 4)   Você está em uma sala com três interruptores, cada um conectado a uma lâmpada
 *      em uma sala diferente. Você não pode ver as lâmpadas da sala em que está,
 *      mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo
 *      é descobrir qual interruptor controla qual lâmpada.
 *
 *      Como você faria para descobrir, usando apenas duas idas até uma das salas das
 *      lâmpadas, qual interruptor controla cada lâmpada?
 */
package testetecnico.targetsistemas;
public class Questao04 {

    /**
     * Resposta:
     *
     * Uma solução seria: ligar o primeiro interruptor e esperar alguns minutos
     * de forma que a lampada fique quente, após isso desligariamos esse interruptor
     * e ligariamos o segundo, com o segundo ainda ligado iríamos verificar
     * as salas, em caso a lampada estiver acesa então o segundo interruptor
     * é o que acende o desta sala, em caso de entrarmos em uma sala com a lampada
     * apagada iremos verificar se a mesma esta quente, caso esteja o primeiro interruptor
     * é o que a acende. E por fim a ultima lampada seria a do terceiro interruptor.
     */
}
