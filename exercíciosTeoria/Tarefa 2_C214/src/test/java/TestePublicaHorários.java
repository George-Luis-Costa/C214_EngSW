import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class TestePublicaHorários {
    HoráriosServices service;
    PublicaHorários publicaHorários;

    @Before
    public void setup() {
        //Contexto
        service = new MockHoráriosServices();
        publicaHorários = new PublicaHorários(service);
    }

    @Test
    public void testePublicaHoráriosJoao() {
        //Processamento
        HoráriosPOJO joao = publicaHorários.publicaHorários(1);

        //Assertiva
        assertEquals("João", joao.getNomeDoProfessor());
        assertEquals("15:30", joao.getHorarioDeAtendimento());
        assertEquals("Integral", joao.getPeriodo());
        assertEquals(5, joao.getSala());
    }

    @Test
    public void testeModificarHorárioJoao() {
        HoráriosPOJO joao = publicaHorários.publicaHorários(1);
        joao.setHorarioDeAtendimento("13:30");

        assertEquals("13:30", joao.getHorarioDeAtendimento());
    }

    @Test
    public void testeStringContent() {
        HoráriosPOJO joao = publicaHorários.publicaHorários(1);
        joao.setHorarioDeAtendimento("15:30");
        boolean checkEmpty = publicaHorários.vazio(joao.getHorarioDeAtendimento().length());

        assertFalse(checkEmpty);
    }

    @Test
    public void testeReatribuirSala() {
        HoráriosPOJO rafael = publicaHorários.publicaHorários(3);
        rafael.setSala(7);
        boolean checkEmpty = publicaHorários.vazio(rafael.getSala());

        assertFalse(checkEmpty);
    }

    @Test
    public void testeRangeSalaNegativa() {
        HoráriosPOJO francisco = publicaHorários.publicaHorários(2);
        int salaCurrent = francisco.getSala() - 10;
        boolean checkSalas = publicaHorários.verificaSala(salaCurrent);

        assertFalse(checkSalas);
    }

    @Test
    public void testeStringVazio() {
        HoráriosPOJO joao = publicaHorários.publicaHorários(1);
        joao.setHorarioDeAtendimento("");
        boolean checkEmpty = publicaHorários.vazio(joao.getHorarioDeAtendimento().length());

        assertTrue(checkEmpty);
    }

    @Test
    public void testeRangeSala() {
        HoráriosPOJO francisco = publicaHorários.publicaHorários(2);
        boolean checkSalas = publicaHorários.verificaSala(francisco.getSala());

        assertTrue(checkSalas);
    }

    @Test
    public void testeRangeSalaAddRemove() {
        HoráriosPOJO francisco = publicaHorários.publicaHorários(2);
        HoráriosPOJO joao = publicaHorários.publicaHorários(1);
        int salaJoao = joao.getSala();
        int salaFrancisco = francisco.getSala();

        joao.setSala(salaFrancisco);
        francisco.setSala(salaJoao);

        boolean checkSalas = publicaHorários.trocaSala(joao.getSala(), salaFrancisco);

        assertTrue(checkSalas);
    }

}
