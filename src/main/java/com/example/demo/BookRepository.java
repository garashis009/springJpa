package com.example.demo;

import com.example.demo.entity.Author;

import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepository //extends CrudRepository<Author, AuthorPK>
{

    Optional<Author> findByIdAuthorId(int id);

    @Query(value = "SELECT a.* FROM authors a inner join posts p on a.author_id=p.author_id WHERE a.author_Id = :id", nativeQuery = true)
    List<Author> findAllActiveUsers(int id);

}
