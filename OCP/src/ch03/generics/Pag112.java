package ch03.generics;

/**
 *
 * @author eder.crespo
 */
public class Pag112 {
    
    public static void main(String[] args) {
        
    }

}

interface Shippable<T> {
    
    void ship(T ...t);
}

class ShippablePage implements Shippable<Pag112> {

    @Override
    public void ship(Pag112 ...t) {
        
    }
}

class ShippableAbstract7 extends ShippableAbstract4 {

    @Override
    public void ship(Object... t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}

class ShippableAbstract6 extends ShippableAbstract5 {

    @Override
    public void ship(Object... t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

abstract class ShippableAbstract5 implements Shippable {}

abstract class ShippableAbstract4<T> implements Shippable {}

class ShippableAbstract3<T,M> implements Shippable<T> {

    @Override
    public void ship(T ...t) {
       
    }
}

class ShippableAbstract8 extends ShippableAbstract2<String, Integer> {
    
    void callShip(){
        ship("AQUI DEVE IR UMA STRING");
    }
    
}

class ShippableAbstract2<T,M> implements Shippable<T> {

    @Override
    public void ship(T ...t) {
       
    }
}

class ShippableAbstract1 implements Shippable {

    @Override
    public void ship(Object ...t) {
       
    }
}

class ShippableAbstract0 implements Shippable<String> {

    @Override
    public void ship(String... t) {
        
    }

}