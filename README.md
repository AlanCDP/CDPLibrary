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
	        compile 'com.github.AlanCDP:CDPLibrary:v1.0'
	}
	
	
	
• 在自己的gradle里 要加上以下代码 用来支持realm数据库，和防止support包冲突
Plugin


    apply plugin: 'realm-android'
    
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
