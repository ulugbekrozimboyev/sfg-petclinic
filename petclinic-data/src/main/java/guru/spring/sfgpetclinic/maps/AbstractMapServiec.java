package guru.spring.sfgpetclinic.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapServiec<T, K> {

    protected Map<K, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<T>(map.values());
    }

    T findById(K id){
        return map.get(id);
    }

    T save(K id, T object){
        map.put(id, object);

        return object;
    }

    void deleteById(K id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entity -> entity.equals(object));
    }
}
