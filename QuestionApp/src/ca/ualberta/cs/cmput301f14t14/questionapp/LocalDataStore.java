package ca.ualberta.cs.cmput301f14t14.questionapp;

import java.util.ArrayList;

import android.accounts.AccountManager;
import ca.ualberta.cs.cmput301f14t14.questionapp.model.Answer;
import ca.ualberta.cs.cmput301f14t14.questionapp.model.Comment;
import ca.ualberta.cs.cmput301f14t14.questionapp.model.Question;

public class LocalDataStore {
	private String username;
	
	public void setUsername(String accountName){
		this.username = accountName;
	}
	public String getUsername(){
		return this.username;
	}
	
	public void putQuestion(Question mQuestion) {
		// TODO Auto-generated method stub
		
	}

	public void putAnswer(Answer mAnswer) {
		// TODO Auto-generated method stub
		
	}

	public void putComment(Comment mComment) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<String> getAccountUsernames() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
