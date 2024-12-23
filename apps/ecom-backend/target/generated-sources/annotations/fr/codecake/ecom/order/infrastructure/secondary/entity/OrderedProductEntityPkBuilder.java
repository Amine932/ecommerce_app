package fr.codecake.ecom.order.infrastructure.secondary.entity;

import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class OrderedProductEntityPkBuilder {
  private OrderEntity order;

  private UUID productPublicId;

  public static OrderedProductEntityPkBuilder orderedProductEntityPk() {
    return new OrderedProductEntityPkBuilder();
  }

  public OrderedProductEntityPkBuilder order(final OrderEntity order) {
    this.order = order;
    return this;
  }

  public OrderedProductEntityPkBuilder productPublicId(final UUID productPublicId) {
    this.productPublicId = productPublicId;
    return this;
  }

  public OrderedProductEntityPk build() {
    return new OrderedProductEntityPk(order, productPublicId);
  }
}
