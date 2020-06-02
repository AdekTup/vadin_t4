package pl.baksza.vadin_t4.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import elemental.json.impl.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.ls.LSOutput;
import pl.baksza.vadin_t4.manager.CarManager;
import pl.baksza.vadin_t4.model.Car;

@Route("add-car")
public class CarAdderGui extends VerticalLayout {
    private CarManager carManager;

    @Autowired
    public CarAdderGui(CarManager carManager) {
        this.carManager = carManager;

        TextField textFieldMark = new TextField();
        textFieldMark.setLabel("Mark");
        TextField textFieldModel = new TextField("Model");

        Button buttonAdd = new Button("Add Car");
        buttonAdd.addClickListener(clickEvent -> {
            System.out.println("M: " + textFieldMark.getValue());
            Car car = new Car(textFieldMark.getValue(),  textFieldModel.getValue());
            System.out.println("CAR: " + car.toString());
            carManager.addCar(car);
            carManager.getCarList().forEach(System.out::println);
        });

        add(textFieldMark, textFieldModel, buttonAdd);


    }
}
