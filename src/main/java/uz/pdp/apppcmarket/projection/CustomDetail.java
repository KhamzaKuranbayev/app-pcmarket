package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.*;

@Projection(types = Detail.class)
public interface CustomDetail {

    Integer getId();

    Integer getProduct();

    Integer getFeature();

    String getValue();
}
