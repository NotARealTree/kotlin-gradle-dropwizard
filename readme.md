# Kotlin Dropwizard

I recently started using Kotlin instead of Java for my "hobby programming" tasks. I found some examples on the web about
using Kotlin with Dropwizard but figured it'd be nice to provide something that works for my preferences. This template
is quite opinionated but should be easy to adjust for personal preferences / needs.

This repo uses gradle for dependency management, as well as for creating runnable "fat" jars (the preferred jar format
for [dropwizard](http://www.dropwizard.io/1.1.0/docs/getting-started.html#building-fat-jars)). 

## Commands

The commands in the following section explain how to develop, build and run this project. Adjust `example.yml` as
applicable to your config file.

### Development

To run the server for developing you can execute the following gradle command, either in Intellij (which works very well
for Kotlin development) or directly from the command line:

```
./gradlew run -Dexec.args="server example.yml"
```

### Build

To build a fat jar, run the following command:

```
./gradlew shadowJar
```
The output file will be written to `build/libs/jarname.jar`

### Run

To run the built jar, run the following command

```
java -jar jarname.jar server configname.yml
```