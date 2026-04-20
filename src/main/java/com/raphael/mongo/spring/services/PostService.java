package com.raphael.mongo.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.mongo.spring.domain.Post;
import com.raphael.mongo.spring.repository.PostRepository;
import com.raphael.mongo.spring.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		if (!post.isPresent()) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return post.get();
	}
	
	public List<Post> findAll() {
		return repo.findAll();
	}
	
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
				//findByTitleContainingIgnoreCase(text);
	}
	
	
}
