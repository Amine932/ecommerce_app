package fr.codecake.ecom.order.infrastructure.primary.order;

import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class RestCartItemRequestBuilder {
  private UUID publicId;

  private long quantity;

  public static RestCartItemRequestBuilder restCartItemRequest() {
    return new RestCartItemRequestBuilder();
  }

  public RestCartItemRequestBuilder publicId(final UUID publicId) {
    this.publicId = publicId;
    return this;
  }

  public RestCartItemRequestBuilder quantity(final long quantity) {
    this.quantity = quantity;
    return this;
  }

  public RestCartItemRequest build() {
    return new RestCartItemRequest(publicId, quantity);
  }
}
