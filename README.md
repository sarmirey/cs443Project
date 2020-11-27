# cs443Project

## About 
- Android App for a pet clinic that has user authentication, vet services, adoption services, and game content where user can win a prize

### Tech Stack: 
   - Android Studios
   - Java
   - XML

## SetUp:
   - Download my application to your own PC. 
   - Save it in a location on your PC. Open Android Studios. 
   - Click Open existing file using my application. 
   - The building of the project should start happening. 
   - Rebuild the project just in case. 
   - Open up the emulator. 
   - If you don't have one, I would recommend to install PIXEL 2 XL API 27. 
   - Start running through the app and follow my ProjectReport. 

## Settings: 
android {
    compileSdkVersion 28
    defaultConfig {
        applicationId "com.example.sarmirey.myapplication"
        minSdkVersion 19
        targetSdkVersion 28
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

