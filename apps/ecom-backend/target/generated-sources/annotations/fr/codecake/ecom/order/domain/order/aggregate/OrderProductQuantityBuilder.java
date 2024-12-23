package fr.codecake.ecom.order.domain.order.aggregate;

import fr.codecake.ecom.order.domain.order.vo.OrderQuantity;
import fr.codecake.ecom.order.domain.order.vo.ProductPublicId;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class OrderProductQuantityBuilder {
  private OrderQuantity quantity;

  private ProductPublicId productPublicId;

  public static OrderProductQuantityBuilder orderProductQuantity() {
    return new OrderProductQuantityBuilder();
  }

  public OrderProductQuantityBuilder quantity(final OrderQuantity quantity) {
    this.quantity = quantity;
    return this;
  }

  public OrderProductQuantityBuilder productPublicId(final ProductPublicId productPublicId) {
    this.productPublicId = productPublicId;
    return this;
  }

  public OrderProductQuantity build() {
    return new OrderProductQuantity(quantity, productPublicId);
  }
}
