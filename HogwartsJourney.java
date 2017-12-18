
package hogwartsjourney;

import java.util.Scanner;

/**
 * @author Alberto Figuerêdo, Ariane Sales, Anna Carollina
 * 
 * Este é o jogo de RPG chamado Hogwarts Journey
 */
class Organiza{
     void oferece() {
         System.out.println("Como você agiria? \n"
                   + "A) Agiria com coragem\n" 
                   + "B) Agiria com arrogância\n"
                   + "C) Agiria com inteligência\n"
                   + "D) Agiria com bom humor");
    }
    
    void limpatela() {	 
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
 }
}

public class HogwartsJourney {
    public static void main(String[] args) throws InterruptedException {
        
        byte casasHog[] = new byte[4];
        String nomesCasas[] = {"Grifinória","Sonserina","Corvinal","Lufa-lufa"};
        
        Organiza opcao = new Organiza();
        Scanner hp = new Scanner(System.in);
        
            //              xxxxxxx INTRODUÇÃO DO JOGO xxxxxxx
        
        System.out.println("    Bem-vindo ao Hogwarts Journey!\n");
        System.out.println("    O jogo permitirá que os jogadores passem pela experiência anterior à Hogwarts, ou seja, a vida de trouxa. \n    Ao decorrer do jogo, será avaliado as escolhas e atitudes do usuário, as quais, no final, serão levadas em consideração pelo chapéu seletor, para, finalmente, decidir em qual casa o jogodar pertencerá.\n");
        System.out.println("Regras do jogo:\n • Procure escrever na forma culta padrão\n • Escolha somente uma das opções dadas no enunciado\n ");
        System.out.println("    Que a magia esteja com você!");
        Thread.sleep(7000);
        byte g;
        boolean jogar = true;
        String tstJogar;
        do{
            opcao.limpatela();
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
            String altResp;
            
            //          xxxxxxx TESTE LÓGICO xxxxxxx
            
            System.out.println("No orfanato, você, constantemente, sofre ataques de outros meninos. E por isso, você estava pensando em como poderia\nreagir caso essa situação volte a ocorrer.\n");
            opcao.oferece(); // Chamada da função de opções
            String resp;
            do{
                resp = hp.nextLine().toUpperCase();
                if(!resp.equals("A") && !resp.equals("B") && !resp.equals("C") && !resp.equals("D"))
                    System.out.println("Escolha uma das opções! <A/B/C/D>");
            }while(!resp.equals("A") && !resp.equals("B") && !resp.equals("C") && !resp.equals("D"));
            opcao.limpatela();
            //              xxxxxxx SITUAÇÃO 1 xxxxxxx
            
            System.out.println(nameJog + "!! Onde está você?! - Grita preocupadíssima dona Emília, coordenadora do orfanato.");
            Thread.sleep(2000);
            if(sexJog.equals("feminino"))
                System.out.println("Você estava escondida, com medo de seus irmãos de criação, de repente eles te encontram!");
            else if(sexJog.equals("masculino"))
                System.out.println("Você estava escondido, com medo de seus irmãos de criação, de repente eles te encontram!");
            Thread.sleep(1500);
           
            Thread.sleep(1500);
            switch (resp) {
                case "A":
                    System.out.println("Você vai pra cima deles e soca um deles, mas os outros 2 te imobilizam.. e o terceiro volta para te machucar.\n");
                    casasHog[0]++;
                    break;
                case "B":
                    System.out.println(nameJog +": 'Afastem-se de mim, plebeus!' \nEles ficaram com raiva.. e confusos, você também mora com eles! Mesmo assim, você não escapa da surra,\n mas não ficou nenhuma marca muito visível. Você volta pra casa, mas Dona Emília não percebe nada diferente.\n");
                    casasHog[1]++;
                    break;
                case "C":
                    System.out.println(nameJog + ": 'CARAMBA! OLHA O BUZZ LIGHTEAR!' - sai correndo \nEles caíram como um patinho, e você consegue escapar! Você encontra Dona Emília e se salva, por hoje..\n");
                    casasHog[2]++;
                    break;
                case "D":
                    System.out.println(nameJog + ": Vocês viram o que o tio Harry fez ontem? \nEles respondem: 'Não, o quê?'\nVocê: 'Pergunta pra tia Emília!' - e corre até ela.\n");
                    casasHog[3]++;
                    break;
            }
            Thread.sleep(5000);
            opcao.limpatela();
            // Continuação Masculino / Feminino
            
            if(sexJog.equals("masculino"))
            System.out.println("A tarde passou, e chegou a hora do jantar. "+ nameJog +" estava sentado em uma grande mesa sozinho com o professor Sérgio. \nSérgio: 'Como está a sua adaptação no orfanato?'");
            else if(sexJog.equals("feminino"))
                System.out.println("A tarde passou, e chegou a hora do jantar. "+ nameJog +" estava sentada em uma grande mesa sozinho com o professor Sérgio. \nSérgio: 'Como está a sua adaptação no orfanato?'");
                
            System.out.println("A) Está indo bem! "
                           + "\nB) Não está nada bem..");
            
            // Validação pra ter certeza que o usuário
            // vai digitar A ou B
            
            do{
            resp = hp.nextLine().toUpperCase();
            if(!resp.equals("A") && !resp.equals("B"))
                System.out.println("Sei que você está brincando, mas leve o jogo a sério! A ou B!");
            }while(!resp.equals("A") && !resp.equals("B"));
            
            if(resp.equals("A")){
                System.out.println("Sérgio: 'Ah! Fico contente que esteja fazendo amigos, isso é muito bom para o seu desempenho.'");
                casasHog[1]++;
                casasHog[2]++;
            // Se for essa, ignorar o próximo else if e o que
            // estiver dentro dele
                Thread.sleep(1000);
            }
            
            
            // Primeira ramificação na história
            
            else if(resp.equals("B")){
                System.out.println("Sérgio: 'Como assim?! Por que você está com essa sensação ruim? Tem algo acontecendo que queira me falar?' "
                        + "\nA) Sim! Eu não aguento mais.. "
                        + "\nB) Não, não é nada..");
                casasHog[0]++;
                casasHog[3]++;
                altResp = hp.nextLine().toUpperCase();
                
                // Segunda ramificação
                if(altResp.equals("A")){
                    casasHog[0]++;
                    casasHog[3]++;
                    System.out.println("Você: 'Os meus irmãos estão me tratando de uma forma diferente, parece que não consigo mais me adaptar às brincadeiras \ndeles, as vezes me sinto..' "
                            + "\nA) ..com vontade de socar todos"
                            + "\nB) ..impotente perto deles" 
                            + "\nC) ..preso, limitado à eles"
                            + "\nD) ..como se não pudesse ajudá-los a melhorar\n");
                    String inResp = hp.nextLine().toUpperCase();
                    /*  ATENÇÃO AQUI!!! TA FALTANDO COISAAAAA  */
                    switch (inResp) {
                        case "A":
                            casasHog[0]++;
                            System.out.println("Sérgio: 'Bem, você não deve deixar que a violência suba a sua cabeça, se acontecer denovo, chame dona Emília o mais rápido possível!'");
                            break;
                        case "B":
                            casasHog[1]++;
                            System.out.println("Sérgio: 'LIÇÃO DE VIDA SOBRE PODER'");
                            break;
                        case "C":
                            casasHog[2]++;
                            System.out.println("Sérgio: 'Seu espírito não depende do que eles dizem, " + nameJog + ". Seu espírito é livre!");
                            break;
                        case "D":
                            System.out.println("AAAAAAAAAAAAAAAAAAAAAA");
                            casasHog[3]++;
                            break;
                        default:
                            System.out.println("erro404! resp não enontrada");
                            break;
                    }
                    
                }
                else if(altResp.equals("B")){
                    System.out.println("Sérgio: 'Tudo bem então, caso precise de mim estarei  na sala dos professores.'");
                casasHog[1]++;
                casasHog[2]++;    
                }
            }
            
           // Nessa parte, o código retoma a pergunta 'Tem algo
           //acontecendo que queira me falar?', caso a resposta
           //seja 'A', ou seja, não, ele executa esses comandos.
           //Para que não houvesse conflito de variáveis 'resp',
           //já que também tem decisões na ramificação 'B', 
           //tem uma variável 'altResp', que aparecerá em  
           //decisões dentro de ramificações.
            if(resp.equals("A")){
                System.out.println("Sérgio: 'Tudo bem então, caso precise de mim estarei na sala dos professores.'");
                if(sexJog.equals("masculino"))
                    System.out.println("Você: 'Tudo bem, obrigado, até!'\n");
                else if(sexJog.equals("feminino"))
                    System.out.println("Você: 'Tudo bem, obrigada, até!'\n");
            }
            
            System.out.println("No final das contas, o chateamento continuou e nada foi feito..");
            Thread.sleep(5000);
            opcao.limpatela();
            System.out.println("Num outro dia, está acontecendo denovo. \nVocê está encurralado num corredor sem saída, desesperado. Antes de aceitar a surra, você fecha os olhos esperando o que iria acontecer \nem seguida, e quando os abre.. Você está no telhado do orfanato. \n");
            Thread.sleep(2000);
            System.out.println("Como você reage?\n"
                             + "A) Sente-se aliviado, assim, não faria uma besteira. \n" +
                               "B) Fica zangado(a), pois queria partir pra cima dos garotos. \n" +
                               "C) Esquece dos meninos e só pensa: eu me teletransportei!!\n" +
                               "D) Não liga para o que houve, só sente-se aliviado por ter saído de mais uma enrascada\n");
            resp = hp.nextLine().toUpperCase();
            switch (resp) {
                        case "A":
                            casasHog[0]++;
                            
                            break;
                        case "B":
                            casasHog[1]++;
                            
                            break;
                        case "C":
                            casasHog[2]++;
                            
                            break;
                        case "D":
                            casasHog[3]++;
                            break;
                        default:
                            System.out.println("Erro404! Not found");
                            break;
                    }
            System.out.println("No telhado, você olha ao redor e vê uma janela acima dos telhados, o que você faz? \n"
                    + "A) Pula do telhado \n"
                    + "B) Entra no orfanato pela janela");
            do{
            resp = hp.nextLine().toUpperCase();
            if(!resp.equals("A") && !resp.equals("B"))
                System.out.println("Sei que você está brincando, mas leve o jogo a sério! A ou B!");
            }while(!resp.equals("A") && !resp.equals("B"));
            
            if(resp.equals("B")){
                System.out.println("Após esse acontecimento estranho, vários outros aconteceram.");
                opcao.limpatela();
                System.out.println("Algum tempo depois, no seu 11º aniversário, você recebe uma visita um tanto quanto peculiar. \n"
                        + "Dona Emília: '" + nameJog + "!! Você tem visita!' "
                        + "\nÉ um homem alto, magro, com cabelos longos e brancos e barba com as mesmas características.\n");
                Thread.sleep(750);
                System.out.println("Dona Emília sai de sala e ele pergunta: 'Recentemente, aconteceram coisas estranhas com você? Coisas que você não consegue explicar ou contar para os outros?'\n");
                Thread.sleep(1000);
                System.out.println("A) Sim, várias, senhor!\n"
                                 + "B) Na verdade, não..");
                resp = hp.nextLine().toUpperCase();
                if(resp.equals("B"))
                    casasHog[1]++;
                System.out.println("Bem, acontece que você é um bruxo. Seus pais também eram, mas morreram heróicamente numa batalha no mundo bruxo, por isso você mora aqui.\n");
                System.out.println(
                          "A) Uau!! Eles eram fortes?\n"
                        + "B) Quem eles eram? Quais eram seus nomes?\n"
                        + "C) Em batalha? Gostaria que tivesse acontecido enquanto dormiam, acredito que traria paz ao espírito deles.\n"
                        + "D) Gostaria de tê-los visto");
                
                do{
                resp = hp.nextLine().toUpperCase();
                if(!resp.equals("A") && !resp.equals("B") && !resp.equals("C") && !resp.equals("D"))
                    System.out.println("Escolha uma das opções! <A/B/C/D>");
            }while(!resp.equals("A") && !resp.equals("B") && !resp.equals("C") && !resp.equals("D"));
                Thread.sleep(1000);
                switch (resp){
                        case "A":
                            casasHog[0]++;
                            System.out.println("Sim, e além disso, modestos.");
                            break;
                        case "B":
                            casasHog[1]++;
                            if(sexJog.equals("masculino"))
                                System.out.println("Você descobrirá com o tempo, meu jovem..");
                            else if(sexJog.equals("feminino"))
                                System.out.println("Você descobrirá com o tempo, minha jovem..");
                            break;
                        case "C":
                            casasHog[2]++;
                            System.out.println("Sim.. eles eram nobres bruxos, mereciam uma morte tranquila. Infelizmente, não aconteceu..");
                            break;
                        case "D":
                            casasHog[3]++;
                            break;
                        
                    }
                Thread.sleep(3000);
                System.out.println("\nHomem grisalho: 'Porém, vim lhe visitar hoje para lhe convidar para a Escola de Magia e Bruxaria de Hogwarts.' \nPara você, foi um choque, mas se sentiu feliz ao saber que passaria apenas as férias no orfanato, e após iria morar na escola.."
                        + "\nO homem, que se apresentou como Dumbledore, diz que vocês precisam comprar os materiais para a escola, e ele o acompanhará a um lugar chamado Beco Diagonal, onde irão encontrar tudo.\n"
                        + "Após passar por lá e comprar os materiais, tudo custeado por ele, no dia 1 de Setembro você, com todo o seu material e uma coruja, passa pela plataforma 9 3/4 no metrô de Londres e ingressa para a escola no Expresso de Hogwarts.\n\n");
                Thread.sleep(10000);
                System.out.println("No Expresso de Hogwarts, você estava muito nervoso (a), mas por sorte, encontrou uma pessoa com quem conversar. \n"
                        + "'Olá, meu nome é Gustavo Guanabara, qual o seu?'\n"
                        + "Você: 'Meu nome é" + nameJog + "'\n"
                        + "Gustavo: 'Para qual casa você quer ir?'\n"
                        + "Você: na verdade, não conheço muito sobre as casas, pois nasci trouxa.\n"
                        + "Gustavo: (muito animado) 'Posso te contar um pouco sobre elas, se quiser!' \n"
                        + "Você: claro!\n");
                Thread.sleep(10000);
                System.out.println("Gustavo: 'Antes de tudo, quem decide para  que casa você vai, é o chapéu seletor. \n"
                        + "Ele é colocado na sua  cabeça, lê sua mente e diz para que casa vai. \n"
                        + "A grifinória é a casa dos correios, desbravadores; Corvinal é a casa dos inteligentes e criativos; \nSonserina abriga os astutos, ambiciosos, fazem qualquer coisa para conseguirem o que querem; \nLufa-lufa abriga os que trabalham muito, os pacientes de mente e amigos leais.\n");
                
                Thread.sleep(3000);
                System.out.println("E aí, sabe para qual casa quer ir agora?");
                System.out.print("Você: Hm");
                for(g=0;g<3;g++){
                    System.out.print(". ");
                    Thread.sleep(500);
                }
                System.out.println("\nVocê (lembrando de suas atitudes anteriores): Eu realmente não sei, mas de qualquer forma é o chapéu que escolhe.\n"
                        + "Gustavo: Bem, já ouvi boato de que o chapéu leva sua opinião em consideração. Se for assim, qual casa você escolheria?\n"
                        + "A) Grifinória\n "
                        + "B) Sonserina\n"
                        + "C) Corvinal\n"
                        + "D) Lufa-Lufa\n");
                do{
                resp = hp.nextLine().toUpperCase();
                if(!resp.equals("A") && !resp.equals("B") && !resp.equals("C") && !resp.equals("D"))
                    System.out.println("Escolha uma das opções! <A/B/C/D>");
                }while(!resp.equals("A") && !resp.equals("B") && !resp.equals("C") && !resp.equals("D"));
                
                switch (resp) {
                        case "A":
                            casasHog[0]++;
                            
                            break;
                        case "B":
                            casasHog[1]++;
                            
                            break;
                        case "C":
                            casasHog[2]++;
                            
                            break;
                        case "D":
                            casasHog[3]++;
                            break;
                        
                    }
                
                Thread.sleep(3000);
                System.out.println("Chegando em Hogwarts, todos os primeiranistas estavam muito nervosos para a seleção.\n "
                        + "Chegaram ao castelo e foram para o salão principal; todos muito excitados com a grandiosidade do lugar;\n "
                        + "um banquinho estava posto em frente à mesa dos professores, juntamente com um chapéu de bruxo esfarrapado.\n"
                        + " A Professora McGonagall foi chamando um por um para que a seleção fosse feita.\n"
                        + " Colocava o chapéu na cabeça dos estudantes e o mesmo dizia para qual casa o aluno iria.\n"
                        + "Finalmente, chegou sua vez; ");
                Thread.sleep(3000);
                System.out.println("O chapéu foi colocado e sua cabeça, você estava muito nervoso quando o chapéu disse:\n"
                        +"Chapéu: hmmmm, interessante, então você é nascido trouxa? Ah mas isto não é problema para mim, que tudo sei.\n"
                        +"Porém é difícil, vou precisar procurar mais coisas na sua casa. \n" +
                        "(Silêncio) \n" +
                        "Bem, acho que tomei uma decisão.");
                byte casaResult =0;
                for(byte chapeu=0;chapeu<4;chapeu++){
                    if(casasHog[chapeu]>casaResult)
                        casaResult = chapeu;
                }
                System.out.println(nomesCasas[casaResult]+"!!");
                
                
                
                
            } // Fim alternativa B - telhado (Continuação da História)
            
            
            else if(resp.equals("A")){
                System.out.println("Você morreu com a queda!");
                break;
            }
            
            
            
            
            
            
            
            
            
            
            
            System.out.println("Deseja jogar novamente? <Sim/Não>");
            do{
            tstJogar = hp.nextLine();
            tstJogar = tstJogar.toLowerCase();
            if(!tstJogar.equals("não") && !tstJogar.equals("sim"))
                System.out.println("Digite um valor válido!");
            }while(!tstJogar.equals("não") && !tstJogar.equals("sim"));
            if(tstJogar.equals("não"))
                jogar = false;
        }while(jogar);
        System.out.println("Foi bom jogar com você!");
    }
    
}