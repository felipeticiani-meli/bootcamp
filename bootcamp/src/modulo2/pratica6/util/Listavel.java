package modulo2.pratica6.util;

import java.util.ArrayList;

public interface Listavel<T> {
    boolean salvar(T dado);

    boolean remover(int id);

    boolean editar(T dado);

    T consultar(int id);

    ArrayList<T> consultarTodos();
}
