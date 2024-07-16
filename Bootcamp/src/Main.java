import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Paradigma Funcional");
        curso1.setDescricao("Stream API");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Programação imperativa");
        curso2.setDescricao("Collections");
        curso2.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("POO em Java");
        mentoria.setDescricao("Os 4 pilares da POO");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander & DIO");
        bootcamp.setDescricao("Backend com Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Deborah");
        System.out.println("Conteúdos inscritos de" + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de" + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos inscritos de" + dev1.getNome() + ": " + dev1.getConteudosInscritos());

        Dev dev2 = new Dev();
        dev2.setNome("Jonathan");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de" + dev1.getNome() + ": " + dev1.getConteudosInscritos());

        System.out.println("Inscritos no Bootcamp: " + bootcamp.getDevsInscritos());

        System.out.println("XP " + dev1.getNome() + ": " + dev1.calcularTotalXp());
        System.out.println("XP " + dev2.getNome() + ": " + dev2.calcularTotalXp());
    }
}
