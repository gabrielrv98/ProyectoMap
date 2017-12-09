/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aedii;
import java.util.*;

/**
 *
 * @author reyga
 */
public class Map<K,V>  implements InterfaceMap<V,K>{
    HashMap<K,V> hash;
    
    
    
    public Map(){
        hash= new HashMap<>();
    }
    @Override
    public int size() {
        return hash.size();
    }

    @Override
    public boolean isEmpty() {
        return hash.isEmpty();
    }

    @Override
    public V get(K key) {
        return hash.get(key);
    }

    @Override
    public boolean put(K key, V value) {
        if (hash.containsKey(key)) {
            return false;
        }else
            hash.put(key, value);
        return true;
    }

    @Override
    public void forcePut(K key, V value) {
        hash.put(key, value);
    }

    @Override
    public V remove(K key) {
       return hash.remove(key);
    }
    
    
    //No acabado
    @Override
    public Iterator<K> allKeys() {
        System.err.println("No conseguido.");
      return null;
    }

    @Override
    public Iterator<V> allValues() {
       return hash.values().iterator();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //no acabado
   public String toString(){
       System.err.println("Not supported yet");
       return null;
   }
    
}
