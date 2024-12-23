package fr.codecake.ecom.order.domain.order.aggregate;

import java.util.List;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class DetailCartRequestBuilder {
  private List<DetailCartItemRequest> items;

  public static DetailCartRequestBuilder detailCartRequest() {
    return new DetailCartRequestBuilder();
  }

  public DetailCartRequestBuilder items(final List<DetailCartItemRequest> items) {
    this.items = items;
    return this;
  }

  public DetailCartRequest build() {
    return new DetailCartRequest(items);
  }
}
