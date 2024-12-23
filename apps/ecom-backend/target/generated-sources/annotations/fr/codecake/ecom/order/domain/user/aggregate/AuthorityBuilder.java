package fr.codecake.ecom.order.domain.user.aggregate;

import fr.codecake.ecom.order.domain.user.vo.AuthorityName;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class AuthorityBuilder {
  private AuthorityName name;

  public static AuthorityBuilder authority() {
    return new AuthorityBuilder();
  }

  public AuthorityBuilder name(final AuthorityName name) {
    this.name = name;
    return this;
  }

  public Authority build() {
    return new Authority(name);
  }
}
