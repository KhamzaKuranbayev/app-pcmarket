package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.*;

import java.util.Date;

@Projection(types = Invoice.class)
public interface CustomInvoice {

    Integer getId();

    Integer getCustomer();

    Integer getOrder();

    double getPrice();

    Date getCreatedDate();

    Date getDueDate();

    Integer getOrderStatus();
}
