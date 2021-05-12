# Factory Pattern

All factory patterns encapsulate object creation. The Factory Method Pattern encapsulates object
creation by letting subclasses decide what objects to create.

The Factory Method Pattern defines an interface
for creating an object, but lets subclasses decide which
class to instantiate. Factory Method lets a class defer
instantiation to subclasses.

#### The Creator Classes
    1. PizzaStore -> createPizza() and orderPizza()
        - NYPizzaStore ->       createPizza() method is our factory method 
                                that will create the products
        - ChicagoPizzaStore ->  createPizza() method is our factory method 
                                that will create the products

This allows the flexibility of allowing each pizza store or franchise to get its own class store

#### The Product Classes
    1. Pizza - Factories produce products and Listed below are concrete Products
        - NYStyleCheesePizza            - ChicagoStyleCheesePizza
        - NYStylePepperoniPizza         - ChicagoStylePepperoniPizza
        - NYStyleClamPizza              - ChicagoStyleClamPizza
        - NYStyleVeggiePizza            - ChicagoStyleVeggiePizza

#### Factory Method Pattern Defined
    Product                 Creator
                            -factoryMethod()
                            -anOperation()
    ↑                       ↑
    ConcreteProduct    <-   ConcreteCreator
                            -factoryMethod()

1. The intent of Factory Method is to allow a class to defer instantiation to its subclasses.
2. The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes.
3. All factory patterns promote loose coupling by reducing the dependency of your application on concrete classes.
4. Factory Method relies on inheritance: object creation is delegated to subclasses, which implement the factory method to create objects.
