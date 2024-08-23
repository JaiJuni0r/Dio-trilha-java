public class OperadoresTernarios {
    public static void main(String[] args) {
        //Operadores ternarios sao representados pelos simbolos de "?" (caso seja true) e ":" (caso seja false).

        int a, b;
        a = 6;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";

        // Seria como usar dessa forma.

        // if(a==b)
        //     resultado = "verdadeiro";

        // else
        //     resultado = "falso";
        
        System.out.println("O resultado é: " + resultado);
    }
}
