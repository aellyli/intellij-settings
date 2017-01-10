#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("Java File Header.java")
public class ${NAME}{
#parse("Field Section.java")
	
#parse("Constructor Section.java")
}// end class(${NAME})