package org.jboss.weld.junit5.auto;


import org.jboss.weld.junit5.auto.beans.Engine;
import org.jboss.weld.junit5.auto.beans.V8;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertNotNull;



@EnableAutoWeld
@AddPackages(Engine.class)
public class AddPackagesTest {

  @Inject
  private V8 engine;

  @Test
  @DisplayName("Test that @AddPackages pulls in V8 (without bean defining annotation) to fulfill the injected Engine interface")
  void test() {
    assertNotNull(engine);
  }

}
