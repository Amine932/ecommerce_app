package fr.codecake.ecom.product.infrastructure.secondary.entity;

import fr.codecake.ecom.product.domain.vo.ProductSize;
import java.lang.Long;
import java.lang.String;
import java.util.Set;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class ProductEntityBuilder {
  private Long id;

  private String brand;

  private String color;

  private String description;

  private String name;

  private double price;

  private boolean featured;

  private ProductSize size;

  private UUID publicId;

  private int nbInStock;

  private Set<PictureEntity> pictures;

  private CategoryEntity category;

  public static ProductEntityBuilder productEntity() {
    return new ProductEntityBuilder();
  }

  public ProductEntityBuilder id(final Long id) {
    this.id = id;
    return this;
  }

  public ProductEntityBuilder brand(final String brand) {
    this.brand = brand;
    return this;
  }

  public ProductEntityBuilder color(final String color) {
    this.color = color;
    return this;
  }

  public ProductEntityBuilder description(final String description) {
    this.description = description;
    return this;
  }

  public ProductEntityBuilder name(final String name) {
    this.name = name;
    return this;
  }

  public ProductEntityBuilder price(final double price) {
    this.price = price;
    return this;
  }

  public ProductEntityBuilder featured(final boolean featured) {
    this.featured = featured;
    return this;
  }

  public ProductEntityBuilder size(final ProductSize size) {
    this.size = size;
    return this;
  }

  public ProductEntityBuilder publicId(final UUID publicId) {
    this.publicId = publicId;
    return this;
  }

  public ProductEntityBuilder nbInStock(final int nbInStock) {
    this.nbInStock = nbInStock;
    return this;
  }

  public ProductEntityBuilder pictures(final Set<PictureEntity> pictures) {
    this.pictures = pictures;
    return this;
  }

  public ProductEntityBuilder category(final CategoryEntity category) {
    this.category = category;
    return this;
  }

  public ProductEntity build() {
    return new ProductEntity(id, brand, color, description, name, price, featured, size, publicId, nbInStock, pictures, category);
  }
}
