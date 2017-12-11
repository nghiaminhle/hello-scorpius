package scorpius.hello;

import java.util.List;

import org.joo.scorpius.Bootstrap;
import org.joo.scorpius.support.bootstrap.CompositionBootstrap;
import org.joo.scorpius.support.typesafe.TypeSafeBootstrap;
import org.joo.scorpius.support.vertx.VertxBootstrap;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;

public class MyBootstrap extends CompositionBootstrap {
	protected void configureBootstraps(List<Bootstrap<?>> bootstraps) {
		//bootstraps.add(new TypeSafeBootstrap());
		//bootstraps.add(AbstractBootstrap.from(this::configureMysql));
		//bootstraps.add(AbstractBootstrap.from(this::configureTriggers));
		bootstraps.add(new VertxBootstrap(new VertxOptions(), new HttpServerOptions().setUseAlpn(true), 1912) {
			@Override
			protected Router configureRoutes(final Vertx vertx) {
				Router restAPI = super.configureRoutes(vertx);
				restAPI.get("/").handler(rc -> rc.response().end());
				return restAPI;
			}
		});
	}

	private void configureMysql() {

	}

	private void configureTriggers() {

	}
}