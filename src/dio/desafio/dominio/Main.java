package dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desafio POO");
        curso1.setCargaHoraria(10);

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Desafio JS");
        curso2.setCargaHoraria(5);

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Vire um Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devPedro.getConteudoInscritos());
        System.out.println("Conteudos Concluidos " + devPedro.getConteudoConcluidos());
        System.out.println("XP do Usuario " + devPedro.calcularTotalXp());
        devPedro.progredir();
        System.out.println("=========================");
        System.out.println("Conteudos Inscritos " + devPedro.getConteudoInscritos());
        System.out.println("Conteudos Concluidos " + devPedro.getConteudoConcluidos());
        System.out.println("XP do Usuario " + devPedro.calcularTotalXp());

        System.out.println("=========================");
        System.out.println("=========================");

        Dev devRoger = new Dev();
        devRoger.setNome("Roger");
        devRoger.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devRoger.getConteudoInscritos());
        System.out.println("Conteudos Concluidos " + devRoger.getConteudoConcluidos());
        System.out.println("XP do Usuario " + devRoger.calcularTotalXp());
         devRoger.progredir();
         devRoger.progredir();
         devRoger.progredir();

        System.out.println("=========================");
        System.out.println("Conteudos Inscritos " + devRoger.getConteudoInscritos());
        System.out.println("Conteudos Concluidos " + devRoger.getConteudoConcluidos());
        System.out.println("XP do Usuario " + devRoger.calcularTotalXp());






    }

}
