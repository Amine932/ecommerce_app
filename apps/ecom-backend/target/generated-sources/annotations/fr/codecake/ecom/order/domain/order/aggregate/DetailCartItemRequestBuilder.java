package fr.codecake.ecom.order.domain.order.aggregate;

import fr.codecake.ecom.product.domain.vo.PublicId;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class DetailCartItemRequestBuilder {
  private PublicId productId;

  private long quantity;

  public static DetailCartItemRequestBuilder detailCartItemRequest() {
    return new DetailCartItemRequestBuilder();
  }

  public DetailCartItemRequestBuilder productId(final PublicId productId) {
    this.productId = productId;
    return this;
  }

  public DetailCartItemRequestBuilder quantity(final long quantity) {
    this.quantity = quantity;
    return this;
  }

  public DetailCartItemRequest build() {
    return new DetailCartItemRequest(productId, quantity);
  }
}
