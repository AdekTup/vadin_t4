package pl.baksza.vadin_t4.gui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.baksza.vadin_t4.manager.CarManager;
import pl.baksza.vadin_t4.model.Car;

@Route("show-car")
public class CarShowGui extends VerticalLayout {
    private CarManager carManager;

    @Autowired
    public CarShowGui(CarManager carManager) {
        this.carManager = carManager;
        Grid<Car> grid = new Grid<>(Car.class);
        grid.setItems(carManager.getCarList());

        add(grid);
    }


}
