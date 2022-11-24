import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

       Curso curso1 = new Curso();
       curso1.setTitulo("curso java ");
       curso1.setDescricao("descricao curso java");
       curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js ");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);





        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria descricao java");
        mentoria.setData(LocalDate.now());



      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);:*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descriacao bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);


        Dev devLeydia = new Dev();
        devLeydia.setNome("Leydia");
        devLeydia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Leydia:" + devLeydia.getConteudosConcluidos());

        devLeydia.progredir();
        devLeydia.progredir();
        System.out.println(".......");
        System.out.println("Conteudo Inscritos Leydia:" + devLeydia.getConteudosConcluidos());
        System.out.println("Conteudo Concluidos Leydia:" + devLeydia.getConteudosConcluidos());
        System.out.println("XP:" + devLeydia.calcularTotalxp());


        System.out.println(".......");



        Dev devLucio = new Dev();
        devLucio.setNome("Lucio");
        devLucio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Lucio:" + devLucio.getConteudosInscritos());

        devLucio.progredir();
        System.out.println(".......");
        System.out.println("Conteudo Inscritos Lucio:" + devLucio.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Lucio:" + devLucio.getConteudosConcluidos());
        System.out.println("XP:" + devLucio.calcularTotalxp());










    }
}
