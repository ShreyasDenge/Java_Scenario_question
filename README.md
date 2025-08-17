# Java_Scenario_Questions

A class called Customer is given to you.

The task is to find the applicable Credit card Type and create CardType object based on the Credit Points of a customer.

Define the following for the class.

Attributes:
customerName: String, private
credil Paints: int, privale

Constructor:
parameterizedConstructor: for both cusotmerName & creditPoints in that order.

Methods:
Name of the method getCreditPoints
Return Type: int
Modifier public
Task: this method must return credit Points

Name of the method: toString, Ovende it.
Task: return only customerName from this.
Return Type: Suing

Create another class called CardType. Define the following for the class

Attributes:
customer: Customer, private
cardlype: String, pnvate

Constructor:
parameterized Constructor: for customer and cardType attributes in that order

Methods:
Name of the method: toString Override this.
Return type: String
Modifier: public
Task: Return the string in the following format.
  The Customer 'Rajeev' is Lligible 1 or 'Gold' Card.

Create One more class by name CardsOnOffer and define the following for the class.

Method:
Name Of the method: getOftenedCard
Return type: CardType
Modifiers: public, static
Parameter: Customer object
Task: Create and return a Card Type object after logically finding cardtype from creditPoints as per the below rules.

CreditPoints    cardType
100-500           Silver
501-1000          Gold
1000 >            Platinum
< 100             EMI

Create an LLC class which contains Main method to test the working of the above.
