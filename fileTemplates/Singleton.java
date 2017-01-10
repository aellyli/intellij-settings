#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("Java File Header.java")
public class ${NAME}{
	/*---------Field---------*/
	private static ${NAME} instance;
	
	private static volatile boolean isInitialized=false;
	/*---------End Field---------*/
	
	/*---------Constructor---------*/
	private ${NAME}(){
		
	}// end constructor #1
	/*---------End Constructor---------*/
	
	public static ${NAME} getInstance(){
		if(!${NAME}.isInitialized){
			synchronized(${NAME}.class){
				if(!${NAME}.isInitialized){
					instance=new ${NAME}();
					isInitialized=true;
				}
			}
		}
		
		return instance;
	}// end method(getInstance)
}// end class(${NAME})