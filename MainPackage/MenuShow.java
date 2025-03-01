package MainPackage;

public class MenuShow {
    public static void menuShow(){

        while (true) {

            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Show");
            System.out.println("2 - Buscar Show");
            System.out.println("X - VOLTAR");
            System.out.println();
            System.out.print("Digite a sua escolha: ");
            var escolha = lerDados.lerTexto("Opção Inválida").toUpperCase();
            if (escolha.equals("1")) {
                cadstrarShow();
            }

        }
    }
        private static void cadstrarShow() {
            Boolean ingressosDisponiveis = true;

            System.out.println();
            System.out.println("__________Cadasto de Show_________\nNome do Show: ");
            var nome = lerDados.lerTexto(null);

            System.out.println("Data do Show: ");
            var data = lerDados.lerTexto(null);

            System.out.println("Local do Show: ");
            var local = lerDados.lerTexto(null);

            System.out.println("Horario do Show: ");
            var horario = lerDados.lerTexto(null);

            System.out.println("Descrição do Show: ");
            var descricao = lerDados.lerTexto(null);

            System.out.println("Limites de ingressos do Show: ");
            var limiteIngressos = lerDados.lerInt(null);

            System.out.println("Os ingressos estão disponiveis? Sim[S] Não[N]");
            var ingressos = lerDados.lerTexto(null);

            if(ingressos.equals("n")){
               ingressosDisponiveis = false;
            }

            var showcad = new ObjectShow(nome, data, local, horario, descricao, limiteIngressos, ingressosDisponiveis);
            Txt_Show.salvar(showcad);
            System.out.println("Show cadastrado");
        }

}
