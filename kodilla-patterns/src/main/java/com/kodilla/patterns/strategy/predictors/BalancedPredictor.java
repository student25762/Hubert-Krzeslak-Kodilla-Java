package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {
    public String predictWhatToBuy() {
        return "[Balanced Predictor] Buy shared units of XYZ";
    }
}
