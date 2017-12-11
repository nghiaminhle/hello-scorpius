package scorpius.hello;

import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;

public class MyController implements Handler<RoutingContext> {
	@Override
	public void handle(RoutingContext event) {
		HttpServerResponse response = event.response();
        response.putHeader("Content-Type", "html/text");
        response.end("hello scorpius");
	}
}
