package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Blog;
import uz.pdp.apppcmarket.projection.CustomBlog;

@RepositoryRestResource(path = "blog", collectionResourceRel = "blogList", excerptProjection = CustomBlog.class)
public interface BlogRepository extends JpaRepository<Blog, Integer> {


}
