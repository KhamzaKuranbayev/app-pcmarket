package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.*;

import java.util.Date;

@Projection(types = Payment.class)
public interface CustomPayment {

    Integer getId();

    double getPrice();

    Integer getUser();

    Integer getInvoice();

    Date getDate();

}
