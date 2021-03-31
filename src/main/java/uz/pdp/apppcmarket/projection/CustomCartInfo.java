package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.CartInfo;

@Projection(types = CartInfo.class)
public interface CustomCartInfo {

    Integer getId();

    Integer getProduct();

    Integer getCart();

    double getQty();
}
