# PDF Viewer App in Kotlin

   An Android application for viewing (reading) a PDF File (Portable Document Format) using Kotlin Programming Language. “PDF Viewer” app provides an environment to open PDF documents the feature of viewing a PDF file in WebView, from Internal Storage, Asset and over the Internet. “PDF Viewer” is an independent standalone application which can easily run an any android platform without required prerequisites or plugins. In PDF viewer we can see the documents directly. Hence, it is an open platform for viewing a pdf document.
   The main purpose of this application is to let the user view (read) a PDF document at an instance without use of any desktop office packages. Here we can view a PDF through an Android based mobile phone at anywhere with the use of this application.

## About this Project  
This project contains a sample app that shows how to open a PDF file in Android application programmatically. We will build the following in this project:  
* Open PDF in WebView: WebView is a view that display web pages inside your application. WebView makes turns your application to a web application. The WebView class is an extension of Android's View class that allows to display web pages as a part of your activity layout. So, we can use WebView to load a PDF inside the app by providing the URL of the PDF.
* Open PDF from the assets folder using the AndroidPdfViewer library: When a PDF file is opened, it has to be opened by an external application such as Drive or another app which can render PDF. In order to do that the file has to be copied to a public location first and then an Intent to open it has to be created. Assets folder helps to bundle file with the application such as user guide, etc.
* Open PDF from the phone storage using the AndroidPdfViewer library: Lets the user to read a PDF from local storage by providing the option to select a PDF from local storage (internal storage).
* Download file from the internet using the PRDownloader library and then open that file using the AndroidPdfViewer library: This allows the user to view a PDF file over the internet after downloading it by providing the URL of the document.

## Snapshots
### Splash Screen
<br><img src="https://user-images.githubusercontent.com/89018772/192088644-dc7facd8-3894-4394-b57a-cf21c683838d.png" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="415" height="860" /><br>
### Main Activity
<br><img src="https://user-images.githubusercontent.com/89018772/192088650-8ee4f1b8-eb38-4adc-b806-b46d4f1715fb.png" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="415" height="860" /><br>
### Web View Activity
<br><img src="https://user-images.githubusercontent.com/89018772/192088656-237f2c94-421f-4785-aa93-4cd7a265b0cd.png" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="415" height="860" /><br>
### View from Storage
<br><img src="https://user-images.githubusercontent.com/89018772/192088659-4d9d502c-ad8f-40dd-8132-7a5182196f93.png" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="415" height="860" /><br>
<img src="https://user-images.githubusercontent.com/89018772/192088660-6f249649-4667-4a63-8753-96f0e2970298.png" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="415" height="860" /><br>
### View from Asset
<br><img src="https://user-images.githubusercontent.com/89018772/192088665-e4e93677-7728-40fa-9de9-39e66fa9088c.png" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="415" height="860" /><br>

