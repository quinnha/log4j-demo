# log4j-demo
Simple project demonstrating capabilities of Apache log4j as a proof of concept for the McMaster NEUDOSE logging system onboard the CubeSat.

The project simply calls on multiple appenders to log messages to different files (or console). The configuration document can be found in src/main/resources/log4j.properties. Due to limitations of log4j, all appenders are attached to the root logger, and "categorized" to be used independantly. 

## Pictures
Log Files

![Log Files](https://github.com/quinnha/log4j-demo/blob/main/cdh_eps_log_file.PNG)

Console Logger

![Console Logger](https://github.com/quinnha/log4j-demo/blob/main/console_logger.PNG)
