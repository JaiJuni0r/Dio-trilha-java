public class OperadoresUnarios {
    public static void main(String[] args) {

        // (+) Operadores unários de valor positivo - numeros são positivos sem esse operador explicitamente;
        // (-) Operador unário de valor negativo - nega um número ou expressão aritmética;
        // (++) Operador unário de incremento de valor - incrementa o valor em 1 unidade;
        // (--) Operador unário de decremento de valor - decrementa o valor em 1 unidade;
        // (!) Operador unário lógico de negação - nega o valor de expressão boolena.
        
        int numero = 5;

        numero = - numero;

        System.out.println(numero);
        // Para colocar o numero como positivo, tirando o valor negativo da operação anterior, precisa de uma multiplicação.
        numero = numero * -1;

        System.out.println(numero);
        
    }
    
}