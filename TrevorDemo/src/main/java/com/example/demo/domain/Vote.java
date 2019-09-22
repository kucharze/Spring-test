package com.example.demo.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
	//Embedded id that contains both user and feature id's as foriegn keys
	@EmbeddedId
	private VoteId pk;
	private boolean upvote;

	public boolean isUpvote() {
		return upvote;
	}

	public void setUpvote(boolean upvote) {
		this.upvote = upvote;
	}
	
	public void setPk(VoteId pk) {
		this.pk=pk;
	}
	
	@EmbeddedId
	public VoteId getPk() {
		return pk;
	}
	
}
