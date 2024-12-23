package fr.codecake.ecom.order.domain.order.aggregate;

import fr.codecake.ecom.product.domain.aggregate.ProductCart;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class DetailCartResponseBuilder {
  private List<ProductCart> products;

  public static DetailCartResponseBuilder detailCartResponse() {
    return new DetailCartResponseBuilder();
  }

  public DetailCartResponseBuilder products(final List<ProductCart> products) {
    this.products = products;
    return this;
  }

  public DetailCartResponse build() {
    return new DetailCartResponse(products);
  }
}
