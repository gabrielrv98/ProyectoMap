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
public interface InterfaceMap<V,K> {
    public int size();
	// produce: numero de cosas en su interior
    public boolean isEmpty();
            // produce: true si esta vacio 

    public V get(K key); 
            //produce: el valor V asociado a k si existe. O null si no 

    public boolean put(K key,V value);
            //modifica this
            //produce: true si añade la pareja k,v. False si existe k previamente

    public void forcePut(K key,V value);
            //modifica this
            //produce: añade/sobreescribe la pareja k,v

    public V remove(K key);
            //modifica this
            //produce: elimina la pareja k,v y devuelve el valor V

    public Iterator<K> allKeys();
            //produce:un objeto Iterator que contiene todas las claves

    public Iterator<V> allValues();
            //produce: un objeto Iterator que contiene todas los valores

    public void clear();
            //modifica this
            //produce: elimina todas las parejas

    public String toString();
            //produce: Todas las claves y valores
}
