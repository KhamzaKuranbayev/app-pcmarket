package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.CartInfo;
import uz.pdp.apppcmarket.projection.CustomCartInfo;

@RepositoryRestResource(path = "cartInfo", collectionResourceRel = "cartInfoList", excerptProjection = CustomCartInfo.class)
public interface CartInfoRepository extends JpaRepository<CartInfo, Integer> {


}
