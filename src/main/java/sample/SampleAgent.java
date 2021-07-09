package sample;



import java.lang.instrument.Instrumentation;
import java.util.logging.Logger;

public class SampleAgent {
	
	 private static final Logger log = Logger.getLogger(SampleAgent.class.getName());

    public static void premain(String agentArgs, Instrumentation inst) {
       
    	  log.info("Starting Java Agent......");
    }

    public static void agentmain(String agentArgs, Instrumentation inst) {
       
        String className = "sample.SampleAgent";
        transformClass(className,inst);
    }

    private static void transformClass(String className, Instrumentation instrumentation) {
    	return ;
    }

}




