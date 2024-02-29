package cgg.virtualthreds;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        // Thread.ofPlatform().start(() -> System.out.println(STR."Platform Thread : \{Thread.currentThread()}"));
        // System.out.println("--------------------------------------");
        // Thread thread = Thread.ofVirtual().start(() -> System.out.println(STR."Virtual Thread : \{Thread.currentThread()} " ));
        // thread.join();

        // var threads = IntStream.range(0, 10).mapToObj(thCount ->
        // Thread.ofVirtual().unstarted(() -> {
        // if (thCount == 0) {
        // System.out.println(Thread.currentThread());
        // }
        // try {
        // Thread.sleep(10);
        // } catch (InterruptedException e) {
        // throw new RuntimeException(e);
        // }
        // if (thCount == 0) {
        // System.out.println(Thread.currentThread());
        // }
        // })).collect(Collectors.toList());
        // threads.forEach(Thread::start);

        // for (Thread thread : threads) {
        // thread.join();
        // }

        // var start = System.currentTimeMillis();
        // var totalThreads = 1000;
        // var threads = IntStream.range(0, totalThreads)
        // .mapToObj(thCount -> Thread.ofVirtual().unstarted(() -> {
        // })).toList();

        // threads.forEach(Thread::start);
        // for (Thread thread : threads) {
        // thread.join();
        // }
        // var end = System.currentTimeMillis();
        // System.out.println("millis used to launch " + totalThreads + " vthreads " +
        // (end - start) + "ms");

        var start = System.currentTimeMillis();
        var totalThreads = 100000;
        var threads = IntStream.range(0, totalThreads)
                .mapToObj(thCount -> Thread.ofPlatform().unstarted(() -> {
                })).toList();

        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            thread.join();
        }
        var end = System.currentTimeMillis();
        System.out.println("millis used to launch " + totalThreads + " platform threads " + (end - start) + "ms");

    }
}
