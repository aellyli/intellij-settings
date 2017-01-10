#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("Java File Header.java")
public abstract class ${NAME}{
#parse("Field Section.java")

#parse("Constructor Section.java")
}// end class(${NAME})