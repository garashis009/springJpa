package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the authors database table.
 * 
 */
//@Entity
//@Table(name="authors")
@NamedQuery(name="Author.findAll", query="SELECT a FROM Author a")
public class Author implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AuthorPK id;

	private Timestamp added;

	@Temporal(TemporalType.DATE)
	private Date birthdate;

	private String email;

	@Column(name="last_name")
	private String lastName;

    //    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.authorId")
    //    @JoinColumn(name = "author_id34567", referencedColumnName = "author_Id")
    //    private List<Post> items;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "author", cascade = CascadeType.REMOVE)
    private List<Post> posts;

	public Author() {
	}

	public AuthorPK getId() {
		return this.id;
	}

	public void setId(final AuthorPK id) {
		this.id = id;
	}

	public Timestamp getAdded() {
		return this.added;
	}

	public void setAdded(final Timestamp added) {
		this.added = added;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(final Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

    /**
     * @return the posts
     */
    public List<Post> getPosts() {
        return posts;
    }

    /**
     * @param posts the posts to set
     */
    public void setPosts(final List<Post> posts) {
        this.posts = posts;
    }

}