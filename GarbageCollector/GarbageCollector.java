
package GarbageCollector;
public class GarbageCollector {
    public static void main(String[] args) {
        GarbageCollector obj = new GarbageCollector();
        obj =  null;
        System.gc();
        GarbageCollector ob1 = new GarbageCollector();
        obj = ob1;
        Runtime.getRuntime().gc();
    }
}
