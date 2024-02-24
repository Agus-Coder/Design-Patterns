# Prototype Pattern
This is an easy one. The problem that solves this pattern is the object copying.

The idea is to be able to clone objects without any extra dependency. How is this?

Not all objects can be copied field by field, because it can have a private fields that are invisible for us. Here arises that denedency, because we need to know the object's class to create a duplicate, the code become class-dependant.

## how it works

The prototype Pattern delegates the cloning process to the actual objects that we want to clone. 