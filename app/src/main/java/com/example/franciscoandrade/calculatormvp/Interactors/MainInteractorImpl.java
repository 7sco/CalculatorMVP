package com.example.franciscoandrade.calculatormvp.Interactors;

import com.example.franciscoandrade.calculatormvp.Interfaces.MainInteractor;
import com.example.franciscoandrade.calculatormvp.Interfaces.MainPresenter;

/**
 * Created by franciscoandrade on 2/15/18.
 */

public class MainInteractorImpl implements MainInteractor {

    private MainPresenter presenter;
    private Double result;

    public MainInteractorImpl(MainPresenter presenter) {
        this.presenter = presenter;
    }
    @Override
    public void suma(String numOne, String numTwo) {
        if(numOne.equals("") && numTwo.equals("") ){
            presenter.showErrorPresenter("The fields are empty");
        }
        else {
            try {
                result= Double.valueOf(numOne)+Double.valueOf(numTwo);
                presenter.setResultPresenter(String.valueOf(result));
            }catch (Exception e){
                presenter.showErrorPresenter(e.getMessage());
            }
        }
    }
}
