
import java.util.*;

public class MultiMap <Key, Value> {
    
    // Atributo privado
    private Map<Key, Collection<Value>> mymap = new HashMap<>();
    
    // Métodos
    
    // Agregar un elemento
    public void put(Key key, Value value) {
        if (mymap.get(key) == null) {
            mymap.put(key, new ArrayList<Value>());
        }
       mymap.get(key).add(value);
    }
    
    // Retorna los valores asociados a una llave
    public Collection<Value> get(Object key) {
        return mymap.get(key);
    }

    // Retorna las llaves del multimapa en un set
    public Set<Key> mykeySet() {
        return mymap.keySet();
    }
    
    // Valida si existe una llave en el multimapa
    public boolean containsKey(Object key) {
        return mymap.containsKey(key);
    }

    // Elimina una llave del multimapa
    public Collection<Value> remove(Object key) {
        return mymap.remove(key);
    }
    
    // Valida si el multimapa está vacío
    public boolean isEmpty() {
        return mymap.isEmpty();
    }
    
    // Vacia el multimapa
    public void clear() {
        mymap.clear();
    }

    // Remueve una entrada de la colección
    public void remove(Key key, Value value) {
        if (mymap.get(key) != null)
            mymap.get(key).remove(value);
    }

    // Reemplaza una entrada
    public void replace(Key key, Value oldValue, Value newValue) {
        if (mymap.get(key) != null) {
            if (mymap.get(key).remove(oldValue)) {
                mymap.get(key).add(newValue);
            }
        }
    }
} 
