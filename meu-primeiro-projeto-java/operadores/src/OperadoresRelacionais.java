public class OperadoresRelacionais {
    public static void main(String[] args) {
        // "==" Quando desejamos verificar ser uma variavel é IGUAL A outra.
        // "!=" Quando desejamos verificar se uma variavel é DIFERENTE da outra.
        // ">" Quando desejamos verificar se uma variavel é MAIOR QUE a outra.
        // ">=" Quando desejamos verificar se uma variavel é MAIOR OU IGUAL  a outra.
        // "<" Quando desejamos verificar se uma variavel é MENOR QUE outra.
        // "<=" Quando desejamos verificar se uma variavel é MENOR OU IGUAL  a outra.

        String nomeUm = "Jailson";
        String nomeDois = new String("Jailson");

        //Para comparar objetivo, como uma texto, é recomendado usar o ".equals".
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira!");
        }

        System.out.println("NumeroUm é igual a NumeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    }
}
