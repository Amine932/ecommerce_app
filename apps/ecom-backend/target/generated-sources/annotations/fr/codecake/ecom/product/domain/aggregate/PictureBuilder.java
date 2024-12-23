package fr.codecake.ecom.product.domain.aggregate;

import java.lang.String;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class PictureBuilder {
  private byte[] file;

  private String mimeType;

  public static PictureBuilder picture() {
    return new PictureBuilder();
  }

  public PictureBuilder file(final byte[] file) {
    this.file = file;
    return this;
  }

  public PictureBuilder mimeType(final String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  public Picture build() {
    return new Picture(file, mimeType);
  }
}
