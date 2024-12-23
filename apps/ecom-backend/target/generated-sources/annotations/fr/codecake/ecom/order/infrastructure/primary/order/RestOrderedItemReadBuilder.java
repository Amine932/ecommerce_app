package fr.codecake.ecom.order.infrastructure.primary.order;

import java.lang.String;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class RestOrderedItemReadBuilder {
  private long quantity;

  private double price;

  private String name;

  public static RestOrderedItemReadBuilder restOrderedItemRead() {
    return new RestOrderedItemReadBuilder();
  }

  public RestOrderedItemReadBuilder quantity(final long quantity) {
    this.quantity = quantity;
    return this;
  }

  public RestOrderedItemReadBuilder price(final double price) {
    this.price = price;
    return this;
  }

  public RestOrderedItemReadBuilder name(final String name) {
    this.name = name;
    return this;
  }

  public RestOrderedItemRead build() {
    return new RestOrderedItemRead(quantity, price, name);
  }
}
