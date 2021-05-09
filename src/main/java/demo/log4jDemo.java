package demo;

import org.apache.log4j.Logger;

public class log4jDemo {

    static Logger cdh_logger = Logger.getLogger("CDH_Logger");
    static Logger eps_logger = Logger.getLogger("EPS_Logger");
    static Logger console_logger = Logger.getLogger("Console_Logger");

    public static void main(String[] args) {

        String log_string = "";

        for (int i = 0; i <10; i++){
            if (i % 2 == 0){
                log_string = "The number is even: " + i;
                cdh_logger.debug(log_string);
            }
            else {
                log_string = "The number is odd: " + i;
                eps_logger.error(log_string);
            }
            log_string = "Number: " + i;
            console_logger.info(log_string);
            log_string = "";
        }

    }
}
