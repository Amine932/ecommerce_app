package fr.codecake.ecom.order.infrastructure.primary.order;

import java.lang.String;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class RestStripeSessionBuilder {
  private String id;

  public static RestStripeSessionBuilder restStripeSession() {
    return new RestStripeSessionBuilder();
  }

  public RestStripeSessionBuilder id(final String id) {
    this.id = id;
    return this;
  }

  public RestStripeSession build() {
    return new RestStripeSession(id);
  }
}
