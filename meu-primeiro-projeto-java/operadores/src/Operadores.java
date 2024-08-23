public class Operadores {
    public static void main(String[] args) throws Exception {
        
        //contatenação de palavras usando operadores. 
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        //E como ficaria ao usar numeros com letras para contatenação?
        //No exemplo abaixo mostra alguns valores.

        String contatenacao = "?";

        contatenacao = 1+1+1+"1";
        System.out.println(contatenacao);

        contatenacao = 1+"1"+1+1;
        System.out.println(contatenacao);

        contatenacao = 1+"1"+1+"1";
        System.out.println(contatenacao);

        contatenacao = "1"+1+1+1;
        System.out.println(contatenacao);

        contatenacao = "1"+(1+1+1);
        System.out.println(contatenacao);

        
        
    }
}
