package org.vision.common.zksnark;

import java.io.IOException;
import org.vision.common.util.Utils;

public class LibrustzcashWrapper {
  private static final Librustzcash INSTANCE = new Librustzcash();

  static {
    try {
      System.load(Utils.getLibraryByName("libzksnarkjni"));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static Librustzcash getInstance() {
    return INSTANCE;
  }

}
