package corejava;

public class TimingCheckStringBufferAndBuilder {
    public static void main(String[] args) {
        long startTime, endTime;

        //String (Slow)
        startTime = System.nanoTime();
        String str = "A";
        for (int i = 0; i < 10000; i++) {
            str = str + "A";
        }
        endTime = System.nanoTime();
        System.out.println("String Time: " + (endTime - startTime) + " ns");


        //StringBuilder (Fast)
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("A");
        for (int i = 0; i < 10000; i++) {
            sb.append("A");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");


        //StringBuffer (Thread-safe but slower)
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("A");
        for (int i = 0; i < 10000; i++) {
            sbf.append("A");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
    }
}

