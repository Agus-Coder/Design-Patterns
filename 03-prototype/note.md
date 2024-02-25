# Prototype Pattern
This is an easy one. The problem that solves this pattern is the object copying.

The idea is to be able to clone objects without any extra dependency. How is this?

Not all objects can be copied field by field, because it can have a private fields that are invisible for us. Here arises that denedency, because we need to know the object's class to create a duplicate, the code become class-dependant.

## how it works

The prototype Pattern delegates the cloning process to the actual objects that we want to clone.
### Outside javascript
This patterns declares a common interface for all objects that support cloning, with that interface, we can clone any object.
The method creates an object of the current class and carries over all of the field values of the old object into the new one. we can copy even private fields.
And the important: An opbject that supports cloning is called a prototype.

When we need an object like the one configured, we judt clone it.

### Javascript
Everything in javascript has a prototype