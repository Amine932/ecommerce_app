package fr.codecake.ecom.order.infrastructure.primary.order;

import fr.codecake.ecom.order.domain.order.vo.OrderStatus;
import java.lang.String;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class RestOrderReadAdminBuilder {
  private UUID publicId;

  private OrderStatus status;

  private List<RestOrderedItemRead> orderedItems;

  private String address;

  private String email;

  public static RestOrderReadAdminBuilder restOrderReadAdmin() {
    return new RestOrderReadAdminBuilder();
  }

  public RestOrderReadAdminBuilder publicId(final UUID publicId) {
    this.publicId = publicId;
    return this;
  }

  public RestOrderReadAdminBuilder status(final OrderStatus status) {
    this.status = status;
    return this;
  }

  public RestOrderReadAdminBuilder orderedItems(final List<RestOrderedItemRead> orderedItems) {
    this.orderedItems = orderedItems;
    return this;
  }

  public RestOrderReadAdminBuilder address(final String address) {
    this.address = address;
    return this;
  }

  public RestOrderReadAdminBuilder email(final String email) {
    this.email = email;
    return this;
  }

  public RestOrderReadAdmin build() {
    return new RestOrderReadAdmin(publicId, status, orderedItems, address, email);
  }
}
