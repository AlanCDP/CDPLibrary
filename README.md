# CDPLibrary
小试牛刀
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	         compile 'com.github.AlanCDP:CDPLibrary:2.0.1'
	}compile
	
	
	

    
防止support包冲突

    configurations.all {
         resolutionStrategy.eachDependency { DependencyResolveDetails details ->
             def requested = details.requested
            if (requested.group == 'com.android.support') {
                if (!requested.name.startsWith("multidex")) {
                    details.useVersion '26.0.0-alpha1'//此处的版本号可以替换
                }
            }
        }
    }
by CW
