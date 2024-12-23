package fr.codecake.ecom.product.domain.aggregate;

import fr.codecake.ecom.product.domain.vo.ProductBrand;
import fr.codecake.ecom.product.domain.vo.ProductColor;
import fr.codecake.ecom.product.domain.vo.ProductDescription;
import fr.codecake.ecom.product.domain.vo.ProductName;
import fr.codecake.ecom.product.domain.vo.ProductPrice;
import fr.codecake.ecom.product.domain.vo.ProductSize;
import fr.codecake.ecom.product.domain.vo.PublicId;
import java.lang.Long;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class ProductBuilder {
  private ProductBrand productBrand;

  private ProductColor color;

  private ProductDescription description;

  private ProductName name;

  private ProductPrice price;

  private ProductSize size;

  private Category category;

  private List<Picture> pictures;

  private Long dbId;

  private boolean featured;

  private PublicId publicId;

  private int nbInStock;

  public static ProductBuilder product() {
    return new ProductBuilder();
  }

  public ProductBuilder productBrand(final ProductBrand productBrand) {
    this.productBrand = productBrand;
    return this;
  }

  public ProductBuilder color(final ProductColor color) {
    this.color = color;
    return this;
  }

  public ProductBuilder description(final ProductDescription description) {
    this.description = description;
    return this;
  }

  public ProductBuilder name(final ProductName name) {
    this.name = name;
    return this;
  }

  public ProductBuilder price(final ProductPrice price) {
    this.price = price;
    return this;
  }

  public ProductBuilder size(final ProductSize size) {
    this.size = size;
    return this;
  }

  public ProductBuilder category(final Category category) {
    this.category = category;
    return this;
  }

  public ProductBuilder pictures(final List<Picture> pictures) {
    this.pictures = pictures;
    return this;
  }

  public ProductBuilder dbId(final Long dbId) {
    this.dbId = dbId;
    return this;
  }

  public ProductBuilder featured(final boolean featured) {
    this.featured = featured;
    return this;
  }

  public ProductBuilder publicId(final PublicId publicId) {
    this.publicId = publicId;
    return this;
  }

  public ProductBuilder nbInStock(final int nbInStock) {
    this.nbInStock = nbInStock;
    return this;
  }

  public Product build() {
    return new Product(productBrand, color, description, name, price, size, category, pictures, dbId, featured, publicId, nbInStock);
  }
}
