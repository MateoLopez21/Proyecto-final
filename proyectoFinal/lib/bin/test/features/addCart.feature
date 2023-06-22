Feature: Agregar al carrito

  Scenario: Agregar dos libros al carrito
    Given El usuario se encuentra en el apartado libros
    When El usuario agrega un libro al carrito
    Then La pagina mostrara el libro en el carrito
