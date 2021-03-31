package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Cart;
import java.util.Date;

@Projection(types = Cart.class)
public interface CustomCart {

    Integer getId();

    Integer getCustomer();

    Date getCreatedDate();

}
