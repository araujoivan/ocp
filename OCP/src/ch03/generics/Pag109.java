package ch03.generics;

/**
 *
 * @author eder.crespo
 */
public class Pag109 {
    
    public static void main(String[] args) {
        
        Animal animal = new Animal("Cow");
        
//        Crate<Animal> crate = new Crate<>();
//        Crate<Animal> crate = new Crate();
//        Crate crate2 = new Crate();
        Crate<Animal> crate = new Crate();
        
        
        crate.setContent(animal);
        
        System.out.println(crate.getContent());
        
        
       // crate.setContent("hello"); compilation error
        
        System.out.println(crate.getContent());
        
        Removable r = s -> s;
        
        System.out.println(r.remove(animal));
    }

}


class Crate<T> {
    
    private T content;
    
    private T[] contents;
    
   // it doesnt compile because a generic type must be linked to the instance
   // private static T other;
    
    // it doesn't compile because before the class instantiation you dont know what T is refer to
    //private T[] contents = new T[3];
    
    public T getContent() {
        return content;
    }
    
    public void setContent(T content) {
        this.content = content;
    }
}

class Animal {
    String name = "";
    
    public Animal(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

interface Removable<T> {
    
    public T remove(T t);
    
}