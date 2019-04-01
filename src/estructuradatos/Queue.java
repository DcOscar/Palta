package estructuradatos;

import java.util.*;

/**
 *
 * @author Oscar
 */
public class Queue {

    private ArrayList<Object> lista;

    public Queue() {
        this.lista = new ArrayList<Object>();
    }

    public Object add(Object objeto) {
        this.lista.add(objeto);
        return objeto;

    }

    public Object peek() {
        if (this.lista.size() != 0) {
            return this.lista.get(0);
        } else {
            throw new NoSuchElementException();
        }
    }

    public Object remove() {
        if (this.lista.size() != 0) {
            Object objeto = this.lista.get(0);
            this.lista.remove(0);
            return objeto;
        } else {
            throw new NoSuchElementException();
        }
    }

}
