package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.BuyPredictor;

public class ConservativePredictor implements BuyPredictor {
    public String predictWhatToBuy(){
        return "[Conservative Predictor] Buy debentures of XYZ";
    }
}
