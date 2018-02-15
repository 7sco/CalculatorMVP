package com.example.franciscoandrade.calculatormvp.Presenters;

import com.example.franciscoandrade.calculatormvp.Interactors.MainInteractorImpl;
import com.example.franciscoandrade.calculatormvp.Interfaces.MainInteractor;
import com.example.franciscoandrade.calculatormvp.Interfaces.MainPresenter;
import com.example.franciscoandrade.calculatormvp.Interfaces.MainView;

/**
 * Created by franciscoandrade on 2/15/18.
 */

public class MainPresenterImpl  implements MainPresenter{

    private MainView mainView;
    private MainInteractor intereactor;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        intereactor= new MainInteractorImpl(this);
    }

    @Override
    public void operacion(String numberOne, String numberTwo) {
        if(mainView!=null){
            //interactor
            intereactor.suma(numberOne, numberTwo);
        }
    }

    @Override
    public void showErrorPresenter(String error) {
        if(mainView!=null){
            mainView.showError(error);
        }
    }

    @Override
    public void setResultPresenter(String result) {
        if (mainView!=null){
            mainView.setResult(result);
        }
    }
}
