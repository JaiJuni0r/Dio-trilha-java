public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        double salarioMinimo = 2500;
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numerocurto2 = (short) numeroNormal;

        //Variaveis podem ser alteradas, como mostra o exemplo abaixo:
        int numero = 2;
        numero = 1;

        System.out.println(numero);

        //Mas, ao adicionar "final" ao iniciar um valor de variavel, ela será constante, não podendo ter variação de valor. Como mostra o exemplo abaixo:

        final double VALOR_DE_PI = 3.14;
    }
}


// Em java, existem 8 tipos de tipos primitivos (São valores brutos e são armazenados diretamente na memoria.)

// São eles: 
// byte = 1 byte de memoria. Pode armazenar entre -128 a 127
// short = 2 byte de memoria. Pode armazenar entre -32.768 a 32.767
// int = 4 byte de memoria. Pode armazenar entre -2.147.483.648 a 2.147.483.647 (Sendo o mais comum de ser usado, devido a compatibilidade da JVM)
// long  = 8 byte de memoria. Pode armazenar entre -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

// float= 4 byte de memoria. Pode armazenar entre -3,4028E+38 a 3,4028E+38
// double = 8 byte de memoria. Pode armazenar entre -1,7976E+308 a 1,7976E+308 (Assim como o int, é mais usado em projetos)

// boolean
// char

// Como se declara uma variavel? Seguindo a convesão, segue uma estrutura padrão de <Tipo> <nomeVariavel> <atribuicaoDeValorOpicional>

// Exemplo:
// int idade; tipo "int", nome "idade", com nenhum valor
// int anoFabricacao = 2021; tipo "int", nome "anoFabricacao", com valor "2021"