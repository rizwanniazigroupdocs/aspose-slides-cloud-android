# Aspose.Slides Cloud SDK for Android
This repository contains Aspose.Slides Cloud SDK for Android source code. This SDK allows you to work with Aspose.Slides Cloud REST APIs in your Android applications.

## Key Features
* Conversion between various document-related formats (20+ formats supported), including PDF<->PowerPoint conversion
* Download slides and shapes in various formats, including PDF and SVG
* Merge and split PowerPoint presentations
* Access PowerPoint presentation metadata and statistics
* Find and replace
* Full read & write access to Document Object Model, including slides, shapes, paragraphs, portions and many others
* Support of Aspose.Storage API

## Licensing
All Aspose.Slides Cloud SDKs are licensed under MIT License.

## How to use the SDK?
The complete source code is available in this repository folder. You can either directly use it in your project via source code or get [Jar](https://repository.aspose.cloud/repo/com/aspose/aspose-slides-cloud-android/) (recommended).

## Prerequisites
To use Aspose Slides Cloud SDK for Android you need to register an account with [Aspose Cloud](https://www.aspose.cloud/) and lookup/create App Key and SID at [Cloud Dashboard](https://dashboard.aspose.cloud/#/apps). There is free quota available. For more details, see [Aspose Cloud Pricing](https://purchase.aspose.cloud/pricing).

### Installation

Add this lines to your build.gradle:

```gradle

allprojects {
    repositories {
        ...
        maven {
            url "http://artifact.aspose.cloud/repo/"
        }
    }
}

dependencies {
    ...
    implementation 'com.aspose:aspose-slides-cloud-android:19.12.0'
    implementation 'com.google.code.gson:gson:2.8.1'
    implementation 'com.squareup.okhttp:okhttp:2.7.5'
    implementation 'com.squareup.okhttp:logging-interceptor:2.7.5'
    implementation 'io.swagger:swagger-annotations:1.5.15'
    implementation 'org.threeten:threetenbp:1.3.5'
    implementation 'org.reflections:reflections:0.9.11'
}
```
### Sample usage

The example code below converts a PowerPoint document to PDF format using aspose-slides-cloud-android library:
```java
        Configuration configuration = new Configuration();
        configuration.setAppSid("MyAppSid");
        configuration.setAppKey("MyAppKey");
        SlidesApi api = new SlidesApi(configuration);
	PostSlidesConvertRequest request =  new PostSlidesConvertRequest();
        request.setFormat(ExportFormat.PDF);
        request.setDocument(Files.readAllBytes(Paths.get("MyPresentation.pptx")));
        File response = api.postSlidesConvert(request);
        System.out.println("My PDF was saved to " + response.getPath());
```
You can also check [android-demo-app](Demo Application).

## Contact Us

Your feedback is very important to us. Please feel free to contact us using our [Support Forums](https://forum.aspose.cloud/c/slides).

## Resources
 
[Website](https://www.aspose.cloud/)  
[Product Home](https://products.aspose.cloud/slides/family)  
[API Reference](https://apireference.aspose.cloud/slides/)  
[Documentation](https://docs.aspose.cloud/display/slidescloud/Home)  
[Blog](https://blog.aspose.cloud/category/slides/)  
 
## Other languages

We generate our SDKs in different languages so you may check if yours is available in our [list](https://github.com/aspose-slides-cloud).
 
If you don't find your language in the list, feel free to request it from us, or use raw REST API requests as you can find it [here](https://products.aspose.cloud/slides/curl).
