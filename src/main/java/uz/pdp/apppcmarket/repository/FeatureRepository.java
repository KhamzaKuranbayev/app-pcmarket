package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Feature;
import uz.pdp.apppcmarket.projection.CustomFeature;

@RepositoryRestResource(path = "feature", collectionResourceRel = "featureList", excerptProjection = CustomFeature.class)
public interface FeatureRepository extends JpaRepository<Feature, Integer> {


}
