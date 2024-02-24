Generally speaking, a proxy means a stand-in for someone else. Instead of speaking to that person directly, you’ll speak to the proxy person who will represent the person you were trying to reach. The same happens in JavaScript: instead of interacting with the target object directly, we’ll interact with the Proxy object.

Instead of interacting with this object directly, we want to interact with a proxy object. In JavaScript, we can easily create a new proxy by creating a new instance of Proxy.


const person = {
  name: "John Doe",
  age: 42,
  nationality: "American",
};

const personProxy = new Proxy(person, {});

The second argument of Proxy is an object that represents the handler. So, for example:

const personProxy = new Proxy(person, {
  get: (obj, prop) => {
    console.log(`The value of ${prop} is ${obj[prop]}`);
  },
  set: (obj, prop, value) => {
    console.log(`Changed ${prop} from ${obj[prop]} to ${value}`);
    obj[prop] = value;
  },
});

explanation on the code itself.

### Reflect

Javascript has a built-in object that which makes easier to manipulate the target object:

const personProxy = new Proxy(person, {
  get: (obj, prop) => {
    console.log(`The value of ${prop} is ${Reflect.get(obj, prop)}`);
  },
  set: (obj, prop, value) => {
    console.log(`Changed ${prop} from ${obj[prop]} to ${value}`);
    Reflect.set(obj, prop, value);
  },
});



For other languages, like java, a proxy pattern has 3 parts:

1. Subject: The common interface or abstract class shared by the RealSubject and Proxy
2. RealSubject:  the real object that the Proxy represents.
3. Proxy: The Proxy class maintains a reference to the RealSubject and provides an interface identical to the Subject interface. It controls access to the RealSubject and may perform additional tasks such as logging, caching, or lazy initialization before delegating the request to the RealSubject.


Proxy pattern 
Pros:
Controlled Access
Lazy Initialization
Enhanced Functionality
Remote Proxies
Simplified Interface

Cons:
Increased Complexity
Reduced Performance
Potential Overhead
Tight Coupling
Security Risks