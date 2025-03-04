# Java Coding Tests

![example workflow](https://github.com/tomaytotomato/coding-tests/actions/workflows/build.yml/badge.svg)

This repository contains all Java coding challenges I have worked on
for fun, job applications or hack-days.

The hope is that it will be of use for people and will save me time having to redo the same
tests over and over again

All solutions use Java 8.

### Structure

Each solution is contained as a maven module with the appropriate name and directory structure

### Build

Checkout the repository using git clone

Use `maven clean compile` to build all modules

### Methodology

When writing these projects if there is complex requirements I will note them in a docs.md file in
the app directory with the requirements, domains etc.

After that I will generate a maven basic app and start writing skeleton classes with empty method
bodies.

Then I will start writing unit tests that fail, then function by function I will write the code to
pass those unit tests in the Red, Green, Refactor process.

### Tags

kata, code, java, fizzbuzz, creditcard, ocr, powerof2, fibonacci