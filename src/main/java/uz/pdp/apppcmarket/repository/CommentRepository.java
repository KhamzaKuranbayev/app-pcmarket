package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Comment;
import uz.pdp.apppcmarket.projection.CustomComment;

@RepositoryRestResource(path = "comment", collectionResourceRel = "commentList", excerptProjection = CustomComment.class)
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
