# Questions : 
1. mvn documentation, packages. 
2. mvn /target folder. 
3. src/main/test   
4. mvn lifecycle phases

```
{
   "lifecycles": {
     "default": {
       "phases": [
         "validate",
         "initialize",
         "generate-sources",
         "process-sources",
         "generate-resources",
         "process-resources",
         "compile",
         "process-classes",
         "generate-test-sources",
         "process-test-sources",
         "generate-test-resources",
         "process-test-resources",
         "test-compile",
         "process-test-classes",
         "test",
         "prepare-package",
         "package",
         "pre-integration-test",
         "integration-test",
         "post-integration-test",
         "verify",
         "install",
         "deploy"
       ]
     },
     "clean": {
       "phases": [
         "pre-clean",
         "clean",
         "post-clean"
       ]
     },
     "site": {
       "phases": [
         "pre-site",
         "site",
         "post-site",
         "site-deploy"
       ]
     }
   },
   "plugins": [
     "Maven provides a wide range of plugins for various tasks such as compiling code, running tests, packaging artifacts,
 deploying to servers, generating documentation, and more. Some popular plugins include the Compiler Plugin, Surefire Plugin
 Javadoc Plugin, Assembly Plugin, and Deploy Plugin, among many others."
   ]
 }
```

