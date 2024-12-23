package fr.codecake.ecom.product.infrastructure.secondary.entity;

import java.lang.Long;
import java.lang.String;
import java.util.Set;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class CategoryEntityBuilder {
  private Long id;

  private String name;

  private UUID publicId;

  private Set<ProductEntity> products;

  public static CategoryEntityBuilder categoryEntity() {
    return new CategoryEntityBuilder();
  }

  public CategoryEntityBuilder id(final Long id) {
    this.id = id;
    return this;
  }

  public CategoryEntityBuilder name(final String name) {
    this.name = name;
    return this;
  }

  public CategoryEntityBuilder publicId(final UUID publicId) {
    this.publicId = publicId;
    return this;
  }

  public CategoryEntityBuilder products(final Set<ProductEntity> products) {
    this.products = products;
    return this;
  }

  public CategoryEntity build() {
    return new CategoryEntity(id, name, publicId, products);
  }
}
