
package hogwartsjourney;

import java.util.Scanner;

/**
 * @author Alberto Figuerêdo, Ariane Sales, Anna Carollina
 * 
 * Este é o jogo de RPG chamado Hogwarts Journey
 */
class Escolhas{
     void oferece() {
         System.out.println("Como você agiria? \n"
                   + "A) Agiria com coragem\n" 
                   + "B) Agiria com arrogância\n"
                   + "C) Agiria com inteligência\n"
                   + "D) Agiria com bom humor");
    }
}

public class HogwartsJourney {
    public static void main(String[] args) throws InterruptedException {
        Escolhas opcao = new Escolhas();
        Scanner hp = new Scanner(System.in);
        
            //              xxxxxxx INTRODUÇÃO DO JOGO xxxxxxx  
        
        System.out.println("    Bem-vindo ao Hogwarts Journey!\n");
        System.out.println("    O jogo permitirá que os jogadores passem pela experiência anterior à Hogwarts, ou seja, a vida de trouxa. \n    Ao decorrer do jogo, será avaliado as escolhas e atitudes do usuário, as quais, no final, serão levadas em consideração pelo chapéu seletor, para, finalmente, decidir em qual casa o jogodar pertencerá.\n");
        System.out.println("Regras do jogo:\n • Procure escrever na forma culta padrão\n • Escolha somente uma das opções dadas no enunciado\n ");
        System.out.println("    Que a magia esteja com você!");
        opcao.oferece();
        Thread.sleep(7000);
        byte g;
        boolean jogar = true;
        String tstJogar;
        do{
            for (g = 0; g < 12; g++) {
                System.out.println("");
            }
            for(g=0;g<3;g++){
            Thread.sleep(750);
            System.out.print(". . . ");
            }
            
            //    xxxxxxx INTRODUÇÃO DA HISTÓRIA / CADASTRO DO JOGADOR xxxxxxx
            
            System.out.println("\nSeus pais, misteriosamente, sumiram quando você tinha 5 anos, e desde então você é uma criança órfã que vive \nem um orfanato com 3 irmãos..");
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
            
            //          xxxxxxx TESTE LÓGICO xxxxxxx
            
            System.out.println("No orfanato, você, constantemente, sofre ataques de outros meninos. E por isso, você estava pensando em como poderia\nreagir caso essa situação volte a ocorrer.\n");
            opcao.oferece();
            String resp = hp.nextLine();
            resp = resp.toUpperCase();
            
            //              xxxxxxx SITUAÇÃO 1 xxxxxxx
            
            System.out.println(nameJog + "!! Onde está você?! - Grita preocupadíssima dona Emília, coordenadora do orfanato.");
            Thread.sleep(2000);
            if(sexJog.equals("feminino"))
                System.out.println("Você estava escondida, com medo de seus irmãos de criação");
            else if(sexJog.equals("masculino"))
                System.out.println("Você estava escondido, com medo de seus irmãos de criação, de repente eles te encontram, o que você faz?");
            Thread.sleep(1500);
            System.out.println("A) Você vai pra cima deles! \n"
                    + "B) 'Afastem-se de mim, pebleus!'\n"
                    + "C)'CARAMBA! UM GRIFO!!' - Sai correndo \n"
                    + "D) 'Gente, vocês viram o que o tio Harry fez ontem??'");
            
            Thread.sleep(1500);
            if(resp.equals("A"))
                System.out.println("Você vai pra cima deles e soca um deles, mas os outros 2 te imobilizam.. e o terceiro volta para te machucar.");
            
            else if(resp.equals("B"))
                System.out.println("Eles ficaram com raiva.. e confusos, você também mora com eles! Mesmo assim, você não escapa da surra,\n mas não ficou nenhuma marca muito visível. Você volta pra casa, mas Dona Emília não percebe nada diferente.");
            else if(resp.equals("C"))
                System.out.println("Eles caíram como um patinho, e você consegue escapar! Você encontra Dona Emília e se salva, por hoje..");
            else if(resp.equals("D"))
                System.out.println("Eles respondem: 'Não, o quê?'\nVocê: 'Pergunta pra tia Emília!' - e corre até ela.");
            
            System.out.println("");
            
            
            
            
            
            
            
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