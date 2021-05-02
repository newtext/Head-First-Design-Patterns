# Decorator Pattern

The Decorator Pattern attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.

1. We start with our DarkRoast object.
2. The customer wants Mocha, so we create a Mocha object and wrap it around the DarkRoast.
3. The customer also wants Whip, so we create a Whip decorator and wrap Mocha with it.
4. Now it’s time to compute the cost for the customer. We do this by calling cost() on the outermost decorator, Whip, and Whip is going to
   delegate computing the cost to the objects it decorates.
   - Basically reverse linked list of the DarkRoast object
        - Whip -> Mocha -> Dark Roast
        - Whip will call Mocha's cost then Mocha will call Dark Roast call
        -       public double cost() {
                    return beverage.cost() + .15;
                }
    
Decorator classes mirror the type of the components they decorate.