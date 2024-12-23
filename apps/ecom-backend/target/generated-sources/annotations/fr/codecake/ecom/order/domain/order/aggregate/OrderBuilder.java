package fr.codecake.ecom.order.domain.order.aggregate;

import fr.codecake.ecom.order.domain.order.vo.OrderStatus;
import fr.codecake.ecom.order.domain.user.aggregate.User;
import fr.codecake.ecom.product.domain.vo.PublicId;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class OrderBuilder {
  private OrderStatus status;

  private User user;

  private String stripeId;

  private PublicId publicId;

  private List<OrderedProduct> orderedProducts;

  public static OrderBuilder order() {
    return new OrderBuilder();
  }

  public OrderBuilder status(final OrderStatus status) {
    this.status = status;
    return this;
  }

  public OrderBuilder user(final User user) {
    this.user = user;
    return this;
  }

  public OrderBuilder stripeId(final String stripeId) {
    this.stripeId = stripeId;
    return this;
  }

  public OrderBuilder publicId(final PublicId publicId) {
    this.publicId = publicId;
    return this;
  }

  public OrderBuilder orderedProducts(final List<OrderedProduct> orderedProducts) {
    this.orderedProducts = orderedProducts;
    return this;
  }

  public Order build() {
    return new Order(status, user, stripeId, publicId, orderedProducts);
  }
}
