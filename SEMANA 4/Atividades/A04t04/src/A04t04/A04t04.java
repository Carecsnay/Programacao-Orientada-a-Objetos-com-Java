package A04t04;

import java.util.Scanner;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A04t04 {

    /*
                                                                                          
Crie um programa com 3 perguntas que devem ser respondidas pelo usuário.Após responder cada pergunta, o sistema deve responder algo ao usuário de formainteligente (com respostas de acordo com um dicionário interno e 3 palavras por pergunta). Por exemplo, se a pergunta é “qual seu prato preferido?”, O sistema deve responder “Eu adoro [...]!”, se a resposta contiver as palavras lasanha, pizza ou churrasco. E “Disso eu não gosto muito!” caso não contenha palavras do dicionário da pergunta.
    
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Máquina: (1/3) Qual o seu prato preferido?");
        System.out.print("Você: ");
        String comidaPreferida = sc.nextLine();

        if (comidaPreferida.equalsIgnoreCase("Arroz")
                || comidaPreferida.equalsIgnoreCase("Feijoada")
                || comidaPreferida.equalsIgnoreCase("Cuscuz")
                || comidaPreferida.equalsIgnoreCase("Pato no Tucupi")
                || comidaPreferida.equalsIgnoreCase("Tacacá")
                || comidaPreferida.equalsIgnoreCase("Baião de Dois")
                || comidaPreferida.equalsIgnoreCase("Arroz com Pequi")
                || comidaPreferida.equalsIgnoreCase("Arroz Carreteiro")) {
            System.out.println("Máquina: Eu adoro " + comidaPreferida + "!");
        } 
        
        else {
            System.out.println("Máquina: hmm, disso eu não gosto muito!");
        }

        System.out.println("Máquina: Muito bem, vamos avançar!");
        System.out.println("Máquina: (2/3) Qual sua cor preferida?");
        System.out.print("Você: ");
        String corPreferida = sc.nextLine();

        if (corPreferida.equalsIgnoreCase("Preta")) {
            System.out.println("Máquina: A cor preta é a minha favorita, você tem bom gosto!");
        } 
        
        else if (corPreferida.equalsIgnoreCase("Preto")) {
            System.out.println("Máquina: Preto é a minha cor favorita, você tem bom gosto!");
        }
        else if (corPreferida.equalsIgnoreCase("Vermelho")) {
            System.out.println("Máquina: Vermelho também é uma cor legal, mas prefiro a cor preta!");
        }
        else {
            System.out.println("Não curto muita essa cor!");
        }

        System.out.println("Máquina: certo, vamos para a ultima pergunta!");
        System.out.println("Máquina: (3/3) Você tem algum animalzinho de estimação?");
        System.out.print("Você: ");
        String animalPreferido = sc.nextLine();
        
        if (animalPreferido.equalsIgnoreCase("Sim")
                || animalPreferido.equalsIgnoreCase("S")
                || animalPreferido.equalsIgnoreCase("Claro")
                || animalPreferido.equalsIgnoreCase("Claro!")
                || animalPreferido.equalsIgnoreCase("Com certeza")
                || animalPreferido.equalsIgnoreCase("Com certeza!")) {
            System.out.println("Máquina: Owwnt, meu criador tem 4 animaizinhos e ele daria tudo por eles s2.");
        }
        
        else {
            System.out.println("Máquina: Experimente a felicidade, você não vai se arrepender! #Adote_um_parceiro(a)!");
        }
    }
}
