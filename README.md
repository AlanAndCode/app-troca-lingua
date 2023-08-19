# app-troca-lingua

In this app we aim to create support in another language for a phrase
creating three buttons and using binding, each click translates "hello world" to english, spanish or portuguese
## Binding
The View Binding is configured per module of an Android project, so inside the App module's build.gradle file

##we add the following statement:
```
android {
    ...
    buildFeatures {
        viewBinding true
    }
}
