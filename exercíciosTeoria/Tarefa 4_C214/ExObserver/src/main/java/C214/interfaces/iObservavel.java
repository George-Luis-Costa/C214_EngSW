package C214.interfaces;

import C214.impl.Observador;

public interface iObservavel {

    public void adicionarObservador(Observador observador);

    public void removerObservador(Observador observador);

    public void notificarObservadores();

}
