package ch03.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eder.crespo
 */
public class Pag113 {
    
    
    public static void main(String[] args) {
        
        
        List<Animale> anim = new ArrayList();
        
        List<Cammel> cam = new ArrayList();
        
        
        
        Swimmable<Animal> s = (ti) -> {
        
        };
        
        s.swim(anim);
        
        
    }

}


interface Swimmable<T> {
    
    void swim(List<? extends T> ti);
}

class Animale {}
class Cammel extends Animale {}
