package MedidorAlcoolico;

public class MedidorAlcoolico {

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        String m = "masculino";
        String f = "feminino";
        String jejumSM = "sim";
        String jejumSF = "sim";
        String jejumN = "nao";
        double indice = 0;
        double graduacao = 0;
        double qtd = 0;
        double peso = 0;
        int idade = 0;
        double densidadedeAlcool = 0.8;
        String Cerveja = "cerveja";
        String Vinho = "vinho";
        String Champanhe = "champanhe";
        String Vodka = "vodka";
        String Rum = "rum";
        String Gim = "gim";
        String Cachaca = "cachaca";
        String Absinto = "absinto";

        System.out.print("Informe seu nome: ");
        String nome = teclado.next();
        System.out.print("Informe sua idade: ");
        idade = teclado.nextInt();
                if (idade < 18) {
            System.out.println("Voce nao pode beber!");
            teclado.close();
        } else {
        System.out.print("Informe seu peso: ");
        peso = teclado.nextDouble();
        System.out.print("Informe seu sexo: ");
        String sexo = teclado.next();
        System.out.print("Voce esta de jejum: ");
        String jejum = teclado.next();
        System.out.print("Informe qual bebida voce consumiu: ");
        String bebida = teclado.next();
        System.out.print("Informe qual a quantidade de bebida que voce consumiu (em ml): ");
        qtd = teclado.nextDouble();
        
        if (peso >= 37.8) {
            if (sexo.equals(m)) {
                if (jejum.equals(jejumSM)) {
                    indice = 0.7;
                    if (bebida.equals(Cerveja)) {
                        graduacao = 0.04;
                    }
                    if (bebida.equals(Vinho)) {
                        graduacao = 0.12;
                    }
                    if (bebida.equals(Champanhe)) {
                        graduacao = 0.14;
                    }
                    if (bebida.equals(Vodka)) {
                        graduacao = 0.30;
                    }
                    if (bebida.equals(Rum)) {
                        graduacao = 0.40;
                    }
                    if (bebida.equals(Gim)) {
                        graduacao = 0.42;
                    }
                    if (bebida.equals(Cachaca)) {
                        graduacao = 0.45;
                    }
                    if (bebida.equals(Absinto)) {
                        graduacao = 0.52;
                    }
                }

                if (jejum.equals(jejumN)) {
                    indice = 1.1;
                    if (bebida.equals(Cerveja)) {
                        graduacao = 0.04;
                    }
                    if (bebida.equals(Vinho)) {
                        graduacao = 0.12;
                    }
                    if (bebida.equals(Champanhe)) {
                        graduacao = 0.14;
                    }
                    if (bebida.equals(Vodka)) {
                        graduacao = 0.30;
                    }
                    if (bebida.equals(Rum)) {
                        graduacao = 0.40;
                    }
                    if (bebida.equals(Gim)) {
                        graduacao = 0.42;
                    }
                    if (bebida.equals(Cachaca)) {
                        graduacao = 0.45;
                    }
                    if (bebida.equals(Absinto)) {
                        graduacao = 0.52;
                    }
                }

            }
            
            if (sexo.equals(f)) {
                if (jejum.equals(jejumSF)) {
                    indice = 0.6;
                    if (bebida.equals(Cerveja)) {
                        graduacao = 0.04;
                    }
                    if (bebida.equals(Vinho)) {
                        graduacao = 0.12;
                    }
                    if (bebida.equals(Champanhe)) {
                        graduacao = 0.14;
                    }
                    if (bebida.equals(Vodka)) {
                        graduacao = 0.30;
                    }
                    if (bebida.equals(Rum)) {
                        graduacao = 0.40;
                    }
                    if (bebida.equals(Gim)) {
                        graduacao = 0.42;
                    }
                    if (bebida.equals(Cachaca)) {
                        graduacao = 0.45;
                    }
                    if (bebida.equals(Absinto)) {
                        graduacao = 0.52;
                    }
                }
                if (jejum.equals(jejumN)) {
                    indice = 1.1;
                    if (bebida.equals(Cerveja)) {
                        graduacao = 0.04;
                    }
                    if (bebida.equals(Vinho)) {
                        graduacao = 0.12;
                    }
                    if (bebida.equals(Champanhe)) {
                        graduacao = 0.14;
                    }
                    if (bebida.equals(Vodka)) {
                        graduacao = 0.30;
                    }
                    if (bebida.equals(Rum)) {
                        graduacao = 0.40;
                    }
                    if (bebida.equals(Gim)) {
                        graduacao = 0.42;
                    }
                    if (bebida.equals(Cachaca)) {
                        graduacao = 0.45;
                    }
                    if (bebida.equals(Absinto)) {
                        graduacao = 0.52;
                    }
                }
            }
        }
        double volumeAlcool = qtd * graduacao;
        double taxa = volumeAlcool * densidadedeAlcool;
        double alcoolSangue = taxa / peso * indice;
        System.out.printf("Seu nivel de alcool no sangue eh: %.2f%n", alcoolSangue);
        
        if ((alcoolSangue >= 0.1) && (alcoolSangue <= 0.5)) {
            System.out.println("Senhor(a) "+nome+" voce esta em estado subclinico, se voce continuar a beber assim regularmente, em dez anos tera: danos ao figado,\n"
                    + "risco aumentado de doencas cardiovasculares, risco de dependencia, alteracoes cognitivas e neurodegenerativas, disturbios do sono, problemas gastrointestinais,\n"
                    + "aumento do risco de cancer, impactos na saude mental, alteracoes hormonais, interacoes medicamentosas.");
        }
        if ((alcoolSangue > 0.5) && (alcoolSangue <= 1.2)) {
            System.out.println("Senhor(a) "+nome+" voce esta em euforia, se voce continuar a beber assim regularmente, em dez anos tera: danos cronicos ao figado,\n"
                    + "risco elevado de doencas cardiovasculares, desenvolvimento de dependencia, declinio cognitivo, disturbios cronicos do sono, problemas gastrointestinais\n"
                    + "persistentes, aumento significativo do risco de cancer, impactos profundos na saude mental, desregulacao hormonal, interacoes prejudiciais com medicamentos.");
        }
        if ((alcoolSangue > 1.2) && (alcoolSangue <= 2.5)) {
            System.out.println("Senhor(a) "+nome+" voce esta em estado de excitacao, se voce continuar a beber assim regularmente, em dez anos tera: problemas digestivos \n"
                    + "continuos, risco elevado de varios tipos de cancer, comprometimento cognitivo a longo prazo, disturbios do sono cronicos, alteracoes hormonais,\n"
                    + "maior probabilidade de dependencia, danos progressivos ao figado, interacoes negativas com medicamentos, risco aumentado de hipertensao e doencas cardiacas, \n"
                    + "problemas de saude mental.");
        }
        if ((alcoolSangue > 2.5) && (alcoolSangue <= 3)) {
            System.out.println("Senhor(a) "+nome+" voce esta em estado de confusao, se voce continuar a beber assim regularmente, em dez anos tera: aumento extremo do risco de doenças cardiovasculares,\n"
                    + "problemas gastrointestinais cronicos, comprometimento cognitivo significativo, aumento do risco de acidentes e lesoes, danos severos ao figado,\n"
                    + "disturbios do sono persistentes, risco elevado de dependencia e abuso de alcool, aumento do risco de varios tipos de cancer, problemas cronicos de saude mental,\n"
                    + "desregulacao severa hormonal.");
        }
        if ((alcoolSangue > 3) && (alcoolSangue <= 4)) {
            System.out.println("Senhor(a) "+nome+" voce esta em estado de estupor, se voce continuar a beber assim regularmente, em dez anos tera: problemas gastrointestinais severos, \n"
                    + "comprometimento cognitivo profundo, doenças mentais crônicas como depressao e ansiedade, danos irreversiveis ao figado, alto risco de acidentes e lesoes fatais,\n"
                    + "desregulacao hormonal grave, desenvolvimento de alcoolismo severo, disturbios significativos do sono, problemas graves de saude cardiovascular, aumento do risco de cancer.");
        }
        if ((alcoolSangue > 4) && (alcoolSangue <= 4.5)) {
            System.out.println("Senhor(a) "+nome+" voce esta em coma, se voce continuar a beber assim regularmente, em dez anos tera: problemas respiratorios cronicos,\n"
                    + "aumento do risco de infeccoes graves, danos permanentes ao figado, desenvolvimento de doencas mentais graves, comprometimento cognitivo severo,\n"
                    + "paralisia ou dificuldades motoras, dano cerebral irreversivel, complicacoes cardiacas, disturbios hormonais severos, morte cerebral ou coma irreversivel.");
        }
        if (alcoolSangue > 4.5) {
            System.out.println("Senhor(a) "+nome+" voce ira morrer");
        }
    }
    }
}
