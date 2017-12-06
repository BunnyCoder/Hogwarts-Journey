
package hogwartsjourney;

import java.util.Scanner;

/**
 * @author Alberto Figuerêdo, Ariane Sales, Anna Carollina
 * 
 * Este é o jogo de RPG chamado Hogwarts Journey
 */
public class HogwartsJourney {
    public static void main(String[] args) throws InterruptedException {
        Scanner hp = new Scanner(System.in);
        System.out.println("    Bem-vindo ao Hogwarts Journey!");
        System.out.println("    Que a magia esteja com você!");
        Thread.sleep(3500);
        byte g;
        boolean jogar = true;
        String tstJogar;
        do{
            for (g = 0; g < 12; g++) {
                System.out.println("");
            }
            for(g=0;g<3;g++){
            Thread.sleep(750);
            System.out.print(". . ");
            }
            System.out.println("\nVocê é uma criança órfã, vive em um orfanato com 3 irmãos..");
            Thread.sleep(500);
            System.out.println("Qual o seu nome?");
            String nameJog;
            do{ 
            //Validação para o nome: não pode estar vazio nem ser menor que 3
            nameJog = hp.nextLine();
            }while(nameJog.equals("") || nameJog.length()<3);
            String sexJog;
            do{ // Validação para o sexo: precisa ser Masculino ou Feminino, e se não for pede para inserir denovo
                // Detalhe: tanto faz se a pessoa escrever maiúsculo ou minúsculo, o programa transforma tudo em
                // minúsculo, fica mais fácil de fazer a programação mais pra frente desse jeito.
                System.out.println("Qual o seu sexo? <Masculino/Feminino>");
                sexJog = hp.nextLine();
                sexJog = sexJog.toLowerCase();
                if(!sexJog.equals("masculino") && !sexJog.equals("feminino"))
                    System.out.println("Escolha uma das opções oferecidas.");
            }while(!sexJog.equals("masculino") && !sexJog.equals("feminino"));
            Thread.sleep(2000);
            for (g = 0; g < 10; g++) {
                System.out.println("");
            }
            System.out.println(nameJog + "!! Onde está você?! - Grita preocupadíssima dona Emília, coordenadora do orfanato.");
            Thread.sleep(2000);
            if(sexJog.equals("feminino"))
                System.out.println("Você estava escondida, com medo de seus irmãos de criação");
            else if(sexJog.equals("masculino"))
                System.out.println("Você estava escondido, com medo de seus irmãos de criação");
            Thread.sleep(1500);
            System.out.println("Eles te encontram, mas por algum motivo, você reaparece no telhado do orfanato.");
            Thread.sleep(1000);
            System.out.println("Qual a sua reação? \nA) Uau.. \n B) Ufa. Aaahhh!? \n C) AH! Pelo menos a vista é bonita \n D) Eu.. posso fazer isso?");
            // esquema para o jogo: 4 opções de ação, cada uma com característica de cada casa
            // ver o total de perguntas do desenvolvimento, if (contador da casa > 50% total) = defina a casa
            
            
            
            
            
            
            
            
            
            
            System.out.println("Deseja jogar novamente? <Sim/Não>");
            do{
            tstJogar = hp.nextLine();
            tstJogar = tstJogar.toLowerCase();
            if(!tstJogar.equals("não"))
                System.out.println("Digite um valor válido!");
            }while(!tstJogar.equals("não"));
            if(tstJogar.equals("não"))
                jogar = false;
        }while(jogar);
        System.out.println("Foi bom jogar com você!");
    }
    
}
