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
        Crate<Animal> crate = new Crate<Animal>();
        
        crate.setContent(animal);
        
        System.out.println(crate.getContent());
        
        
       // crate.setContent("hello"); compilation error
        
        System.out.println(crate.getContent());
        
        
    }

}


class Crate<T> {
    
    private T content;
    
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