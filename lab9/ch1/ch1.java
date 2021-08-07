package lab9.ch1;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

public class ch1 {
    public static Flux<String> emptyFlux(){
        return Flux.empty();
    }

    public static Flux<String> fooBarFlux(){
        return Flux.just("Foo", "Bar");
    }

    public static Flux<String> fooBarFluxFromList() {
        return Flux.fromIterable(Arrays.asList("Foo", "Bar"));
    }

    public static Flux<String> errorFlux() {
        return Flux.error(IllegalStateException::new);
    }

    public static Flux<Long> counter() {
        return Flux.interval(Duration.ofMillis(100)).take(10);
    }

    public static void main(String[] args) {
        emptyFlux().subscribe(System.out::println);
        fooBarFlux().subscribe(System.out::println);
        fooBarFluxFromList().subscribe(System.out::println);
        errorFlux().subscribe(System.out::println);
    }
}
