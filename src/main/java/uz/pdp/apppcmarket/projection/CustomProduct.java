package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Attachment;
import uz.pdp.apppcmarket.entity.Product;
import java.util.List;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    String getDescription();

    Integer getCategory();

    double getPrice();

    List<Attachment> getPhotos();
}
