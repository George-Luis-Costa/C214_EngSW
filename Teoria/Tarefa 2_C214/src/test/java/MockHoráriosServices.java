public class MockHoráriosServices implements HoráriosServices {

    @Override
    public String busca(int id) {
        if (id == 1) {
            return HoráriosStatic.João;
        } else if (id == 2) {
            return HoráriosStatic.Francisco;
        } else if (id == 3) {
            return HoráriosStatic.Rafael;
        } else {
            return null;
        }
    }

    @Override
    public boolean vazio(int length) {
        if (length > 0) {
            return false;
        }
        return true;
    }

    public boolean rangeSala(int sala) {
        if (sala > 0 && sala <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean trocarSala(int profSalaCurrentA, int profSalaBeforeA) {

        if (profSalaCurrentA == profSalaBeforeA) {
            return true;
        } else {
            return false;
        }
    }
}



