module org.example.javaodev5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javaodev5.Q1 to javafx.fxml;
    exports org.example.javaodev5.Q1;
    opens org.example.javaodev5.Q2 to javafx.fxml;
    exports org.example.javaodev5.Q2;
    opens org.example.javaodev5.Q3 to javafx.fxml;
    exports org.example.javaodev5.Q3;
    opens org.example.javaodev5.Q4 to javafx.fxml;
    exports org.example.javaodev5.Q4;
    opens org.example.javaodev5.Q5 to javafx.fxml;
    exports org.example.javaodev5.Q5;
}