public class OperadoresLogicos {
    public static void main(String[] args) {
        //Os operadores logicos representam um recurso que cria expressões logicas maiores a partir da junção de duas ou varias expressões.
        
        // && Operador Lógico "E"
        // || Operador Lógico "OU"

        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && (7>4) ){
            System.out.println("As duas condições são verdadeira.");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma duas condições é verdadeira.");
        }


        System.out.println("Fim");

    }
}