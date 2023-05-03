package com.example.tourguide;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

public class TourGuideController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private ImageView imageView;

    @FXML
    private ListView<Country> listView;

    private final ObservableList<Country> countries = FXCollections.observableArrayList();

    public void initialize() {
        countries.add(new Country("Japan", "com/example/tourguide/images/Japan.jpg", "com/example/tourguide/images/Japan.jpg"));
        countries.add(new Country("Germany", "com/example/tourguide/images/Germany.jpg", "com/example/tourguide/images/Germany.jpg"));
        countries.add(new Country("South Korea", "com/example/tourguide/images/SouthKorea.jpg", "com/example/tourguide/images/SouthKorea.jpg"));
        countries.add(new Country("Australia", "com/example/tourguide/images/Australia.jpg", "com/example/tourguide/images/Australia.jpg"));
        countries.add(new Country("Mexico", "com/example/tourguide/images/Mexico.jpg", "com/example/tourguide/images/Mexico.jpg"));

        listView.setItems(countries);

        listView.getSelectionModel().selectedItemProperty()
                .addListener(
                        new ChangeListener<Country>() {
                            @Override
                            public void changed(ObservableValue<? extends Country> observableValue, Country oldCountry, Country newCountry) {
                                imageView.setImage(new Image(newCountry.getLgImgPath()));
                            }
                        }
                );

        listView.setCellFactory(
                new Callback<ListView<Country>, ListCell<Country>>() {
                    public ImageTextCell call(ListView<Country> listView) {
                        return new ImageTextCell();
                    }
                }
        );
    }

}