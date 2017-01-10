#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("Java File Header.java")
public class ${NAME}{
#parse("Field Section.java")
	
#parse("Constructor Section.java")
	
	public static void main(String ... args){
		
	}// end method(main)
}// end class(${NAME})