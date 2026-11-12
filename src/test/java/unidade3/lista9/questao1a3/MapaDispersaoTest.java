package unidade3.lista9.questao1a3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MapaDispersaoTest {

     @Test
     public void q3teste1() {
         MapaDispersao<Aluno> mapa = new MapaDispersao(53);
         Aluno obj1 = new Aluno(12000,"Jean",LocalDate.of(2000,01,01));
         mapa.inserir(obj1.getMatricula(),obj1);

         Aluno obj2 = new Aluno(14000,"Pedro",LocalDate.of(1999,01,20));
         mapa.inserir(obj2.getMatricula(),obj2);

         Aluno obj3 = new Aluno(12500,"Marta",LocalDate.of(2001,02,18));
         mapa.inserir(obj3.getMatricula(),obj3);

         Aluno obj4 = new Aluno(13000,"Lucas",LocalDate.of(1998,11,25));
         mapa.inserir(obj4.getMatricula(),obj4);

         assertEquals(12000,mapa.buscar(12000).getMatricula());
         assertEquals(14000,mapa.buscar(14000).getMatricula());
         assertEquals(12500,mapa.buscar(12500).getMatricula());
         assertEquals(13000,mapa.buscar(13000).getMatricula());
     }

     @Test
    public void q3teste2() {
        MapaDispersao<Aluno> mapa = new MapaDispersao(53);
        Aluno obj1 = new Aluno(12000,"Jean",LocalDate.of(2000,01,01));
        mapa.inserir(obj1.getMatricula(),obj1);

        Aluno obj2 = new Aluno(14000,"Pedro",LocalDate.of(1999,01,20));
        mapa.inserir(obj2.getMatricula(),obj2);

        Aluno obj3 = new Aluno(14226,"Marta",LocalDate.of(2001,02,18));
        mapa.inserir(obj3.getMatricula(),obj3);

        Aluno obj4 = new Aluno(17180,"Lucas",LocalDate.of(1998,11,25));
        mapa.inserir(obj4.getMatricula(),obj4);

        assertEquals(12000,mapa.buscar(12000).getMatricula());
        assertEquals(14000,mapa.buscar(14000).getMatricula());
        assertEquals(14226,mapa.buscar(14226).getMatricula());
        assertEquals(17180,mapa.buscar(17180).getMatricula());
    }
}