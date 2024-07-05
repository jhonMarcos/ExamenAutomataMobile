package com.nttdata.stepsdefinitions;

import com.nttdata.steps.DemoCarritoComprasSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DemoCarritoComprasStepDef {

    @Steps
    DemoCarritoComprasSteps demoCarritoComprasSteps;

    @Given("estoy en la aplicacion de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        demoCarritoComprasSteps.validarIngresoApp();

    }

    @When("agrego uno del siguiente producto  Sauce Labs Backpack")
    public void agregoUnoDelSiguienteProductoSauceLabsBackpack() {
        demoCarritoComprasSteps.clicImagenBackpack();
        demoCarritoComprasSteps.clicAgregarCantidadProducto();
        demoCarritoComprasSteps.clicAgregarCarrito();
        demoCarritoComprasSteps.clicCarritoCompra();
    }


    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        demoCarritoComprasSteps.validarAgregarCarrito();
    }



}
