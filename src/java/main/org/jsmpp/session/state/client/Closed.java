package org.jsmpp.session.state.client;

import org.jsmpp.session.ClientSession;
import org.jsmpp.session.state.Mode;

/**
 * This class is closed state implementation of {@link Mode}. This session
 * state on SMPP specification context, implemented on since version 5.0, but we
 * can also use this.
 * 
 * @author uudashr
 * @version 1.0
 * @since 2.0
 * 
 */
public class Closed extends ClientSessionState {

    public Closed(ClientSession session) {
        super(session);
    }

    public Mode getMode() {
        return Mode.CLOSED;
    }

}
