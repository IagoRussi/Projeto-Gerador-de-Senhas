module com.iagorussi.projetosenhas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iagorussi.projetosenhas to javafx.fxml;
    exports com.iagorussi.projetosenhas;
}