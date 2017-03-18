# Kata01: Supermarket Sweep

A solution to [Kata01: Supermarket Pricing](http://codekata.com/kata/kata01-supermarket-pricing).

## Background

c.f. [Code Kata01](http://codekata.com/kata/kata01-supermarket-pricing)

Since the client did not specify concrete requirements, some liberty has been taken in writing the 
user stories.

The client in this case is a supermarket organisation wanting the ability to manage stock, pricing
and promotional offers on the goods they sell in the store.

There are different types of users in the supermarket (store clerk, manager, deparmental manager etc.)
However for this project they will all be classed as : "Supermarket user".

## Requirements


### Domain

```
A Supermarket has:

    Stock which is made up of:
           Products which have a
                -- Name
                -- Price
           Quantities
    
    Promotions and Discounts
    
    Employees
```

### User Stories

As a Supermarket user in the domain of `Stock`:

- I can add, update or delete products on the store's stock list.
- Update the quantity of a specific product in the stock list (increase / decrease item quantity).
- View a current list of stock in the store.

As a Supermarket user in the domain of `Product`:

- View information on a product
- I can view the price of a particular product
- Update the price of a product

As a Supermarket user in the domain of `Promotions`:

- View a list of promotions that are active
- I can add, update or delete a promotion

## Implementation

The Supermarket service will use Dropwizard to serve information

## Building and Running

1. Run `mvn clean compile` to compile the application.
1. Run `mvn exec:java` to start the server. The server will use the `config.yml` configuration file.
1. Visit URL `http://localhost:8080` in your browser for the service homepage.
 
    