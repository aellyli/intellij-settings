#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME};#end
#parse("Java File Header.java")

import javafx.application.Application;
import javafx.stage.Stage;

public class ${NAME} extends Application {
	#parse("Field Section.java")
	
	#parse("Constructor Section.java")
	
	public static void main(String[] args) {
		launch(args);
	}// end method(main)

	@Override
	public void start(Stage primaryStage) {
	
	}// end method(start)
}// end class(${NAME})
