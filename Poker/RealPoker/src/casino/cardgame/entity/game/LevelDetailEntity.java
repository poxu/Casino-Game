//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : UserInfo.java
//  @ Date : 5/27/2012
//  @ Author : sangdn
//
//



package casino.cardgame.entity.game;

import com.smartfoxserver.v2.entities.variables.SFSUserVariable;
import com.smartfoxserver.v2.entities.variables.UserVariable;
import hirondelle.date4j.DateTime;
import java.util.ArrayList;
import java.util.List;


public class LevelDetailEntity {
    private int _id;
    private int _levelType;
    private int _level;
    private Double _smallBlind;
    private Double _bigBlind;
    private Double _ante;
    private int _timeLife;

    public LevelDetailEntity(){}
    public LevelDetailEntity(int id, int levelType, int level, Double smallBlind, Double bigBlind
            , Double ante, int timeLife){
                    _id = id;
                    _levelType = levelType;
                    _level = level;
                    _smallBlind = smallBlind;
                    _bigBlind = bigBlind;
                    _ante = ante;
                    _timeLife = timeLife;
    }

    public Double getSmallBlind() {
        return _smallBlind;
    }

    public void setSmallBlind(Double smallBlind) {
        this._smallBlind = smallBlind;
    }

    public Double getBigBlind() {
        return _bigBlind;
    }

    public void setBigBlind(Double bigBlind) {
        this._bigBlind = bigBlind;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public int getLevelType() {
        return _levelType;
    }

    public void setLevelType(int levelType) {
        this._levelType = levelType;
    }

    public int getLevel() {
        return _level;
    }

    public void setLevel(int level) {
        this._level = level;
    }

    public Double getAnte() {
        return _ante;
    }

    public void setAnte(Double ante) {
        this._ante = ante;
    }

    public int getTimeLife() {
        return _timeLife;
    }

    public void setTimeLife(int timeLife) {
        this._timeLife = timeLife;
    }


}
