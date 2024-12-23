package fr.codecake.ecom.product.infrastructure.primary;

import java.lang.String;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class RestCategoryBuilder {
  private UUID publicId;

  private String name;

  public static RestCategoryBuilder restCategory() {
    return new RestCategoryBuilder();
  }

  public RestCategoryBuilder publicId(final UUID publicId) {
    this.publicId = publicId;
    return this;
  }

  public RestCategoryBuilder name(final String name) {
    this.name = name;
    return this;
  }

  public RestCategory build() {
    return new RestCategory(publicId, name);
  }
}
