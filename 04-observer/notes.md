# Observer Pattern
With this pattern we can subscribe certain objects, the observers, to another object, called the observable.
Whenever an event occurs, the observable gets notified.

For example: in facebook we, users, are the observers.

Parts:
Observers: An array of observers that will get notified over specific events.
subscribe(): a method in order to add observers to the observers list.
unsubscribe(): another method so that any observer get removed from the observers list.
notify(): A method to notify all observers over a specific event when ir occurs.

## Pros

Observer pattern  is a great way to enforce sparation of concerns and the single-responsibility principle. The observers objects aren't tightly coupled to the observable object, and can be (de)coupled at any time. The observable object is responsible for monitoring the events, while the observers simply handle the received data.

##

## Video
Definition
"The observer pattern defines a one to many dependency between objects so that when 1 object changes state, all of its dependencies are notified and updated automatically"
Observable is sometimes referred to as subject.