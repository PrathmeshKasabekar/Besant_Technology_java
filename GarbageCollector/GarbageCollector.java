public class GarbageCollector {
    public static void main(StringSession[] args) {
        GarbageCollector obj = new GarbageCollector();
        obj =  null;
        System.gc();
        GarbageCollector ob1 = new GarbageCollector();
        obj = ob1;
        Runtime.getRuntime().gc();
    }
}
