Feature: Eliminar productos del carrito
  
  Scenario: Eliminar los productos del carrito
    Given Un usuario agrega un libro al carrito
    When El usuario elimina un libro del carrito
    Then La pagina no mostrara ningun libro en el carrito


