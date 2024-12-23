package fr.codecake.ecom.order.infrastructure.primary.order;

import java.util.List;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class RestDetailCartResponseBuilder {
  private List<RestProductCart> products;

  public static RestDetailCartResponseBuilder restDetailCartResponse() {
    return new RestDetailCartResponseBuilder();
  }

  public RestDetailCartResponseBuilder products(final List<RestProductCart> products) {
    this.products = products;
    return this;
  }

  public RestDetailCartResponse build() {
    return new RestDetailCartResponse(products);
  }
}
