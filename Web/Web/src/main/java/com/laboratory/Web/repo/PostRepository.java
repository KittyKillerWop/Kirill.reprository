package com.laboratory.Web.repo;

import com.laboratory.Web.models.Post;
import com.laboratory.Web.models.User;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findAllByTitle(String filter);

}
