Feature: Agregar al carrito

  Scenario: Agregar dos libros al carrito
    Given El usuario se encuentra en el apartado libros
    When El usuario agrega dos libros al carrito
    Then La pagina mostrara los dos libros en el carrito
