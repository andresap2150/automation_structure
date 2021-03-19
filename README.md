# Automation Structure

This is a demo for the selection process of 10pearls.

It uses Java 8 as a main programming language with Maven for dependencies management, it uses TestNG as a testing framework, also uses selenium as a web driver and Cucumber for the definition of the test using gherkin for BDD

## Installation

You need to have maven installed

```bash
maven install
```

## how to run

A system property should be handed if you want to run in a Browser different from Chrome
```bash
maven test -DBROWSER = FIREFOX
```