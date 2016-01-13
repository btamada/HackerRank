import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by Bryan Tamada on 1/8/16.
 */
public class SingletonExample {

    public static void main(String[] args) {
        Singleton mySingleton = Singleton.getInstance();
    }

}

class Singleton {
    private static Singleton myInstance;
    private Singleton() {}
    public static Singleton getInstance() {
        if(myInstance == null) {
            synchronized (Singleton.class) {
                if(myInstance == null) {
                    myInstance = new Singleton();
                }
            }
        }
        return myInstance;
    }
}
