# Salesforce--Java
Prerequiste
1) Install force-WSC.jar
    https://repo1.maven.org/maven2/com/force/api/force-wsc/48.0.0/force-wsc-48.0.0.jar
2) Tool.jar
    located in your local system 
      Java/jdk-xxx/lib/tools.jar
3) Antlr.jar
   https://www.antlr.org/download/antlr-4.7.2-complete.jar
4) enterprise Jar
    Need to generate buy using above given jar files
5) WSDL file Steps

    a) go to salesforce org -> setup -> in Quick Find enter "API" -> click on API -> click on "Generate Enterprise WSDL" -> click on   "Generate"
 
    b) one XML file will be open in your browser and save that file as per below given name
          "enterprise.wsdl.xml"
          ![Screenshot_1](https://github.com/Patelsujeet/Salesforce---Java/blob/master/Screenshot_1.png)

#### Steps to Generate enterprise.jar file

    1) Create one folder with salesforce WSC (Name would be as per you wish)
    2) Copy the above given jar files and paste in that folder.
        folder hierarchy:
       > WSC
         |
         |__force-wsc-48.0.0.jar (Download from given link)
         |__tools.jar (Copy from Java/jdk.xx.yy/lib/tools.jar)       
         |__antlr-4.7.2-complete.jar
         |__enterprise.wsdl.xml
       
       Note: All jar and enterprise.wsdl.xml file must be in same folder

    3) Run the below given command in your cmd.
``` 
java -classpath force-wsc-48.0.0.jar;tools.jar;antlr-4.7.2-complete.jar com.sforce.ws.tools.wsdlc enterprise.jar
```
    
   ![Screenshot_2](https://github.com/Patelsujeet/Salesforce---Java/blob/master/Screenshot_2.png)
   
     4) 
        
        
