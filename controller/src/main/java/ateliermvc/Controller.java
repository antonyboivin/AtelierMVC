package ateliermvc;

import ateliermvc.model.IModel;
import ateliermvc.view.IView;

public class Controller {
    private IModel model;
    private IView view;

    public Controller(IModel model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void run()
    {
        this.view.display(model.getMessage());
    }
}
