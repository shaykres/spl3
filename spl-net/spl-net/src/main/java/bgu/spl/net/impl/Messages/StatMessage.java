package bgu.spl.net.impl.Messages;

import java.util.List;

public class StatMessage extends Message {
    public StatMessage(List<Object> arglist) {
        super(arglist);
    }

    @Override
    public Message process(int conID) {
        return null;
    }
}
