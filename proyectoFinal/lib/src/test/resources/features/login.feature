Feature: Iniciar Sesion en el sistema

  Scenario: Loguearse con credenciales validas
    Given Un usuario que ingresa al login
    When El usuario ingresa credenciales validas
    Then El usuario ingresa a la pagina principal

