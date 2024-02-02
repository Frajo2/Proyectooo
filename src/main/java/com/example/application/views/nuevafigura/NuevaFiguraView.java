package com.example.application.views.nuevafigura;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("nueva Figura")
@Route(value = "my-view2", layout = MainLayout.class)
@Uses(Icon.class)
public class NuevaFiguraView extends Composite<VerticalLayout> {

    public NuevaFiguraView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
