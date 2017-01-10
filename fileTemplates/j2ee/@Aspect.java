#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};

#end
import org.aspectj.lang.annotation.Aspect;

#parse("File Header.java")
@Aspect
public class ${NAME}{
}// end class(${NAME})