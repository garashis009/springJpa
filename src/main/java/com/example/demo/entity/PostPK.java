package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the posts database table.
 * 
 */
@Embeddable
public class PostPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
    @Column(name = "post_Id")
    private int postId;

    @Column(name = "author_id")
    private int authorId;

	public PostPK() {
	}
	public int getPost_Id() {
        return this.postId;
	}
	public void setPost_Id(final int post_Id) {
        this.postId = post_Id;
	}
	public int getAuthorId() {
		return this.authorId;
	}
	public void setAuthorId(final int authorId) {
		this.authorId = authorId;
	}

	@Override
    public boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PostPK)) {
			return false;
		}
		final PostPK castOther = (PostPK)other;
		return 
        (this.postId == castOther.postId)
			&& (this.authorId == castOther.authorId);
	}

	@Override
    public int hashCode() {
		final int prime = 31;
		int hash = 17;
        hash = hash * prime + this.postId;
		hash = hash * prime + this.authorId;
		
		return hash;
	}
}