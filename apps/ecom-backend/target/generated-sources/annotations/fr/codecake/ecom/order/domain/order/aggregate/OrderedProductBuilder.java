package fr.codecake.ecom.order.domain.order.aggregate;

import fr.codecake.ecom.order.domain.order.vo.OrderPrice;
import fr.codecake.ecom.order.domain.order.vo.OrderQuantity;
import fr.codecake.ecom.order.domain.order.vo.ProductPublicId;
import fr.codecake.ecom.product.domain.vo.ProductName;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class OrderedProductBuilder {
  private ProductPublicId productPublicId;

  private OrderPrice price;

  private OrderQuantity quantity;

  private ProductName productName;

  public static OrderedProductBuilder orderedProduct() {
    return new OrderedProductBuilder();
  }

  public OrderedProductBuilder productPublicId(final ProductPublicId productPublicId) {
    this.productPublicId = productPublicId;
    return this;
  }

  public OrderedProductBuilder price(final OrderPrice price) {
    this.price = price;
    return this;
  }

  public OrderedProductBuilder quantity(final OrderQuantity quantity) {
    this.quantity = quantity;
    return this;
  }

  public OrderedProductBuilder productName(final ProductName productName) {
    this.productName = productName;
    return this;
  }

  public OrderedProduct build() {
    return new OrderedProduct(productPublicId, price, quantity, productName);
  }
}
