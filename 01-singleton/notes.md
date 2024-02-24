##Tradeoffs

Restricting the instantiation to just one instance could potentially save a lot of memory space. Instead of having to set up memory for a new instance each time, we only have to set up memory for that one instance, which is referenced throughout the application. However, Singletons are actually considered an anti-pattern, and can (or.. should) be avoided in JavaScript.

In many programming languages, such as Java or C++, it’s not possible to directly create objects the way we can in JavaScript. In those object-oriented programming languages, we need to create a class, which creates an object. That created object has the value of the instance of the class, just like the value of instance in the JavaScript example.

However, the class implementation shown in the examples above is actually overkill. Since we can directly create objects in JavaScript, we can simply use a regular object to achieve the exact same result. Let’s cover some of the disadvantages of using Singletons!

Testing
All testing relies on a single instance. Therefore, after each test we must reset the instance because each test makes a modification over the single instantation.

Example:


test("incrementing 1 time should be 1", () => {

  Counter.increment();

  expect(Counter.getCount()).toBe(1);

});


test("incrementing 3 extra times should be 4", () => {

  Counter.increment();

  Counter.increment();

  Counter.increment();

  expect(Counter.getCount()).toBe(4);

});

##Dependency Hiding
What if antoher class calls the singleton? well, in this case, the singleton gets intantiated more than once and we can accidentally modify
all its value, which could lead to unexpected behaviour.


##Global behaviour
A singleton should be able to get referenced throughout the entire app, like a global variable.
In ES2015, creating global variables is fairly uncommon. The new let and const keyword prevent developers from accidentally polluting the global scope.

however, the common usecase for a singleton is to have some sort of global state throughout the application.

//   The idea is that a singleton works as a global controller?   //

Usually, certain parts of the codebase modify the values within global state, whereas others consume that data. The order of execution here is important: we don’t want to accidentally consume data first, when there is no data to consume (yet)! Understanding the data flow when using a global state can get very tricky as your application grows, and dozens of components rely on each other.


Video comments:
"Many people argue that you should not use the singleton pattern"