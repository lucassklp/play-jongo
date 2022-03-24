package io.github.lucassklp.playjongo;

import play.api.Configuration;
import play.api.Environment;
import play.api.inject.Binding;
import play.api.inject.Module;
import scala.collection.Seq;

/**
 * Play 2.6 Module implementation.
 */
public class JongoModule extends Module {

    @Override
    public Seq<Binding<?>> bindings(Environment environment, Configuration configuration) {
        return seq(bind(PlayJongo.class).toSelf());
    }
}
