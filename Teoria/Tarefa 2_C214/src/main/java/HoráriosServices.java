public interface HoráriosServices {
    String busca(int id);

    boolean vazio(int length);

    boolean rangeSala(int sala);

    boolean trocarSala(int profA, int profB);
}

