import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Genivaldo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Genivaldo" + dev1.getConteudosInscritos());
        System.out.println("-");
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos Genivaldo" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Genivaldo" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("============");

        Dev dev2 = new Dev();
        dev2.setNome("Antônio");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Antônio" + dev2.getConteudosInscritos());
        System.out.println("-");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Inscritos Antônio" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Antônio" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
