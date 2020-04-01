package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the posts database table.
 * 
 */
@Entity
@Table(name = "posts")
//@NamedQuery(name="Post.findAll", query="SELECT p FROM Post p")
public class Post1 implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    private int id;

	@Column(name="author_id")
	private int authorId;

	@Lob
	private String content;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String description;

	private String title;

    public Post1() {
	}

	public int getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(final int authorId) {
		this.authorId = authorId;
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final int id) {
        this.id = id;
    }
}