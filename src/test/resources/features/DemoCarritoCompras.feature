Feature: Validar carrito de compras
  @demoTest
  Scenario: Validar carrito de compras correctamente
    Given estoy en la aplicacion de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego uno del siguiente producto  Sauce Labs Backpack
    Then valido el carrito de compra actualice correctamente
