package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the authors database table.
 * 
 */
@Embeddable
public class AuthorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
    @Column(name = "author_Id")
    private int authorId;

	@Column(name="first_name")
	private String firstName;

	public AuthorPK() {
	}

    public int getAuthorId() {
        return this.authorId;
	}

    public void setAuthorId(final int author_Id) {
        this.authorId = author_Id;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	@Override
    public boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AuthorPK)) {
			return false;
		}
		final AuthorPK castOther = (AuthorPK)other;
		return 
        (this.authorId == castOther.authorId)
			&& this.firstName.equals(castOther.firstName);
	}

	@Override
    public int hashCode() {
		final int prime = 31;
		int hash = 17;
        hash = hash * prime + this.authorId;
		hash = hash * prime + this.firstName.hashCode();
		
		return hash;
	}
}