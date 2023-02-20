import java.time.LocalDateTime;

import br.com.dio.desafio.dominio.Aluno;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Professor;
 
public class Main {
    public static void main(String[] args) {
    	//Criando professores
    	Professor prof1 = new Professor("Maria", "maria@email.com");
    	prof1.getStack().add("Java");
    	prof1.getStack().add("Javascript");
    	
    	Professor prof2 = new Professor("joão", "joao@email.com");
    	prof2.getStack().add("Javascript");
    	prof2.getStack().add("HTML");
    	prof2.getStack().add("CSS");
    	
    	//Criando cursos
        Curso curso1 = new Curso("Os principios de POO com Java", "Aprenda a programar com Java e POO.", 40);
        curso1.setProfessor(prof1);

        Curso curso2 = new Curso("Javascript para iniciante", "Aprenda a programar em Javascript.", 24);
        curso2.setProfessor(prof2);
        
        Curso curso3 = new Curso("HTML e CSS básico", "Aprenda HTML e CSS básico.", 16);
        curso3.setProfessor(prof2);
        
        //Criando Mentorias
        LocalDateTime horario = LocalDateTime.of(2023, 02, 23, 19, 0);
        
        Mentoria mentoria = new Mentoria("Boas práticas com Java", "O que o mercado busca de um dev Java?", horario);
        mentoria.setProfessor(prof1);
        
        //Criando bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Comece a desenvolver aplicações com stack Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);
        
        //Criando alunos
        Aluno devCamila = new Aluno("Camila", "camila@email.com");
        devCamila.setPro(true);
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Certificados de Camila:" + devCamila.getCertificados());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Aluno devJoao = new Aluno("Joao", "joaoAluno@email.com");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Certificados de João:" + devJoao.getCertificados());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        
    }

}
