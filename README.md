minimal example for https://youtrack.jetbrains.com/issue/KT-40964

for kotlin.js.compiler=legacy everything works just fine

**Steps to reproduce:** 

*  ./gradlew build
*  node build/js/packages/myproject-app/kotlin/myproject-app.js

**What happens:** 

```
  var ProcessEnv = NodeJS.ProcessEnv;
                   ^

ReferenceError: NodeJS is not defined
    at /Users/shagen/job/bugreport/KT-40964/gradle-cache-action/build/js/packages/myproject-app/kotlin/myproject-app.js:12:20
    at /Users/shagen/job/bugreport/KT-40964/gradle-cache-action/build/js/packages/myproject-app/kotlin/myproject-app.js:5:5
    at Object.<anonymous> (/Users/shagen/job/bugreport/KT-40964/gradle-cache-action/build/js/packages/myproject-app/kotlin/myproject-app.js:11:2)
    at Module._compile (internal/modules/cjs/loader.js:1151:30)
    at Object.Module._extensions..js (internal/modules/cjs/loader.js:1171:10)
    at Module.load (internal/modules/cjs/loader.js:1000:32)
    at Function.Module._load (internal/modules/cjs/loader.js:899:14)
    at Function.executeUserEntryPoint [as runMain] (internal/modules/run_main.js:71:12)
    at internal/main/run_main_module.js:17:47
```     

**What is supposed to happen:**

Code should run without any problems.
