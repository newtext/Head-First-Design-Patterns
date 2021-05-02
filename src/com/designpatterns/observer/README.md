# Observer Pattern

The <b> Observer Pattern </b> defines a one-to-many dependency between objects so that 
when one object changes state, all of its dependents are notified and updated automatically.

You can implement your own Observer class or use Java util of Observer and Observable

Extend Observable to mark the class as the subject 
1. notifyObservers()
2. setChanged()
3. addObserver(Observer o)
4. deleteObserver(Observer o)

Implements Observer to mark the class that will be subscribing to a subject
- You will need to pass the Observable class to the class that implemented Observer to add the class to the subject
    -       public Constructor of the Class(Observable observable) {
                observable.addObserver(this);
            }
- This method of the Observer will be called/notified whenever the Observable class has call notifyObservers()       
    -       public void update(Observable observable, Object arg) {
                if (observable instanceof Subject Class) {
                    ...
                    Logic of the Observer
                    ...
                    Can also call class's Method();
                }
            }
