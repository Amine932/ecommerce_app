package fr.codecake.ecom.product.infrastructure.primary;

import fr.codecake.ecom.product.domain.vo.ProductSize;
import java.lang.String;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class RestProductBuilder {
  private String brand;

  private String color;

  private String description;

  private String name;

  private double price;

  private ProductSize size;

  private RestCategory category;

  private boolean featured;

  private List<RestPicture> pictures;

  private UUID publicId;

  private int nbInStock;

  public static RestProductBuilder restProduct() {
    return new RestProductBuilder();
  }

  public RestProductBuilder brand(final String brand) {
    this.brand = brand;
    return this;
  }

  public RestProductBuilder color(final String color) {
    this.color = color;
    return this;
  }

  public RestProductBuilder description(final String description) {
    this.description = description;
    return this;
  }

  public RestProductBuilder name(final String name) {
    this.name = name;
    return this;
  }

  public RestProductBuilder price(final double price) {
    this.price = price;
    return this;
  }

  public RestProductBuilder size(final ProductSize size) {
    this.size = size;
    return this;
  }

  public RestProductBuilder category(final RestCategory category) {
    this.category = category;
    return this;
  }

  public RestProductBuilder featured(final boolean featured) {
    this.featured = featured;
    return this;
  }

  public RestProductBuilder pictures(final List<RestPicture> pictures) {
    this.pictures = pictures;
    return this;
  }

  public RestProductBuilder publicId(final UUID publicId) {
    this.publicId = publicId;
    return this;
  }

  public RestProductBuilder nbInStock(final int nbInStock) {
    this.nbInStock = nbInStock;
    return this;
  }

  public RestProduct build() {
    return new RestProduct(brand, color, description, name, price, size, category, featured, pictures, publicId, nbInStock);
  }
}
