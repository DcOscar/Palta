package estructuradatos;

import java.util.*;

/**
 *
 * @author Oscar
 */
public class Stack {

    private ArrayList<Object> lista;

    public Stack() {
        this.lista = new ArrayList<Object>();
    }

    public Object push(Object objeto) {
        this.lista.add(objeto);
        return objeto;

    }

    public Object pop() {
        if (this.lista.size() != 0) {
            Object objeto = this.lista.size() - 1;
            this.lista.remove(this.lista.size() - 1);
            return objeto;
        } else {
            throw new EmptyStackException();
        }

    }

    public Object peek() {
        if (this.lista.size() != 0) {
            return this.lista.get(this.lista.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    public int search(Object objeto) {
        if (this.lista.size() != 0) {
            for (int posicion = 0; posicion < this.lista.size(); posicion++) {
                if (this.lista.get(posicion).equals(objeto)) {
                    return this.lista.size() - posicion + 1;
                }
            }
        } else {
            throw new EmptyStackException();
        }
        return -1;

    }

}
