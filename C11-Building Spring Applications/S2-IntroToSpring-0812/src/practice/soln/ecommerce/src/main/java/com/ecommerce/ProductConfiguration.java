package com.ecommerce;

import org.springframework.context.annotation.Bean;

public class ProductConfiguration {
    @Bean("Mouse")
    public Product getMouseDetails(){
        return new Product(2312, "Logitech MX Master 3S","Wireless Performance Mouse with Ultra-Fast Scrolling, Ergo, 8K DPI, Track on Glass, Quiet Clicks, USB-C, Bluetooth, Windows, Linux, Chrome-Graphite");
    }

    @Bean("Keyboard")
    public Product getKeyboardDetails(){
        return new Product(7829,"Cloud Nine C959 ErgoTKL", "Ergonomic Tenkeyless Mechanical Keyboard for PC – Cherry MX Blue – TKL RGB Backlit Ergo Split Key Board");
    }
}
