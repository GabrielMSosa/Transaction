package com.example.transaction.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.transaction.exception.InsuficcienAmountExcepcion;

public class PaymentUtils {

    // hashMap crea una tupla clave, valor
    private static Map<String, Double> paymentMap = new HashMap<>();
    static{
        paymentMap.put("acc1", 12000.00);
        paymentMap.put("acc1", 10000.00);
        paymentMap.put("acc1", 5000.00);
        paymentMap.put("acc1", 8000.00);
    }

    public static boolean validateCreditLimit(String accNo,double paidAmount)
    {
        if(paidAmount>paymentMap.get(accNo))
            {
            throw new InsuficcienAmountExcepcion("insufficient fund...!");
            }
        else{
            return true;
            }
    }

}
