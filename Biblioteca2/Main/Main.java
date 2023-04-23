package br.edu.fescfafic.biblioteca.Main;

import br.edu.fescfafic.biblioteca.Model.*;
import java.time.LocalDate;


class Main {

    public static void main(String[] args) {

        Impresso impresso1 = new Impresso(
                "Livro",
                "001",
                "Diego Gadelha",
                "2018",
                true,
                "3º",
                "Romance",
                "Aventuras de Diego",
                "357"
        );

        Impresso impresso2 = new Impresso(
                "Livro",
                "002",
                "Dawyla Maria",
                "2019",
                false,
                "1º",
                "Romance",
                "Aventuras de Dawyla",
                "360"
        );

        Impresso impresso3 = new Impresso(
                "Revista",
                "003",
                "Aryelle",
                "2022",
                true,
                "17º",
                "Moda",
                "Aryelle em Paris",
                "30"
        );

        Impresso impresso4 = new Impresso(
                "Livro",
                "004",
                "Luís",
                "2021",
                false,
                "7º",
                "Suspense",
                "Aventuras de Luís",
                "177"
        );
        ObraVisual quadroPintado = new ObraVisual(
                "Quadro",
                "005",
                "Aryelle",
                "2017",
                false,
                true
        );

        ObraVisual escultura = new ObraVisual(
                "Escultura",
                "006",
                "Diego Aleijadinho",
                "2019",
                false,
                true
        );

        Acervo teste = new Acervo(
               "qualquer",
               "7277",
                "Aryeee",
                "2020", false);

        teste.adicionarAoAcervo(teste);
        quadroPintado.adicionarAoAcervo(quadroPintado);
        escultura.adicionarAoAcervo(escultura);
        impresso1.adicionarAoAcervo(impresso1);
        impresso2.adicionarAoAcervo(impresso2);
        impresso3.adicionarAoAcervo(impresso3);
        impresso4.adicionarAoAcervo(impresso4);

        Contato contato = new Contato("8383237243", "hsus@jxdjdn.com");
        Endereco endereco = new Endereco("qualquer", "qualquer", "qualquer", "qualquer", "633000");
        DadosPessoais dadosPessoais = new DadosPessoais("Aryelly", LocalDate.of(2022, 10, 10),
                "feminino",
                "Ary",
                "1234",
                "56789");

        Atendente atendente1 = new Atendente(LocalDate.of(2022, 10, 10), contato, endereco, dadosPessoais);

        Contato contato2 = new Contato("5415", "jeff@auhaua.com");
        Endereco endereco2 = new Endereco("fjdvn", "quanjcalquer", "quxjabjalquer", "qualqnscjnuer", "633000");
        DadosPessoais dadosPessoais2 = new DadosPessoais("Jeff", LocalDate.of(2010, 02, 20),
                "masculino",
                "Bob",
                "726",
                "3847");

        Leitor leitor1 = new Leitor(LocalDate.of(2010, 02, 20), contato2, endereco2, dadosPessoais2);

        Emprestimo emprestimo = new Emprestimo(
                LocalDate.of(2023, 3, 9),
                LocalDate.of(2023, 3, 18),
                leitor1
        );

        emprestimo.adicionarObra(impresso4);
        double multa = emprestimo.devolucao(impresso4);

        if (multa > 0) {
            System.out.printf("Voce precisa pagar: R$ %.2f", multa);
        }
    }
}
