package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Attachment;
import uz.pdp.apppcmarket.entity.Blog;

import java.util.List;

@Projection(types = Blog.class)
public interface CustomBlog {

    Integer getId();

    String getTitle();

    String getBody();

    List<Attachment> getPhotos();

}
