package com.social.post_service.controller;

import com.social.post_service.model.Post;
import com.social.post_service.service.PostService;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @PostMapping
    public Post createPost(@RequestBody Post post, Authentication authentication) {

        String username = authentication.getName();
        post.setAuthor(username);

        return postRepository.save(post);
    }

    @GetMapping
    public List<Post> getPosts() {
        return postRepository.findAll();
    }
}