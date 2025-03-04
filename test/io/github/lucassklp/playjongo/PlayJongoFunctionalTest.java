package io.github.lucassklp.playjongo;

import org.junit.*;
import play.test.WithApplication;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Functional tests, with a running fake app.
 */
public class PlayJongoFunctionalTest extends WithApplication {

    private static final int PORT = 3333;

    @Test
    public void testInjection() throws Exception {
        PlayJongo jongo = app.injector().instanceOf(PlayJongo.class);
        assertThat(jongo).isNotNull();
    }


}
