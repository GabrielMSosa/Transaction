package com.example.transaction.exception;

public class InsuficcienAmountExcepcion extends RuntimeException {


    //constructo y heredamos de RuntimeExcepcion
    public InsuficcienAmountExcepcion(String msg){

        super(msg);

    }
    
}
