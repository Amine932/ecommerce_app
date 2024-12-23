package fr.codecake.ecom.order.infrastructure.secondary.entity;

import fr.codecake.ecom.order.domain.order.vo.OrderStatus;
import java.lang.Long;
import java.lang.String;
import java.util.Set;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class OrderEntityBuilder {
  private Long id;

  private UUID publicId;

  private OrderStatus status;

  private String stripeSessionId;

  private Set<OrderedProductEntity> orderedProducts;

  private UserEntity user;

  public static OrderEntityBuilder orderEntity() {
    return new OrderEntityBuilder();
  }

  public OrderEntityBuilder id(final Long id) {
    this.id = id;
    return this;
  }

  public OrderEntityBuilder publicId(final UUID publicId) {
    this.publicId = publicId;
    return this;
  }

  public OrderEntityBuilder status(final OrderStatus status) {
    this.status = status;
    return this;
  }

  public OrderEntityBuilder stripeSessionId(final String stripeSessionId) {
    this.stripeSessionId = stripeSessionId;
    return this;
  }

  public OrderEntityBuilder orderedProducts(final Set<OrderedProductEntity> orderedProducts) {
    this.orderedProducts = orderedProducts;
    return this;
  }

  public OrderEntityBuilder user(final UserEntity user) {
    this.user = user;
    return this;
  }

  public OrderEntity build() {
    return new OrderEntity(id, publicId, status, stripeSessionId, orderedProducts, user);
  }
}
