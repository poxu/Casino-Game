//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : IChatController.java
//  @ Date : 5/27/2012
//  @ Author : sangdn
//
//



package casino.cardgame.controller.user;

import casino.cardgame.message.event.SFSGameEvent;


public interface IChatController {
	public void HandlePrivateMessage(SFSGameEvent sfse) ;
	
	public void HandlePublicMessage(SFSGameEvent sfse) ;
}