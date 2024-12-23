package fr.codecake.ecom.product.infrastructure.primary;

import java.lang.String;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.6.1")
public class RestPictureBuilder {
  private byte[] file;

  private String mimeType;

  public static RestPictureBuilder restPicture() {
    return new RestPictureBuilder();
  }

  public RestPictureBuilder file(final byte[] file) {
    this.file = file;
    return this;
  }

  public RestPictureBuilder mimeType(final String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  public RestPicture build() {
    return new RestPicture(file, mimeType);
  }
}
