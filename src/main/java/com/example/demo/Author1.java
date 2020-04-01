package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Entity
@Table(name = "authors")
//@NamedQuery(name="Author.findAll", query="SELECT a FROM Author a")
public class Author1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    private int id;

	private Timestamp added;

	@Temporal(TemporalType.DATE)
	private Date birthdate;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private List<Post1> items;

	public Author1() {
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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

    /**
     * @return the items
     */
    public List<Post1> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(final List<Post1> items) {
        this.items = items;
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