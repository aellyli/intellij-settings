#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("Java File Header.java")
public enum ${NAME}{
#parse("Field Section.java")
	
#parse("Constructor Section.java")
	
}// end enum(${NAME})