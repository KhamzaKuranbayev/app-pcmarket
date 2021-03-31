package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Cart;
import uz.pdp.apppcmarket.projection.CustomCart;

@RepositoryRestResource(path = "cart", collectionResourceRel = "cartList", excerptProjection = CustomCart.class)
public interface CartRepository extends JpaRepository<Cart, Integer> {


}
