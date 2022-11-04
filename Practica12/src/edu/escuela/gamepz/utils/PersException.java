package edu.escuela.gamepz.utils;
public class PersException extends Exception{
	private char msg;
	private int poss;
	public PersException(char msg, int poss){
		this.msg = msg;
		this.poss = poss;
	}
	public int getPoss(){
		return poss;
	}
}