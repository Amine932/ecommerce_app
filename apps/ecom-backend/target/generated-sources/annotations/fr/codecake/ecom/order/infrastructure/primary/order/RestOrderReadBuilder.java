package fr.codecake.ecom.order.infrastructure.primary.order;

import fr.codecake.ecom.order.domain.order.vo.OrderStatus;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class RestOrderReadBuilder {
  private UUID publicId;

  private OrderStatus status;

  private List<RestOrderedItemRead> orderedItems;

  public static RestOrderReadBuilder restOrderRead() {
    return new RestOrderReadBuilder();
  }

  public RestOrderReadBuilder publicId(final UUID publicId) {
    this.publicId = publicId;
    return this;
  }

  public RestOrderReadBuilder status(final OrderStatus status) {
    this.status = status;
    return this;
  }

  public RestOrderReadBuilder orderedItems(final List<RestOrderedItemRead> orderedItems) {
    this.orderedItems = orderedItems;
    return this;
  }

  public RestOrderRead build() {
    return new RestOrderRead(publicId, status, orderedItems);
  }
}
