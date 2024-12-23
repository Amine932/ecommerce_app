package fr.codecake.ecom.product.domain.aggregate;

import fr.codecake.ecom.product.domain.vo.ProductSize;
import fr.codecake.ecom.product.domain.vo.PublicId;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class FilterQueryBuilder {
  private PublicId categoryId;

  private List<ProductSize> sizes;

  public static FilterQueryBuilder filterQuery() {
    return new FilterQueryBuilder();
  }

  public FilterQueryBuilder categoryId(final PublicId categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  public FilterQueryBuilder sizes(final List<ProductSize> sizes) {
    this.sizes = sizes;
    return this;
  }

  public FilterQuery build() {
    return new FilterQuery(categoryId, sizes);
  }
}
