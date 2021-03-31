package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Invoice;
import uz.pdp.apppcmarket.projection.CustomInvoice;

@RepositoryRestResource(path = "invoice", collectionResourceRel = "invoiceList", excerptProjection = CustomInvoice.class)
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
