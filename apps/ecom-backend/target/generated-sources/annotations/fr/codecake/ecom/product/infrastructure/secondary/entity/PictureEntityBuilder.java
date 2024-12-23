package fr.codecake.ecom.product.infrastructure.secondary.entity;

import java.lang.Long;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class PictureEntityBuilder {
  private Long id;

  private byte[] file;

  private String mimeType;

  private ProductEntity product;

  public static PictureEntityBuilder pictureEntity() {
    return new PictureEntityBuilder();
  }

  public PictureEntityBuilder id(final Long id) {
    this.id = id;
    return this;
  }

  public PictureEntityBuilder file(final byte[] file) {
    this.file = file;
    return this;
  }

  public PictureEntityBuilder mimeType(final String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  public PictureEntityBuilder product(final ProductEntity product) {
    this.product = product;
    return this;
  }

  public PictureEntity build() {
    return new PictureEntity(id, file, mimeType, product);
  }
}
