# Credit Card App

As a bank user

I want to be able to validate credit card numbers of type Mastercard

So that I can authenticate and check the legitimacy of the card


## Requirements

Card length is 16 digits all numeric
> 5248 6832 9898 1253

Card must be held within its own object type

### Validation Steps

----

Get the sum of digits on odd index

> (5)-(4)- (6)-(3)- (9)-(9)- (1)-(5)-

*Sum X* = 41

Luhn algorithm for digits on even index positions

c.f. https://en.wikipedia.org/wiki/Luhn_algorithm

> ^2^8 ^8^2 ^8^8 ^2^3

Multiply digits
> ^4^16 ^16^4 ^16^16 ^4^6

If double digits get product of split numbers e.g. 16 -> 1 + 6 = 7

> ^4^7 ^7^4 ^7^7 ^4^6

*Sum Y* = 46


A valid Mastercard will have X + Y as a multiple of 10

> X + Y % 10 = 0

----

Validation must be extensible in the future for other types of cards e.g. American Express, Visa

