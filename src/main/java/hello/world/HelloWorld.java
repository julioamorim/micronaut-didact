package hello.world;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

import static io.micronaut.http.MediaType.TEXT_PLAIN;

@Client("/hello")
public interface HelloWorld {

    @Get(consumes = TEXT_PLAIN)
    Single<String> hello();

}
