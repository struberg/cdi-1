package org.axonframework.cdi.example.wildfly.query;

import java.lang.invoke.MethodHandles;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import org.axonframework.eventhandling.EventHandler;

@ApplicationScoped
public class GenericEventListener {

    private static final Logger logger = Logger.getLogger(
            MethodHandles.lookup().lookupClass().getName());

    @EventHandler
    public void on(Object event) {
        logger.log(Level.INFO, "Event received {0}.", event);
    }
}
