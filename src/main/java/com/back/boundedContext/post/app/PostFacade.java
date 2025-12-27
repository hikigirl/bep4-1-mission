package com.back.boundedContext.post.app;

import com.back.boundedContext.member.domain.Member;
import com.back.boundedContext.post.domain.Post;
import com.back.boundedContext.post.domain.PostMember;
import com.back.boundedContext.post.out.PostMemberRepository;
import com.back.boundedContext.post.out.PostRepository;
import com.back.global.rsData.RsData;
import com.back.shared.member.dto.MemberDto;
import com.back.shared.post.dto.PostDto;
import com.back.shared.post.event.PostCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostFacade {
    private final PostSupport postSupport;
    private final PostSyncMemberUseCase postSyncMemberUseCase;
    private final PostWriteUseCase postWriteUseCase;

    @Transactional(readOnly = true)
    public long count() {
        return postSupport.count();
    }

    @Transactional
    public RsData<Post> write(PostMember author, String title, String content) {
        return postWriteUseCase.write(author,title,content);
    }

    @Transactional(readOnly = true)
    public Optional<Post> findById(int id) {
        return postSupport.findById(id);
    }

    @Transactional
    public PostMember syncMember(MemberDto memberDto) {

        return postSyncMemberUseCase.syncMember(memberDto);
    }

    public Optional<PostMember> findMemberByUserName(String username) {
        return postSupport.findMemberByUsername(username);
    }
}
