package fr.codecake.ecom.order.infrastructure.primary.order;

import fr.codecake.ecom.product.infrastructure.primary.RestPicture;
import java.lang.String;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class RestProductCartBuilder {
  private String name;

  private double price;

  private String brand;

  private RestPicture picture;

  private int quantity;

  private UUID publicId;

  public static RestProductCartBuilder restProductCart() {
    return new RestProductCartBuilder();
  }

  public RestProductCartBuilder name(final String name) {
    this.name = name;
    return this;
  }

  public RestProductCartBuilder price(final double price) {
    this.price = price;
    return this;
  }

  public RestProductCartBuilder brand(final String brand) {
    this.brand = brand;
    return this;
  }

  public RestProductCartBuilder picture(final RestPicture picture) {
    this.picture = picture;
    return this;
  }

  public RestProductCartBuilder quantity(final int quantity) {
    this.quantity = quantity;
    return this;
  }

  public RestProductCartBuilder publicId(final UUID publicId) {
    this.publicId = publicId;
    return this;
  }

  public RestProductCart build() {
    return new RestProductCart(name, price, brand, picture, quantity, publicId);
  }
}
