package fr.codecake.ecom.order.infrastructure.secondary.entity;

import java.lang.Double;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class OrderedProductEntityBuilder {
  private OrderedProductEntityPk id;

  private Double price;

  private long quantity;

  private String productName;

  public static OrderedProductEntityBuilder orderedProductEntity() {
    return new OrderedProductEntityBuilder();
  }

  public OrderedProductEntityBuilder id(final OrderedProductEntityPk id) {
    this.id = id;
    return this;
  }

  public OrderedProductEntityBuilder price(final Double price) {
    this.price = price;
    return this;
  }

  public OrderedProductEntityBuilder quantity(final long quantity) {
    this.quantity = quantity;
    return this;
  }

  public OrderedProductEntityBuilder productName(final String productName) {
    this.productName = productName;
    return this;
  }

  public OrderedProductEntity build() {
    return new OrderedProductEntity(id, price, quantity, productName);
  }
}
