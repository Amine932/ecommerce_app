package fr.codecake.ecom.product.domain.aggregate;

import fr.codecake.ecom.product.domain.vo.CategoryName;
import fr.codecake.ecom.product.domain.vo.PublicId;
import java.lang.Long;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class CategoryBuilder {
  private CategoryName name;

  private Long dbId;

  private PublicId publicId;

  public static CategoryBuilder category() {
    return new CategoryBuilder();
  }

  public CategoryBuilder name(final CategoryName name) {
    this.name = name;
    return this;
  }

  public CategoryBuilder dbId(final Long dbId) {
    this.dbId = dbId;
    return this;
  }

  public CategoryBuilder publicId(final PublicId publicId) {
    this.publicId = publicId;
    return this;
  }

  public Category build() {
    return new Category(name, dbId, publicId);
  }
}
