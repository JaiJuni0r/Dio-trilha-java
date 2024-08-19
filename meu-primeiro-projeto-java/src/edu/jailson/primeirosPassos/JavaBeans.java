package edu.jailson.primeirosPassos;

public class JavaBeans {
    public static void main(String[] args) {
        //O que são Java beans? 
        //É uma estruturação de escrita, forma que expressa variaveis, metodos, dentre outros, dando melhor sentido ou legibilidade ao codigo. Ajudando o time ou até a si mesmo.

        //Escrita sem uma boa convenção

        double salMedio = 1500.23; 
        //Por mais que não esteja errado a forma que foi descrita a variavel, o uso de abreviação pode dificultar a identificação clara de determinada variavel.

        String emails = "aluno@escola.com"; 
        //Ao usar pluralidade ou singularidade, é importante ter a certeza se será realmente aplicada. Como no exemplo, a variavel "emails" está puxando apenas um email como dado.

        String myName = "JOSEPH"; 
        //Todo o codigo está sendo usado em PT-Br, ao ficar trocando a linguagem dele duranto a codificação, pode começar a aparecer problematicas.

        //Escrita com uma boa convenção- Java Beans

        //Forma correta de apresentar os dados acima
        double salarioMedio = 1500.23; 
        
        String email = "aluno@escola.com";

        String [] emailsEscola = {"aluno@escola.com", "professor@escola.com"}; 

        String meuNome = "JOSEPH"; 

        //Metodos

        //Os metodos, segundo o modelo Java Beans, deve ser nomeados como verbos, misturando letras minusculas e maiusculas. Todas as letras da palavra deve está em minusculo, com excessão da primeira palavra composta a partir da segunda palavra.

        // somar (int n1, int n2) {}
        // abrirConexao() {}
        // concluirProcessamento() {}

        // findById (int id) {} - Pode acontecer de haver metodos em inglês, mesmo implementando codigo em português. Mas, isso acontece devido a bibliotecas.

        // calcularImprimir () {} - Metodo errado. Ele deveria ter uma finalidade especifica.
        
        System.out.println(salMedio);
        System.out.println(salarioMedio);
        System.out.println(myName);
        System.out.println(meuNome);
        System.out.println(emailsEscola);
        System.out.println(email);
        System.out.println(emails);
    }

    

    
}
