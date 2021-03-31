package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.*;

import java.util.Date;

@Projection(types = Order.class)
public interface CustomOrder {

    Integer getId();

    Integer getCustomer();

    Date getDate();

    Integer getCart();
}
