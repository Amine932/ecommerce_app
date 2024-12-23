package fr.codecake.ecom.order.domain.user.aggregate;

import fr.codecake.ecom.order.domain.user.vo.UserAddress;
import fr.codecake.ecom.order.domain.user.vo.UserEmail;
import fr.codecake.ecom.order.domain.user.vo.UserFirstname;
import fr.codecake.ecom.order.domain.user.vo.UserImageUrl;
import fr.codecake.ecom.order.domain.user.vo.UserLastname;
import fr.codecake.ecom.order.domain.user.vo.UserPublicId;
import java.lang.Long;
import java.time.Instant;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class UserBuilder {
  private UserLastname lastname;

  private UserFirstname firstname;

  private UserEmail email;

  private UserPublicId userPublicId;

  private UserImageUrl imageUrl;

  private Instant lastModifiedDate;

  private Instant createdDate;

  private Set<Authority> authorities;

  private Long dbId;

  private UserAddress userAddress;

  private Instant lastSeen;

  public static UserBuilder user() {
    return new UserBuilder();
  }

  public UserBuilder lastname(final UserLastname lastname) {
    this.lastname = lastname;
    return this;
  }

  public UserBuilder firstname(final UserFirstname firstname) {
    this.firstname = firstname;
    return this;
  }

  public UserBuilder email(final UserEmail email) {
    this.email = email;
    return this;
  }

  public UserBuilder userPublicId(final UserPublicId userPublicId) {
    this.userPublicId = userPublicId;
    return this;
  }

  public UserBuilder imageUrl(final UserImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public UserBuilder lastModifiedDate(final Instant lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  public UserBuilder createdDate(final Instant createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  public UserBuilder authorities(final Set<Authority> authorities) {
    this.authorities = authorities;
    return this;
  }

  public UserBuilder dbId(final Long dbId) {
    this.dbId = dbId;
    return this;
  }

  public UserBuilder userAddress(final UserAddress userAddress) {
    this.userAddress = userAddress;
    return this;
  }

  public UserBuilder lastSeen(final Instant lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

  public User build() {
    return new User(lastname, firstname, email, userPublicId, imageUrl, lastModifiedDate, createdDate, authorities, dbId, userAddress, lastSeen);
  }
}
