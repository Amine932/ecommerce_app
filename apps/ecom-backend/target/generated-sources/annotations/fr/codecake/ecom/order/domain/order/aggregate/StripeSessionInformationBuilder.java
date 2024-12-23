package fr.codecake.ecom.order.domain.order.aggregate;

import fr.codecake.ecom.order.domain.order.vo.StripeSessionId;
import fr.codecake.ecom.order.domain.user.vo.UserAddressToUpdate;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class StripeSessionInformationBuilder {
  private StripeSessionId stripeSessionId;

  private UserAddressToUpdate userAddress;

  private List<OrderProductQuantity> orderProductQuantity;

  public static StripeSessionInformationBuilder stripeSessionInformation() {
    return new StripeSessionInformationBuilder();
  }

  public StripeSessionInformationBuilder stripeSessionId(final StripeSessionId stripeSessionId) {
    this.stripeSessionId = stripeSessionId;
    return this;
  }

  public StripeSessionInformationBuilder userAddress(final UserAddressToUpdate userAddress) {
    this.userAddress = userAddress;
    return this;
  }

  public StripeSessionInformationBuilder orderProductQuantity(final List<OrderProductQuantity> orderProductQuantity) {
    this.orderProductQuantity = orderProductQuantity;
    return this;
  }

  public StripeSessionInformation build() {
    return new StripeSessionInformation(stripeSessionId, userAddress, orderProductQuantity);
  }
}
