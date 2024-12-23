package fr.codecake.ecom.product.domain.aggregate;

import fr.codecake.ecom.product.domain.vo.ProductBrand;
import fr.codecake.ecom.product.domain.vo.ProductName;
import fr.codecake.ecom.product.domain.vo.ProductPrice;
import fr.codecake.ecom.product.domain.vo.PublicId;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class ProductCartBuilder {
  private ProductName name;

  private ProductPrice price;

  private ProductBrand brand;

  private Picture picture;

  private PublicId publicId;

  public static ProductCartBuilder productCart() {
    return new ProductCartBuilder();
  }

  public ProductCartBuilder name(final ProductName name) {
    this.name = name;
    return this;
  }

  public ProductCartBuilder price(final ProductPrice price) {
    this.price = price;
    return this;
  }

  public ProductCartBuilder brand(final ProductBrand brand) {
    this.brand = brand;
    return this;
  }

  public ProductCartBuilder picture(final Picture picture) {
    this.picture = picture;
    return this;
  }

  public ProductCartBuilder publicId(final PublicId publicId) {
    this.publicId = publicId;
    return this;
  }

  public ProductCart build() {
    return new ProductCart(name, price, brand, picture, publicId);
  }
}
