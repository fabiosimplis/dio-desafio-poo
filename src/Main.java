import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devC = new Dev();
        devC.setNome("Camila");
        System.out.println("Nome do Dev: " + devC.getNome());
        devC.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devC.getConteudosInscritos());
        System.out.println(" - ");
        devC.progredir();
        devC.progredir();
        System.out.println("Conteúdos inscritos: " + devC.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devC.getConteudosConcluidos());
        System.out.println("XP: " + devC.calcularTotalXp());
        System.out.println(" ------- ");
        Dev devJ = new Dev();
        devJ.setNome("João");
        devJ.inscreverBootcamp(bootcamp);
        System.out.println("Nome do Dev: " + devJ.getNome());
        System.out.println("Conteúdos inscritos: " + devJ.getConteudosInscritos());
        System.out.println(" - ");
        devJ.progredir();
        System.out.println("Conteúdos inscritos: " + devJ.getConteudosInscritos());
        System.out.println("Conteúdos conluidos: " + devJ.getConteudosConcluidos());
        System.out.println("XP: " + devJ.calcularTotalXp());


    }
}