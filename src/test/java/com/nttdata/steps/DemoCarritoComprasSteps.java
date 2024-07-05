package com.nttdata.steps;

import com.nttdata.screens.DemoCarritoComprasScreen;
import org.junit.Assert;

public class DemoCarritoComprasSteps {

    DemoCarritoComprasScreen demoCarritoComprasScreen;

    public void validarIngresoApp(){
        Assert.assertEquals("Products",demoCarritoComprasScreen.validarIngresoApp());
    }

    public void clicImagenBackpack(){
        demoCarritoComprasScreen.clicImagenMochila();
    }

    public void clicAgregarCantidadProducto(){
        demoCarritoComprasScreen.clicAgregarCantidadProducto();
    }

    public void clicAgregarCarrito(){
        demoCarritoComprasScreen.clicAgregarCarro();
    }

    public void clicCarritoCompra(){
        demoCarritoComprasScreen.clicCarrito();
    }

    public void validarAgregarCarrito(){
        Assert.assertEquals("Sauce Labs Backpack",demoCarritoComprasScreen.validarAgregadoCarrito());
    }


}
