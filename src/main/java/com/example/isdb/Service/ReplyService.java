package com.example.isdb.Service;


import com.example.isdb.Repository.ThreadRepository;
import com.example.isdb.model.Post;
import com.example.isdb.model.Replies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {

    @Autowired
    private ThreadRepository tRepo;

    public Long getPostId(Post p){
        return p.getId();
    }

//    public void addPostId(Long postId, Long replyId){
//        System.out.println("getting id from service" + postId);
//        Replies r = tRepo.findById(replyId).get();
//        r.setPost(postId);
//        tRepo.save(r);
//        System.out.println(r);
//    }

}
