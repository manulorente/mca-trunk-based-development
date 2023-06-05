package es.urjc.code.daw.library.toggle;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;

public enum Features implements Feature{
    
    @Label("Lines breaker")
    LINE_BREAKER,

    @Label("Notifications by event")
    NOTIFICATIONS_BY_EVENT

}