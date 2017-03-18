# Java Coding Tests

[![Build Status](https://travis-ci.org/bat26/coding-tests.svg?branch=master)](https://travis-ci.org/bat26/coding-tests)

This repository contains all Java coding challenges I have worked on
for fun, job applications or hack-days.

The hope is that it will be of use for people and will save me time having to redo the same
tests over and over again

All solutions use Java 8 API along with JUNIT

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
pass those unit tests (TDD).

### Projects

`fizzbuzz` - simple Java app that iterates from 0 --> n and prints out Fizz, Buzz or FizzBuzz depending 
on whether the number is a multiple of 3,5 or both respectively.

`creditcards` - app that validates a Mastercard number 

`kaa01` - supermarket api service **In progress**

`powerOf2` - prints out all powers of 2 and calculates the sum of powers


### Tags

kata, code, java, fizzbuzz, creditcard, powerof2