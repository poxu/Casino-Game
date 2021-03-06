//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : Reponse_GetPlayerCardRequest.java
//  @ Date : 6/7/2012
//  @ Author : sangdn
//
//
package casino.cardgame.message.reponse.game.tala;

import com.smartfoxserver.v2.entities.data.SFSObject;

public class Reponse_GetPlayerCardRequest extends casino.cardgame.message.reponse.SFSGameReponse {

    protected String m_username;
    protected String m_fromUser;
    protected int m_cardId;
    protected Double m_chip;
    protected int m_time;
    
    //khoatd: move card infomation
    private String m_moveFrom;
    private int m_moveCardId;

    public Reponse_GetPlayerCardRequest() {
        super(TALA_REPONSE_NAME.GET_PLAYER_CARD_RES);
    }

    public int getM_cardId() {
        return m_cardId;
    }

    public Double getM_chip() {
        return m_chip;
    }

    public String getM_fromUser() {
        return m_fromUser;
    }

    public int getM_time() {
        return m_time;
    }

    public String getM_username() {
        return m_username;
    }

    public Reponse_GetPlayerCardRequest setM_cardId(int m_cardId) {
        this.m_cardId = m_cardId;
        return this;
    }

    public Reponse_GetPlayerCardRequest setM_chip(Double m_chip) {
        this.m_chip = m_chip;
        return this;
    }

    public Reponse_GetPlayerCardRequest setM_fromUser(String m_fromUser) {
        this.m_fromUser = m_fromUser;
        return this;
    }

    public Reponse_GetPlayerCardRequest setM_time(int m_time) {
        this.m_time = m_time;
        return this;
    }

    public Reponse_GetPlayerCardRequest setM_username(String m_username) {
        this.m_username = m_username;
        return this;
    }

    public SFSObject ToSFSObject() {
        SFSObject obj = new SFSObject();
        obj.putUtfString("user_name", m_username);
        obj.putUtfString("from_user", m_fromUser);
        obj.putInt("card_id", m_cardId);
        obj.putDouble("chip", m_chip);
        obj.putInt("time", m_time);

        if(m_moveFrom != null){
            obj.putUtfString("move_from", getM_moveFrom());
            obj.putInt("move_cardId", getM_moveCardId());
        }
        return obj;
    }

    /**
     * @return the m_moveFrom
     */
    public String getM_moveFrom() {
        return m_moveFrom;
    }

    /**
     * @param m_moveFrom the m_moveFrom to set
     */
    public Reponse_GetPlayerCardRequest setM_moveFrom(String m_moveFrom) {
        this.m_moveFrom = m_moveFrom;
        return this;
    }

    /**
     * @return the m_moveCardId
     */
    public int getM_moveCardId() {
        return m_moveCardId;
    }

    /**
     * @param m_moveCardId the m_moveCardId to set
     */
    public Reponse_GetPlayerCardRequest setM_moveCardId(int m_moveCardId) {
        this.m_moveCardId = m_moveCardId;
        return this;
    }

}
