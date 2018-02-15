package com.example.franciscoandrade.calculatormvp.Interfaces;

/**
 * Created by franciscoandrade on 2/15/18.
 */

public interface MainPresenter {

    void operacion(String numberOne, String numberTwo);
    void showErrorPresenter(String error);
    void setResultPresenter(String result);
}
