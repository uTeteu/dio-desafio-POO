import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso("Curso JAVA", "Descrição do curso JAVA", 40);

        Curso curso2 = new Curso("Curso JS", "Descrição do curso JS", 4);

        Mentoria mentoria = new Mentoria("Mentoria de JAVA", "Descrição mentoria JAVA", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA developer");
        bootcamp.setDescricao("Descrição Bootcamp JAVA developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Camila - Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Camila - Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Camila - Conteúdos concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());

        System.out.println("================");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("João - Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("João - Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("João - Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());

    }
}
