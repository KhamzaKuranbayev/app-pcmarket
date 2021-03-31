package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Feature;

@Projection(types = Feature.class)
public interface CustomFeature {

    Integer getId();

    String getName();

    String getType();

    Integer getCategory();

}
