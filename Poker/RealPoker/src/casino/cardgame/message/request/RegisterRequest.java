//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : RegisterRequest.java
//  @ Date : 5/27/2012
//  @ Author : sangdn
//
//



package casino.cardgame.message.request;

import com.smartfoxserver.v2.entities.data.ISFSObject;


public class RegisterRequest extends SFSGameRequest {

    private String _userName;
    private String _password;
    private String _email;
    @Override
    public SFSGameRequest FromSFSObject(ISFSObject isfso) {
        _userName = isfso.getUtfString("user_name");
        _password = isfso.getUtfString("password");
        _email = isfso.getUtfString("email");
        return this;
    }

    @Override
    public String GetRequestName() {
        return GAME_REQUEST_NAME.REGISTER_REQ;
    }

    public String getUserName() {
        return _userName;
    }

    public String getPassword() {
        return _password;
    }

    public String getEmail() {
        return _email;
    }
}