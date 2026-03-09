package com.social.post_service.service;
import org.springframework.cache.annotation.Cacheable;
import com.social.post_service.model.Post;
import com.social.post_service.repository.PostRepository;
import com.social.post_service.config.RabbitMQConfig;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository repository;
    private final RabbitTemplate rabbitTemplate;

    public PostService(PostRepository repository, RabbitTemplate rabbitTemplate) {
        this.repository = repository;
        this.rabbitTemplate = rabbitTemplate;
    }

    public Post createPost(Post post) {

        Post savedPost = repository.save(post);

        rabbitTemplate.convertAndSend(
                RabbitMQConfig.QUEUE,
                "New Post Created by " + post.getAuthor()
        );

        return savedPost;
    }
    @Cacheable("posts")
    public List<Post> getAllPosts() {
        return repository.findAll();
    }
    
}