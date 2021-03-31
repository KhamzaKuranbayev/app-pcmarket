package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Payment;
import uz.pdp.apppcmarket.projection.CustomPayment;

@RepositoryRestResource(path = "payment", collectionResourceRel = "paymentList", excerptProjection = CustomPayment.class)
public interface PaymentRepository extends JpaRepository<Payment, Integer> {


}
