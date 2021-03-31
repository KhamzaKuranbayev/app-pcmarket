package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.*;

import java.util.Date;

@Projection(types = Comment.class)
public interface CustomComment {

    Integer getId();

    Integer getCustomer();

    String getMessage();

    Date getDate();

    double getMark();

    Integer getProduct();

}
