package bgu.spl.net.impl.Messages;

import bgu.spl.net.impl.User;

import javax.print.DocFlavor;
import java.util.LinkedList;
import java.util.List;

public class RegisterMessage extends Message {

    private String userName;
    private String password;
    private String birthday;

    public RegisterMessage(List<Object> argList) {
        super(argList);
        opCode=1;
        userName=(String)argList.get(0);
        password=(String)argList.get(1);
        birthday=(String)argList.get(2);
    }

    @Override
    public Message process(int conID) {
        User user=new User(userName,password,birthday);
        boolean success=networkSystemData.RegisterClient(userName,user,conID);
        if(success)
            return new AckMessage(new LinkedList<>());
        return new ErrorMessage();
    }
}
