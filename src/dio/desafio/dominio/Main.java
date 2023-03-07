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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);







    }

}

