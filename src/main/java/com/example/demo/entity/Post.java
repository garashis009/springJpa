package com.example.demo.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the posts database table.
 * 
 */
//@Entity
//@Table(name="posts")
@NamedQuery(name="Post.findAll", query="SELECT p FROM Post p")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PostPK id;

	@Lob
	private String content;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String description;

	private String title;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "author_Id", referencedColumnName = "author_Id", insertable = false, updatable = false), @JoinColumn(name = "first_name", referencedColumnName = "first_name", insertable = false, updatable = false)
    })
    //    @JsonIgnore
    private Author author;

	public Post() {
	}

	public PostPK getId() {
		return this.id;
	}

	public void setId(final PostPK id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
}